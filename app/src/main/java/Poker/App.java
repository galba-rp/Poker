
package Poker;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        String st = "3c-Jc-Kc-3c-Ac";
        Combo hand1 = new Combo(st);
        String result = hand1.getHighestCombo();
       // Deck d = new Deck();
        Player.addPlayers("Tom");
        Player.addPlayers("Jerry");
        new Deal();

        //System.out.println(d.createDeck().size());
        System.out.println(result);
        System.out.println(Player.getPlayers().get(1));

    }
}
