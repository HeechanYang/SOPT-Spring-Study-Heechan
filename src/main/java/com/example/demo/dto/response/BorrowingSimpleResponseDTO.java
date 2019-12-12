package com.example.demo.dto.response;

import com.example.demo.model.Borrowing;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter @Setter
@Builder
public class BorrowingSimpleResponseDTO {
    private int id;
    private String memberName;
    private String bookTitle;
    private Date startTime;
    private Date returnTime;

    public static BorrowingSimpleResponseDTO of(Borrowing borrowing){
        return BorrowingSimpleResponseDTO.builder()
                .id(borrowing.getId())
                .bookTitle(borrowing.getBook().getTitle())
                .memberName(borrowing.getMember().getName())
                .startTime(borrowing.getStartTime())
                .returnTime(borrowing.getReturnTime())
                .build();
    }
}