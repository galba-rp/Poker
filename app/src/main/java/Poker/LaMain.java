package Poker;

import com.google.common.collect.Multimap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LaMain {

    public static int sameValuesCheck(Multimap valuesMap){
        int value = 0;
        for(Object key: valuesMap.keySet()){
            Collection values = valuesMap.get(key);
            if (values.size() == 2) value = 2;
        }
        return value;
    }

    public static int valuesOrderCheck(ArrayList<Integer> cValues){
        int counter = 0;
        for(int i = 1; i < cValues.size(); i++){
            if(cValues.get(i) != (cValues.get(i-1) + 1)) counter++;
            if(counter > 0) i = cValues.size();
        }
        return counter;
    }

    public static String[] cardNamesToNumbers(String[] string){
        int j = 0;
        while(j < string.length){
            switch (string[j]){
                case "A":
                    string[j] = "14";
                    break;
                case "K":
                    string[j] = "13";
                    break;
                case "Q":
                    string[j] = "12";
                    break;
                case "J":
                    string[j] = "11";
                    break;
                case "T":
                    string[j] = "10";
                    break;
                default: break;
            }
            j += 2;
        }
        return string;
    }

}
