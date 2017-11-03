package com.example.alexandersmith.fruitmachine;

import java.util.ArrayList;

/**
 * Created by alexandersmith on 03/11/2017.
 */

public class FruitMachine {

    private int bank;
    private int noOfReels;
    private ArrayList<Reel> reels;


    public FruitMachine(int noOfReels) {
        this.noOfReels = noOfReels;
        this.bank = 0;
        this.reels = new ArrayList<>();
        for (int i = 0; i < noOfReels; i++){
            reels.add(new Reel());
        }
    }

    public int getBank() {
        return bank;
    }

    public void addMoneyToBank(int money){
        bank += money;
    }

    public void payOut(int winnings){
        bank -= winnings;
    }

    public ArrayList<Reel> getReels() {
        return new ArrayList<>(reels);
    }

    public String compareReels(ReelSymbol firstReel, ReelSymbol secondReel, ReelSymbol thirdReel){
        if (firstReel == secondReel && firstReel == thirdReel){
            return "You're a winner!";
        }
        return "You lost";

    }

    public void playGame(){
        System.out.println("Good luck!");
        Reel reel = getReels().get(0);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ReelSymbol reel1result = reel.spin();
        System.out.println("First reel is " + reel1result.getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ReelSymbol reel2result = reel.spin();
        System.out.println("Second reel is " + reel2result.getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ReelSymbol reel3result = reel.spin();
        System.out.println("Third reel is " + reel3result.getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(compareReels(reel1result, reel2result, reel3result));
    }
}
