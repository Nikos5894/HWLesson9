package com.company.cursor.exercise_1;

@FunctionalInterface
public interface MyPredicate<T, F> {

    F myPredicate(T it);
}
