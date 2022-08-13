package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape {

    private final String shapeName;
    private final double side;
    private final double lenght;

    public Triangle(String shapeName, double side, double lenght) {
        this.shapeName = shapeName;
        this.side = side;
        this.lenght=lenght;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getField() {
        return side*lenght/2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.side,side) == 0 && Double.compare(triangle.lenght,lenght) == 0 && shapeName.equals(triangle.shapeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shapeName,side,lenght);
    }
}