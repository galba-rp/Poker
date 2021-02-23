
package Poker;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import java.util.*;

public class App {

    public static void main(String[] args) {
        //TODO crete class cards which will convert card names to numbers and will sort cards

        String result = "";
        Multimap<String, String> colorsMap = ArrayListMultimap.create();
        Multimap<String, String> valuesMap = ArrayListMultimap.create();
        String arg = args[0];
        int i = 0;
        int j = 0;
        arg = arg.replaceAll("-", "");
        String[] string = arg.split("");

        // replacing Card Letters with numbers for sorting purposes
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

        while(i < string.length){
            colorsMap.put(string[i+1], string[i]);
            valuesMap.put(string[i], string[i+1]);
            i +=2 ;
        }

        if(colorsMap.keySet().size() == 1){
            // converting Collection of strings to arrayList of integers and sorting for comparison
            Collection<String> cardValues = colorsMap.values();
            ArrayList<Integer> cValues = new ArrayList<Integer>();
            for(String numeric : cardValues)
            {
                cValues.add(Integer.parseInt(numeric));
            }
            Collections.sort(cValues);
            System.out.println(cValues);

            // checking if cards in order
        } else {
            System.out.println("different colors : ");
        }

        System.out.println("colors : " + colorsMap);
        System.out.println("values : " + valuesMap);
        /*
        System.out.println(valuesMap);
        System.out.println("colors size : " + colorsMap.keySet().size());
        System.out.println("values size : " + valuesMap.size());

 */
    }
}
