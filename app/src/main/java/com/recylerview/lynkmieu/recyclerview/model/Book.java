package com.recylerview.lynkmieu.recyclerview.model;

/**
 * Created by LynkMieu on 2016/11/08.
 */

public class Book {
    private String title;
    private String  author;
    private String  price;

    public Book() {
    }

    public Book(String title, String author, String price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
