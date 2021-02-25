package Poker;

import java.util.ArrayList;

public class Deal extends Deck{

    private static int numberOfPlayers;
    private static ArrayList<Hand> hands;
    private static ArrayList<Card> deck;
    private static int cardsDealt;

    Deal(){
        this.numberOfPlayers = Player.getPlayers().size();
        //this.hands = dealCards();
        this.deck = createDeck();
        this.cardsDealt = 0;
    }

    private static String formHand(){
        String handTemp = "";
        for(int j = 0; j < 5; j++){
            handTemp += deck.get(cardsDealt);
            cardsDealt++;
        }
        return handTemp;
    }
/*
    private  ArrayList<Hand> dealCards(){
        for(int i = 0; i < this.numberOfPlayers; i++){
            hands.add(new Hand(formHand(), Player.getPlayers().get(i)));
        }

        return hands;
    }

    public static ArrayList<Hand> getHands() {
        return hands;
    }

 */
}
