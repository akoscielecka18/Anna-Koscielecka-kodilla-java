package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {
        switch(taskClass) {
            case SHOPPING:
                return new ShoppingTask("Food", "Milk", 3);
            case PAINTING:
                return new PaintingTask("Paint", "Blue", "Image");
            case DRIVING:
                return new DrivingTask("Afternoon", "For the match", "Car");
            default:
                return null;

        }
    }
}
