package com.kodilla.testing.collection;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {
    public List<Integer> exterminate(@NotNull List<Integer> numbers) {
        List<Integer> integers = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
               integers.add(number);
            }
        }
        System.out.println(integers);
        return integers;
    }
}
