package com.example.demo.service;

import com.example.demo.dto.request.InsertMemberRequestDTO;
import com.example.demo.dto.request.UpdateMemberRequestDTO;
import com.example.demo.dto.response.MemberDetailResponseDTO;
import com.example.demo.dto.response.MemberSimpleResponseDTO;
import com.example.demo.mapper.MemberMapper;
import com.example.demo.model.Member;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MemberService {
    private final MemberMapper memberMapper;

    public MemberService(MemberMapper memberMapper) {
        this.memberMapper = memberMapper;
    }

    public boolean saveMember(InsertMemberRequestDTO newMember) {
        return memberMapper.insertMember(newMember) != 0;
    }

    public List<MemberSimpleResponseDTO> getAllMembers() {
        return memberMapper.getAllMembers().stream().map(MemberSimpleResponseDTO::of).collect(Collectors.toList());
    }

    public MemberDetailResponseDTO getMemberById(int memberId) {
        return MemberDetailResponseDTO.of(memberMapper.getMemberById(memberId));
    }

    public boolean putMember(int memberId, UpdateMemberRequestDTO puttedMember) {
        return memberMapper.updateMember(memberId, puttedMember) != 0;
    }

    public boolean deleteMember(int memberId) {
        return memberMapper.deleteMember(memberId) != 0;
    }
}