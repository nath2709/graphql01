package com.learngraphql.graphqlSample;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class BookError implements BookResponse{

   private String message;

   private static BookError getError(){

       return BookError.builder().message("test message").build();
   }
}
