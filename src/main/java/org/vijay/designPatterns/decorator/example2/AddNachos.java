package org.vijay.designPatterns.decorator.example2;

import java.awt.print.Book;

public class AddNachos implements BookMyShowDecorator{
    private BookMyShow bookMyShow;
    public AddNachos(BookMyShow bookMyShow) {
        this.bookMyShow = bookMyShow;
    }
    @Override
    public String getShowName() {
        return bookMyShow.getShowName() + " " + " with nachos";
    }

    @Override
    public double getCost() {
        return bookMyShow.getCost() + 80.0;
    }
}
