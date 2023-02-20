package com.kodilla.spring.calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class CalculatorTestSuite {

    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double resultAdd = calculator.add(10, 5);
        double resultSub = calculator.sub(10, 5);
        double resultMul = calculator.mul(10, 5);
        double resultDiv = calculator.div(10, 5);

        //Then
        Assertions.assertEquals(resultAdd, 15, 0);
        Assertions.assertEquals(resultSub, 5, 0);
        Assertions.assertEquals(resultMul, 50, 0);
        Assertions.assertEquals(resultDiv, 2, 0);

    }
}
