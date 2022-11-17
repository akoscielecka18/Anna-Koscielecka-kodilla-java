package com.kodilla.testing.shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Nested;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;

public class ShapeCollectorTestSuite {
    @BeforeClass
    public static void beforeAllTest() {
        System.out.println("Starting test process...");
    }

    @AfterClass
    public static void afterAllTest() {
        System.out.println("End of test.");
    }

    @Nested
    @DisplayName("Test for figures")
    class TestFigure{
        @DisplayName("Test if method addFigrure works")
        @Test
        void testAddFigure(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            //when
            Shape circle = new Circle();
            shapeCollector.addFigure(circle);
            //then
            Assertions.assertEquals(circle, shapeCollector.getFigure(0));
        }
        @DisplayName("Test if method removeFigure works")
        @Test
        void testRemoveFigure(){
            //given
            ShapeCollector shapeCollector = new ShapeCollector();
            //then
            Shape circle = new Circle();
            Shape square = new Square();
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(square);

            shapeCollector.removeFigure(square);
            //then
            Assertions.assertEquals(circle, shapeCollector.getFigure(0));

        }
        @DisplayName("Test if method getFigure works")
        @Test
        void testGetFigure(){
            //given
            ShapeCollector shapeCollector = new ShapeCollector();
            //when
            Shape circle = new Circle();
            Shape square = new Square();
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(square);

            shapeCollector.getFigure(1);
            //then
            Assertions.assertEquals(square, shapeCollector.getFigure(1));
        }
        @DisplayName("Test if method showFigure works")
        @Test
        void testShowFigures() {
            //given
            ShapeCollector shapeCollector = new ShapeCollector();
            //when
            Shape circle = new Circle();

            shapeCollector.addFigure(circle);
            ArrayList<Shape> newList = shapeCollector.showFigures();
            //then
            Assertions.assertTrue(newList.contains(circle));
            }
    }
}
