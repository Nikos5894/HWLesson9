package com.company.cursor.exercise_2;


@FunctionalInterface
public interface MyCompare<K, V> {
    boolean compare(K team1, V email1, K team2, V email2);
}
