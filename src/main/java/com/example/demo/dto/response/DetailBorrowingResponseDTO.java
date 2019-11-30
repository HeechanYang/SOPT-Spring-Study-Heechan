package com.example.demo.dto.response;

import com.example.demo.model.Book;
import com.example.demo.model.Member;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter @Setter
public class DetailBorrowingResponseDTO {
    private int id;
    private Book book;
    private Member member;
    private Date startTime;
    private Date expiryTime;
    private Date returnTime;
}
