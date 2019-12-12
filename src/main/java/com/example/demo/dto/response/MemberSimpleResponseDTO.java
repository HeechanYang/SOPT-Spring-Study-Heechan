package com.example.demo.dto.response;

import com.example.demo.model.Member;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class MemberSimpleResponseDTO {
    private int id;
    private String email;
    private String name;

    public static MemberSimpleResponseDTO of(Member member){
        return MemberSimpleResponseDTO.builder()
                .id(member.getId())
                .email(member.getEmail())
                .name(member.getName())
                .build();
    }
}
