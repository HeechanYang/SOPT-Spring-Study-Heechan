package com.example.demo.dto.response;

import com.example.demo.model.Book;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Builder
public class BookSimpleResponseDTO {
    private int id;
    private String title;

    public static BookSimpleResponseDTO of(Book book){
        return BookSimpleResponseDTO.builder()
                .id(book.getId())
                .title(book.getTitle())
                .build();
    }
}
