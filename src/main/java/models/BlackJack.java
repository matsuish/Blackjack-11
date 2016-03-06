package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Created by danielgoh on 3/3/16.
 */
public abstract class BlackJack {

    public java.util.List<Card> deck = new ArrayList<>();
    public java.util.List<java.util.List<Card>> rows = new ArrayList<>();

    public int playerWin;

    public int dealerWin;

    public String gameStateString;

    public int money;
    public int playerBet;

    public BlackJack() {
        //Dealer
        rows.add(new ArrayList<Card>());
        //Player
        rows.add(new ArrayList<Card>());
        buildDeck();
        money = 100;
        gameStateString = "Game is running";
    }

    public void buildDeck() {
        for(int i = 1; i < 14; i++){
            deck.add(new Card(i,Suit.Clubs));
            deck.add(new Card(i,Suit.Hearts));
            deck.add(new Card(i,Suit.Diamonds));
            deck.add(new Card(i,Suit.Spades));
        }
    }

    public void shuffle() {
        long seed = System.nanoTime();
        Collections.shuffle(deck, new Random(seed));
    }

    public void dealTwo() {
        for(int i = 0; i < 2; i++){
            rows.get(i).add(deck.get(deck.size()-1));
            deck.remove(deck.size()-1);
        }
        for(int i = 0; i < 2; i++){
            rows.get(i).add(deck.get(deck.size()-1));
            deck.remove(deck.size()-1);
        }
    }



}
