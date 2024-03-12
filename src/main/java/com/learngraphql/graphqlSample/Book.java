package com.learngraphql.graphqlSample;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Arrays;
import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class Book implements BookResponse{

    private String id;
    private String name;
    private int pageCount;
    private String author;

    private static List<Book> books(){
        return Arrays.asList(
                 new Book("book-1","Effective Java",416,"author-1")
                         ,
                new Book("book-2","Hitchhiker's Guide to the Galaxy",208,"author-2")
              ,
                new Book("book-3","Down Under",436,"author-3"));
    }
    public static BookResponse getbyId(String id){

        BookError bookError = BookError.builder().message("test message").build();
        List<Book> book = books();
        for(Book book1 : book){
            if(book1.getId().equals(id)){
                return book1;
            }else{
                return bookError;
            }

        }
        return null;
    }
}

