package com.example.alexandersmith.fruitmachine;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by alexandersmith on 03/11/2017.
 */
public class FruitMachineTest {

    FruitMachine fruitMachine;

    @Before
    public void before() {
        fruitMachine = new FruitMachine(3);
    }

    @Test
    public void bankStartsAtZero(){
        assertEquals(0, fruitMachine.getBank());
    }

    @Test
    public void canAddMoneytoMachine(){
        fruitMachine.addMoneyToBank(100);
        assertEquals(100, fruitMachine.getBank());
    }

    @Test
    public void canPayOut(){
        fruitMachine.addMoneyToBank(100);
        fruitMachine.payOut(50);
        assertEquals(50, fruitMachine.getBank());
    }

    @Test
    public void hasCorrectNumberOfReels(){
        assertEquals(3, fruitMachine.getReels().size());
    }

    @Test
    public void compareReelsWinner(){
        assertEquals("You're a winner!", fruitMachine.compareReels(ReelSymbol.BAR, ReelSymbol.BAR, ReelSymbol.BAR));
        assertEquals("You're a winner!", fruitMachine.compareReels(ReelSymbol.CHERRY, ReelSymbol.CHERRY, ReelSymbol.CHERRY));
    }

    @Test
    public void compareReelsLoser(){
        assertEquals("You lost", fruitMachine.compareReels(ReelSymbol.BANANA, ReelSymbol.BAR, ReelSymbol.BAR));
        assertEquals("You lost", fruitMachine.compareReels(ReelSymbol.STRAWBERRY, ReelSymbol.CHERRY, ReelSymbol.STRAWBERRY));
    }





}