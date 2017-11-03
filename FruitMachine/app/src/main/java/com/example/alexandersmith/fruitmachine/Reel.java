package com.example.alexandersmith.fruitmachine;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by alexandersmith on 03/11/2017.
 */

public class Reel {

    ArrayList<ReelSymbol> symbols;

    public Reel() {
        symbols = new ArrayList<>();
        makeReel();
    }

    private void makeReel(){
        for (ReelSymbol reelSymbol: ReelSymbol.values()){
            symbols.add(reelSymbol);
        }
    }

    public ArrayList<ReelSymbol> getSymbols() {
        return symbols;
    }

    public int getNumberOfSymbols(){
        return symbols.size();
    }

    public ReelSymbol getSymbolAtIndex(int index){
        return symbols.get(index);
    }

    public int getRandomNumber(){
        Random rand = new Random();
        int listSize = getNumberOfSymbols();
        int random = rand.nextInt(listSize);
        return random;
    }

    public ReelSymbol spin(){
        int index = getRandomNumber();
        ReelSymbol result = getSymbolAtIndex(index);
        return result;
    }
}
