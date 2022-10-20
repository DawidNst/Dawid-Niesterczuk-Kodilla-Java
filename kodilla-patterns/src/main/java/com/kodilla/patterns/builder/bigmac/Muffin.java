package com.kodilla.patterns.builder.bigmac;

public class Muffin {
    public static final String BUN = "bun";
    public static final String ROLL = "roll";
    private final String typeOfMuffin;

    public Muffin(String typeOfMuffin) {
        switch (typeOfMuffin) {
            case BUN, ROLL -> this.typeOfMuffin = typeOfMuffin;
            default -> throw new IllegalStateException("bun || roll");
        };
    }

}