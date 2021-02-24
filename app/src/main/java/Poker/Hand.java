package Poker;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Hand {
    private String hand;
    private Multimap<String, String> colorsMap;
    private Multimap<String, String> valuesMap;
    private ArrayList<Integer> cValues;

    public Hand(String args) {
        this.hand = args;
        this.colorsMap = ArrayListMultimap.create();
        this.valuesMap = ArrayListMultimap.create();
        this.cValues = new ArrayList<Integer>();
    }

    public String getHand() {
        return hand;
    }

    public String handCombo() {
        String combo = "";
        return combo;
    }

    private String[] handFormatting(String args) {
        String arg = args.replaceAll("-", "");
        String[] s = arg.split("");
        return s;
    }

    private String[] cardNamesToNumbers() {
        String[] s = this.handFormatting(this.hand);
        int j = 0;
        while (j < s.length) {
            switch (s[j]) {
                case "A":
                    s[j] = "14";
                    break;
                case "K":
                    s[j] = "13";
                    break;
                case "Q":
                    s[j] = "12";
                    break;
                case "J":
                    s[j] = "11";
                    break;
                case "T":
                    s[j] = "10";
                    break;
                default:
                    break;
            }
            j += 2;
        }
        return s;
    }

    private Multimap<String, String> createColorsMap() {
        String[] string  = cardNamesToNumbers();
        int i = 0;
        while (i < string.length) {
            colorsMap.put(string[i + 1], string[i]);
        }
        return colorsMap;
    }

    private Multimap<String, String> createValuesMap() {
        String[] string  = cardNamesToNumbers();
        int i = 0;
        while (i < string.length) {
            valuesMap.put(string[i], string[i+1]);
            i +=2;
        }
        return valuesMap;
    }
   // converting Collection of strings to arrayList of integers and sorting for comparison
    private ArrayList<Integer> sortValuesAscending(){
        Collection<String> cardValues = colorsMap.values();
        for(String numeric : cardValues)
        {
            cValues.add(Integer.parseInt(numeric));
        }
        return cValues;
    }
}
