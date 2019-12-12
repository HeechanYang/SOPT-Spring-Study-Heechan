package com.example.demo.controller;

import com.example.demo.dto.request.InsertMemberRequestDTO;
import com.example.demo.dto.request.SignInRequestDTO;
import com.example.demo.dto.request.UpdateMemberRequestDTO;
import com.example.demo.dto.response.MemberDetailResponseDTO;
import com.example.demo.dto.response.MemberSimpleResponseDTO;
import com.example.demo.service.MemberService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/members")
public class MemberController {

    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping
    public boolean saveMember(@RequestBody InsertMemberRequestDTO newMember){
        return memberService.saveMember(newMember);
    }

    @PostMapping
    public MemberDetailResponseDTO signIn(@RequestBody SignInRequestDTO signInRequestDTO){
        return memberService.signIn(signInRequestDTO);
    }

    @GetMapping
    public List<MemberSimpleResponseDTO> getAllMembers(){
        return memberService.getAllMembers();
    }

    @GetMapping("/{memberId}")
    public MemberDetailResponseDTO getMember(@PathVariable("memberId") int memberId){
        return memberService.getMemberById(memberId);
    }

    @PutMapping("/{memberId}")
    public boolean putMember(@PathVariable("memberId") int memberId,
                               @RequestBody UpdateMemberRequestDTO puttedMember){
        return memberService.putMember(memberId, puttedMember);
    }

    @DeleteMapping("/{memberId}")
    public boolean deleteMember(@PathVariable("memberId") int memberId){
        return memberService.deleteMember(memberId);
    }
}
