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
        oddNumbersExterminator.exterminate(null);
        //then
        Assertions.assertEquals((Integer) null, null);
    }
    @DisplayName("When the list has an even and an odd numbers")
    @Test
    void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        ArrayList<Integer> List = new ArrayList<>();
        List.add(1);
        List.add(2);
        List.add(3);

        oddNumbersExterminator.exterminate(List);
        //Then
        Assertions.assertEquals(List, List);
    }
}
