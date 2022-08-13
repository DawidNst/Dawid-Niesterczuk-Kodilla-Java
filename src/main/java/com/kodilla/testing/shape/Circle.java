package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape {

    private final String shapeName;
    private final double field;

    public Circle(String shapeName, double field) {
        this.shapeName = shapeName;
        this.field = field;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getField() {
        return 2.3*field*field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.field, field) == 0 && shapeName.equals(circle.shapeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shapeName, field);
    }
}