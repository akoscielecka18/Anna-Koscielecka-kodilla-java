package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import java.util.OptionalDouble;

import static org.testng.AssertJUnit.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage(){

        int numbers[] = {7, 8, 4, 5};

        Double average = ArrayOperations.getAverage(numbers);
        System.out.println(average);
        assertEquals(6.0, average);

    }
}
