package Service;

import Constant.Constants;
import Entites.Members;

import java.util.ArrayList;
import java.util.List;

public class MemberService {

    private List<Members> members = new ArrayList<>();

    public List<Members> getMembers() {
        return members;
    }

    public void registerMember(Members member) {
        members.add(member);
        System.out.println(Constants.SUCCESS_MEMBER_REGISTERED);
    }

    public Members findMemberById(String id) {
        for (Members member : members) {
            if (member.getId().equals(id)) {
                return member;
            }
        }
        System.out.println(Constants.MEMBER_NOT_FOUND);
        return null;
    }

    public void listAllMembers() {
        if (members.isEmpty()) {
            System.out.println(Constants.NO_MEMBERS);
            return;
        }
        System.out.println("-----All Members ------");
        for (Members member : members) {
            member.getDetails();
        }
    }


}