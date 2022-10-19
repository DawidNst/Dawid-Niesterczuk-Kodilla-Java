package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String DRIVING_TASK = "DRIVING TASK";
    public static final String PAINTING_TASK = "PAINTING TASK";
    public static final String SHOPPING_TASK = "SHOPPING TASK";


    public final Task makeTask(final String taskClass){
        return switch (taskClass) {
            case DRIVING_TASK -> new DrivingTask("go to fish", "river", "car");
            case PAINTING_TASK -> new PaintingTask("flower", "white", "kitchen");
            case SHOPPING_TASK -> new ShoppingTask("supermarket", "appeal", 5);
            default -> null;
        };
    }
}