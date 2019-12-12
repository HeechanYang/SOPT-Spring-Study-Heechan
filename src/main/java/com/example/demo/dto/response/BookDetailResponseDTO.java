package com.example.demo.dto.response;

import com.example.demo.model.Book;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Builder
public class BookDetailResponseDTO {
    private int id;
    private String title;
    private String author;
    private boolean out;

    public static BookDetailResponseDTO of(Book book){
        return BookDetailResponseDTO.builder()
                .id(book.getId())
                .title(book.getTitle())
                .author(book.getAuthor())
                .out(book.isOut())
                .build();
    }
}
