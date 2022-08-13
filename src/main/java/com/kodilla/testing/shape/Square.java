package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape {
    private final String shapeName;
    private final double sideSquare;

    public Square(String shapeName, double sideSquare) {
        this.shapeName = shapeName;
        this.sideSquare = sideSquare;
    }


    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getField() {
        return sideSquare*sideSquare;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.sideSquare,sideSquare) == 0 && shapeName.equals(square.shapeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shapeName, sideSquare);
    }
}