package models;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by danielgoh on 3/4/16.
 */
public class testDealer {

    @Test
    public void testGameCreation(){
        BlackJack g = new Dealer();
        assertNotNull(g);
    }

    @Test
    public void testGameBuildDeck(){
        BlackJack g = new Dealer();
        assertEquals(52,g.deck.size());
    }

    @Test
    public void testGameInit(){
        BlackJack g = new Dealer();
        g.shuffle();
        assertNotEquals(2,g.deck.get(0).getValue());
    }

    @Test
    public void testGameStart(){
        BlackJack g = new Dealer();
        g.shuffle();
        g.dealTwo();
        assertEquals(2,g.rows.get(0).size());
        assertEquals(2,g.rows.get(1).size());
    }


}
