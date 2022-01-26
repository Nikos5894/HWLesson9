package com.company.cursor.exercise_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task1Main {

    public static void main(String[] args) {
        MyPredicate<String, Integer> myPredicate = Integer::valueOf;
        Integer x = myPredicate.myPredicate("123");
        System.out.println("Using self functional interface myPredicate: " + x);

        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4);
        MySum<Integer> mySum = Integer::sum;
        Integer intSum = mySum.calculate(1, 2);
        System.out.println("Using self functional interface mySum: " + intSum);
    }
}

