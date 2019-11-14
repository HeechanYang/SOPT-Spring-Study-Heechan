package com.example.demo.service;

import com.example.demo.model.Member;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemberService {
    private List<Member> members = new ArrayList<>();
    private int autoIncrement = 1;

    public Member saveMember(Member newMember){
        // 중복 Email 있는지 확인해서 중복 Email이 있으면 null 반환
        for(Member member : members){
            if(member.getEmail().equals(newMember.getEmail())){
                return null;
            }
        }

        // 중복 Email이 없으면 리스트에 추가한 후 해당 멤버 다시 반환
        newMember.setId(autoIncrement++);
        members.add(newMember);

        return newMember;
    }

    public List<Member> getAllMembers() {
        return members;
    }

    public Member getMemberById(int memberId) {
        for(Member member : members){
            if(member.getId() == memberId){
                return member;
            }
        }

        return null;
    }

    public Member putMember(int memberId, Member puttedMember) {
        for(Member member : members){
            if(member.getId() == memberId){
                member.setEmail(puttedMember.getEmail());
                member.setPassword(puttedMember.getPassword());
                member.setName(puttedMember.getName());
                member.setPhoneNumber(puttedMember.getPhoneNumber());
                return member;
            }
        }

        puttedMember.setId(autoIncrement++);
        members.add(puttedMember);

        return puttedMember;
    }

    public Member deleteMember(int memberId) {
        for(Member member : members){
            if(member.getId() == memberId){
                members.remove(member);
                return member;
            }
        }

        return null;
    }
}