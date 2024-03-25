package org.vijay.designPatterns.decorator.example2;

public class AddPopcorn implements BookMyShowDecorator{
    private BookMyShow bookMyShow;
    public AddPopcorn(BookMyShow bookMyShow) {
        this.bookMyShow = bookMyShow;
    }
    @Override
    public String getShowName() {
        return bookMyShow.getShowName() + " with popcorn";
    }

    @Override
    public double getCost() {
        return bookMyShow.getCost() + 90.0;
    }
}
