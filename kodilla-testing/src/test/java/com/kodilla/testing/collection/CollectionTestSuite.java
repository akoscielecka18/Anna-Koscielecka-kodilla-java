package com.kodilla.testing.collection;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import com.kodilla.testing.collection.OddNumbersExterminator;

public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }
    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @DisplayName("When the List is empty")

    @Test
    void testOddNumbersExterminatorEmptyList(){
        List<Integer> oddNumbersList = new ArrayList<>();
        System.out.println("Testing empty list");
    }
    @DisplayName("When the list has an even and an odd numbers")
    @Test
    void testOddNumbersExterminatorNormalList(){

            List<Integer> oddNumbersList = new ArrayList<>();
            for(Integer number: oddNumbersList){
                    oddNumbersList.add(number);
            }
        System.out.println("Testing full list");
    }
}
