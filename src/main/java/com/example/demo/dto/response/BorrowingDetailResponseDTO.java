package com.example.demo.dto.response;

import com.example.demo.model.Borrowing;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter @Setter
@Builder
public class BorrowingDetailResponseDTO {
    private int id;
    private BookDetailResponseDTO book;
    private MemberDetailResponseDTO member;
    private Date startTime;
    private Date expiryTime;
    private Date returnTime;

    public static BorrowingDetailResponseDTO of(Borrowing borrowing){
        return BorrowingDetailResponseDTO.builder()
                .id(borrowing.getId())
                .book(BookDetailResponseDTO.of(borrowing.getBook()))
                .member(MemberDetailResponseDTO.of(borrowing.getMember()))
                .startTime(borrowing.getStartTime())
                .expiryTime(borrowing.getExpiryTime())
                .returnTime(borrowing.getReturnTime())
                .build();
    }
}
