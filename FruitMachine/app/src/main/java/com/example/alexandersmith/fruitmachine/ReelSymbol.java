package com.example.alexandersmith.fruitmachine;

/**
 * Created by alexandersmith on 03/11/2017.
 */

public enum ReelSymbol {

    BAR(10, "Bar"),
    SEVEN(9, "Seven"),
    BELL(8, "Bell"),
    CHERRY(7, "Cherry"),
    STRAWBERRY(6, "Strawberry"),
    BANANA(5, "Banana");

    private int value;
    private String name;

    ReelSymbol(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
