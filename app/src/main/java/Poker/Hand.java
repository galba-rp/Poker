package Poker;

public class Hand {
    String hand;
    Player player;


    public Hand(String hand, Player player) {
        this.hand = hand;
        this.player = player;
    }

    public String getHand() {
        return hand;
    }

    public void setHand(String hand) {
        this.hand = hand;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
