package com.example.demo.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class InsertMemberRequestDTO {
    private String email;
    private String password;
    private String name;
    private String phoneNumber;
}
