
package Poker;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import java.util.*;

public class App {

    public static void main(String[] args) {
        Hand hand1 = new Hand(args[0]);
        String result = hand1.getHighestCombo();

        System.out.println(result);
    }
}
