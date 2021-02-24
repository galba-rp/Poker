package Poker;

import javax.swing.text.Caret;
import java.util.List;

public class Deck {
    final static int N = 52;
    private List<Card> deck;

    public Deck(){
        super();
        this.createDeck();
    }
    public List<Card> createDeck(){
        int i = 0;
        int j = 2;
       String[] s = Suits.getSuits();
        while(i < Suits.getSuits().length){
            while(j < 15){
                deck.add(new Card(j, s[i]));
            }
        }
        return deck;
    }
}
