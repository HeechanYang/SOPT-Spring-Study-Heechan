package com.example.demo.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class DetailBookResponseDTO {
    private int id;
    private String title;
    private String author;
    private boolean out;
}
