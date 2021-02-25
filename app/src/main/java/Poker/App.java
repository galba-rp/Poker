
package Poker;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import java.util.*;

public class App {

    public static void main(String[] args) {
        String st = "3c-Jc-Kc-3c-Ac";
        Hand hand1 = new Hand(st);
        String result = hand1.getHighestCombo();
        Deck d = new Deck();

        System.out.println(d.createDeck().size());
        System.out.println(result);
        System.out.println("result");
    }
}
