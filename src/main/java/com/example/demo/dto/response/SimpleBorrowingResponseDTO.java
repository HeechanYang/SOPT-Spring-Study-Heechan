package com.example.demo.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter @Setter
public class SimpleBorrowingResponseDTO {
    private int id;
    private String memberName;
    private String bookTitle;
    private Date startTime;
    private Date returnTime;
}