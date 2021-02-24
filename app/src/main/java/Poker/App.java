
package Poker;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import java.util.*;

public class App {

    public static void main(String[] args) {
        //TODO crete class cards which will convert card names to numbers and will sort cards
        int i = 0;
        int counter = 0;
        String result = "";

        Multimap<String, String> valuesMap = ArrayListMultimap.create();
        Hand hand1 = new Hand(args[0]);
        result = hand1.handCombo();


        // converting Collection of strings to arrayList of integers and sorting for comparison

        // checking if cards in order
        if(colorsMap.keySet().size() == 1){
            int lastI = cValues.size() -1;
            counter = LaMain.valuesOrderCheck(cValues);
            if(counter > 0){
                result = "flush";
            }else if(cValues.get(lastI) == 14 ){
                result = "La quinte flush royale";
            }else  result = "La quinte flush";

        } else {
            int value = 0;
            switch (valuesMap.keySet().size()){
                case 2:
                    value = LaMain.sameValuesCheck(valuesMap);
                    result = (value == 0) ?"Le carre" : "Le full";
                    break;
                case 3:
                    value = LaMain.sameValuesCheck(valuesMap);
                    result = (value == 2) ? "La double paire" : " Le brelan";
                    break;
                case 4:
                    result = "La paire";
                    break;
                default:
                    System.out.println(cValues);
                    counter = LaMain.valuesOrderCheck(cValues);
                    System.out.println(counter);
                    if(counter == 0){
                        result = "La suite";
                    } else{
                        result  = "La carte haute";
                    }
            }
        }
        System.out.println(result);
    }
}
