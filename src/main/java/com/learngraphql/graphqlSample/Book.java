package com.learngraphql.graphqlSample;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.List;

@Data
@AllArgsConstructor
public class Book {

    private String id;
    private String name;
    private int pageCount;
    private String author;

    private static List<Book> books(){
        return Arrays.asList(
                new Book("book-1", "Effective Java", 416, "author-1"),
                new Book("book-2", "Hitchhiker's Guide to the Galaxy", 208, "author-2"),
                new Book("book-3", "Down Under", 436, "author-3"));
    }
    public static Book getbyId(String id){

       return books().stream().filter(book -> book.id.equals(id)).findFirst().orElse(null);
    }
}
