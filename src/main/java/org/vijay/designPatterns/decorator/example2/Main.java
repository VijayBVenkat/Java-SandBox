package org.vijay.designPatterns.decorator.example2;

public class Main {

    public static void main(String[] args) {

        BookMyShow movie = new Movie();
        System.out.println(movie.getShowName() + " " + movie.getCost());

        movie = new AddPopcorn(movie);
        System.out.println(movie.getShowName() + " "+  movie.getCost());

        movie = new AddNachos(movie);
        System.out.println(movie.getShowName() + " "+  movie.getCost());
    }

}
