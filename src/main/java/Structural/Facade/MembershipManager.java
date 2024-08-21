package Structural.Facade;

import java.util.HashMap;
import java.util.Map;

public class MembershipManager {
    Map<Integer, Member> members = new HashMap<>();
    private int memberIdCounter = 1;

    public void registerMember(String name, String phoneNumber){
        Member member = new Member(String.valueOf(memberIdCounter), name, phoneNumber,true);
        members.put(memberIdCounter, member);
        memberIdCounter++;
    }

    public Member getMemberById(int memberId){
        return members.get(memberId);
    }

    public boolean validateMemberShip(int memberId){
        Member member = members.get(memberId);
        return member != null && member.isActive();
    }

    public void updateMemberPhoneNumber(int memberId, String phoneNumber){
        Member member = members.get(memberId);
        if (member != null){
            member.setPhoneNumber(phoneNumber);
        }
    }

    public void deactivateMember(int memberId){
        Member member = members.get(memberId);
        if(member != null){
            member.setActive(false);
        }
    }

    public void renewMemberShip(int memberId){
        Member member = members.get(memberId);
        if(member != null){
            member.setActive(true);
        }
    }

}
