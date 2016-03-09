package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Created by danielgoh on 3/3/16.
 */
public class BlackJack {

    public ArrayList<Card> deck;
    public Player player;
    public Dealer dealer;

    public int playerWin;

    public int dealerWin;

    public String gameStateString;



    public BlackJack() {
        buildDeck();
        player = new Player();
        dealer = new Dealer();
        gameStateString = "Game is running";
    }

    public void buildDeck() {
        deck = new ArrayList<Card>();
        for(int i = 1; i < 14; i++){
            deck.add(new Card(i,Suit.Clubs));
            deck.add(new Card(i,Suit.Hearts));
            deck.add(new Card(i,Suit.Diamonds));
            deck.add(new Card(i,Suit.Spades));
        }
    }
    public void setGameStateString(String state){
        gameStateString = state;
    }

    public void shuffle() {
        long seed = System.nanoTime();
        Collections.shuffle(deck, new Random(seed));
    }

    public void dealTwo() {
        for(int i = 0; i < 2; i++){
            dealer.hit(deck);
            player.hit(deck);
        }
    }



}
