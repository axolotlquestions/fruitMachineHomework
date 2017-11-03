package com.example.alexandersmith.fruitmachine;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

/**
 * Created by alexandersmith on 03/11/2017.
 */
public class ReelTest {

    Reel reel;

    ReelSymbol reelSymbol;

    @Before
    public void setUp() throws Exception {
    reel = new Reel();
    }


    @Test
    public void reelSymbolHasName(){
        reelSymbol = ReelSymbol.BANANA;
        assertEquals("Banana", reelSymbol.getName());
    }

    @Test
    public void reelsymbolHasValue(){
        reelSymbol = ReelSymbol.BANANA;
        assertEquals(5, reelSymbol.getValue());
    }


    @Test
    public void testReelhasSymbols(){
        assertEquals(6, reel.getNumberOfSymbols());
    }

    @Test
    public void testCanGetSymbolatIndex(){
        assertEquals("Bar", reel.getSymbolAtIndex(0).getName());
    }

    @Test
    public void canSpin(){
        Reel spy = Mockito.spy(new Reel());
        Mockito.when(spy.getRandomNumber()).thenReturn(1);
        ReelSymbol answer = spy.spin();
        assertEquals(9, answer.getValue());
    }



}