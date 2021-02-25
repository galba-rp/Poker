package Poker;

import java.util.ArrayList;

public class Player {
    private String name;
    static ArrayList<Player> players = new ArrayList<>();

   private Player(String name) {
        this.name = name;
    }

    public static void  addPlayers(String s){
        Player p = new Player(s);
        players.add(p);
    }

    public static ArrayList<Player> getPlayers(){
        return players;
    }

    public String getName(){
       return this.name;
    }

}
