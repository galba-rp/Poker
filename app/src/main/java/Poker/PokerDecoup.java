package Poker;

import java.util.HashSet;
import java.util.Set;

public class PokerDecoup {

    public static String[] inputFormatter(String[] args){
        String arg = args[0];
        arg = arg.replaceAll("-", "");
        String[] string = arg.split("");
        return string;
    }

    public static void main(String[] args) {
        Set<String> colorsSet = new HashSet<>();
        Set<String> valuesSet = new HashSet<>();
        String[] string = inputFormatter(args);

        for(int i = 0; i < string.length; i++){
            if((i+2) % 2 == 0){
                valuesSet.add(string[i]);
            } else {
                colorsSet.add(string[i]);
            }
        }

        if(colorsSet.size() == 1){
            System.out.println("Couleur");
        } else if(valuesSet.size() < 5){
            System.out.println("Paire");
        } else {
            System.out.println("Rien");
        }
    }
}
