package com.theseniorcitizens.tsc.model;

import java.io.Serializable;

public class Book  implements Serializable {
    public String Id;
    public String bookName;
    public String author;
    public int publishedYear;
    public String publisher;
    public double price;
    public int numberOfPages;
    public String description;
    public int numberOfPrints;
    public String skinType;
    public String language;
    public  Book(){

    }

    public Book(String Id, String bookName, String author, int publishedYear,String publisher, double price, int numberOfPages, String description, int numberOfPrints, String skinType, String language) {
        this.Id = Id;
        this.bookName = bookName;
        this.author = author;
        this.publishedYear = publishedYear;
        this.price = price;
        this.publisher = publisher;
        this.numberOfPages = numberOfPages;
        this.description = description;
        this.numberOfPrints = numberOfPrints;
        this.skinType = skinType;
        this.language = language;
    }
    public Boolean isEmpty(){
        return (!Id.isEmpty() & !bookName.isEmpty() & !author.isEmpty() & !publisher.isEmpty() & !description.isEmpty() &
                !skinType.isEmpty() & !language.isEmpty());
    }
    public String toString(){
        return this.bookName+"\n"+author+"\n"+this.price+" TL";
    }

}
