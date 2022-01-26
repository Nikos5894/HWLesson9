package com.company.cursor.exercise_3;

public class Movie {
    private int tickets;
    private int price;
    private Genre genre;

    public Movie(int tickets, int price, Genre genre) {
        this.tickets = tickets;
        this.price = price;
        this.genre = genre;
    }

    public int getTickets() {
        return tickets;
    }

    public void setTickets(int tickets) {
        this.tickets = tickets;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "tickets=" + tickets +
                ", price=" + price +
                ", genre=" + genre +
                '}';
    }
}
