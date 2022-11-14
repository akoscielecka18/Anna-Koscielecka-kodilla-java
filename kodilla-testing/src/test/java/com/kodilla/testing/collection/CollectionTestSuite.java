package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;
import com.kodilla.testing.collection.OddNumbersExterminator;
import java.util.ArrayList;
import java.util.List;


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
        //given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //when
        List<Integer> emptyList = new ArrayList<>();
        List<Integer> oddNumbersExterminatorEmpty = oddNumbersExterminator.exterminate(emptyList);
        //then
        Assertions.assertEquals(emptyList, oddNumbersExterminatorEmpty);
    }
    @DisplayName("When the list has an even and an odd numbers")
    @Test
    void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        List<Integer> input = List.of(1,2,3);
        List<Integer> output=oddNumbersExterminator.exterminate(input);
        List<Integer> expected= List.of(2);

        //Then
        Assertions.assertEquals(expected, output);
    }
}
