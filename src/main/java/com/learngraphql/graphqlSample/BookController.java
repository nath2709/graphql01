package com.learngraphql.graphqlSample;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {

    @QueryMapping
    public Object bookById(@Argument String id){
//        throw new RuntimeException(" not found")
     return Book.getbyId(id);
    }

    @SchemaMapping
    public Author author(Book book){
        return Author.getById(book.getId());
    }
}
