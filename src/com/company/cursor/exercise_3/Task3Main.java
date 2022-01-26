package com.company.cursor.exercise_3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Task3Main {

    public static void main(String[] args) {
        Movie movie = new Movie(50, 20, Genre.ACTION);
        Movie movie1 = new Movie(60, 21, Genre.DRAMA);
        Movie movie2 = new Movie(70, 22, Genre.COMEDY);
        Movie movie3 = new Movie(80, 23, Genre.FANTASY);
        Movie movie4 = new Movie(90, 24, Genre.HORROR);
        Movie movie5 = new Movie(85, 25, Genre.DRAMA);
        Movie movie6 = new Movie(75, 26, Genre.FANTASY);
        Movie movie7 = new Movie(65, 27, Genre.HORROR);
        Movie movie8 = new Movie(95, 28, Genre.ACTION);
        Movie movie9 = new Movie(73, 29, Genre.COMEDY);
        Movie movie10 = new Movie(90, 27, Genre.HORROR);

        List<Movie> list1 = new ArrayList<>();
        Collections.addAll(list1, movie, movie1, movie2, movie3, movie4);
        List<Movie> list2 = new ArrayList<>();
        Collections.addAll(list2, movie5, movie6, movie7, movie8, movie9, movie10);

        List<List<Movie>> movieLists = new ArrayList<>();
        movieLists.add(list1);
        movieLists.add(list2);

        var countMoviesOfGenre = movieLists.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.groupingBy(Movie::getGenre, Collectors.counting()));
        System.out.println("Count of movies for a particular genre: " + countMoviesOfGenre);

        var averagePriceOfTickets = movieLists.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.groupingBy(Movie::getGenre, Collectors.averagingInt(Movie::getPrice)));
        System.out.println("Average price of tickets: " + averagePriceOfTickets);

    }
}
