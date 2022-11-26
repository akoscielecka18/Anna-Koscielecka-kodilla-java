package com.kodilla.stream.array;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int numbers[]){
        IntStream.range(0, numbers.length)
                .mapToDouble(n ->  numbers[n])
                .forEach(System.out::println);

      double averageOfNumbers = IntStream.range(0, numbers.length)
               .mapToDouble(n ->  numbers[n])
               .average()
               .orElse(0);
        return averageOfNumbers;


    }
}
