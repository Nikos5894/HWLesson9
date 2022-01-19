package com.company.cursor.exercise_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task3Main {
    public static void main(String[] args) {
        Movie movie = new Movie(50, 20, Genre.MALE);
        Movie movie1 = new Movie(60, 21, Genre.FEMALE);
        Movie movie2 = new Movie(70, 22, Genre.FEMALE);
        Movie movie3 = new Movie(80, 23, Genre.MALE);
        Movie movie4 = new Movie(90, 24, Genre.MALE);
        Movie movie5 = new Movie(85, 25, Genre.FEMALE);
        Movie movie6 = new Movie(75, 26, Genre.MALE);
        Movie movie7 = new Movie(65, 27, Genre.FEMALE);
        Movie movie8 = new Movie(95, 28, Genre.FEMALE);
        Movie movie9 = new Movie(73, 29, Genre.MALE);
        List<Movie> list1 = new ArrayList<>();

        Collections.addAll(list1, movie, movie1, movie2, movie3, movie4);
        List<Movie> list2 = new ArrayList<>();
        Collections.addAll(list2, movie5, movie6, movie7, movie8, movie9);

        Supplier<Stream<Movie>> streamSupplierList1 = list1::stream;

        Supplier<Stream<Movie>> streamSupplierList2 = list2::stream;
        var avgPriceMaleList1 = streamSupplierList1.get().filter(it -> it.getGenre() == Genre.MALE).collect(Collectors.averagingInt(it -> it.getPrice() * it.getTickets()));
        var avgPriceFemaleList1 = streamSupplierList1.get().filter(it -> it.getGenre() == Genre.FEMALE).collect(Collectors.averagingInt(it -> it.getPrice() * it.getTickets()));
        var countMoviesFemaleList1 = streamSupplierList1.get().filter(it -> it.getGenre() == Genre.FEMALE).count();
        var countMoviesMaleList1 = streamSupplierList1.get().filter(it -> it.getGenre() == Genre.MALE).count();

        var avgPriceMaleList2 = streamSupplierList2.get().filter(it -> it.getGenre() == Genre.MALE).collect(Collectors.averagingInt(it -> it.getPrice() * it.getTickets()));
        var avgPriceFemaleList2 = streamSupplierList2.get().filter(it -> it.getGenre() == Genre.FEMALE).collect(Collectors.averagingInt(it -> it.getPrice() * it.getTickets()));
        var countMoviesFemaleList2 = streamSupplierList2.get().filter(it -> it.getGenre() == Genre.FEMALE).count();
        var countMoviesMaleList2 = streamSupplierList2.get().filter(it -> it.getGenre() == Genre.MALE).count();

        System.out.println("average price of tickets male genre \t" + avgPriceMaleList1);
        System.out.println("count movies male genre \t" + countMoviesMaleList1);
        System.out.println("average price of tickets female genre \t" + avgPriceFemaleList1);
        System.out.println("count movies female genre \t" + countMoviesFemaleList1);


        System.out.println("average price of tickets male genre \t" + avgPriceMaleList2);
        System.out.println("count movies male genre \t" + countMoviesMaleList2);
        System.out.println("average price of tickets female genre \t" + avgPriceFemaleList2);
        System.out.println("count movies female genre \t" + countMoviesFemaleList2);

    }
}
