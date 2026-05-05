package Service;

import Constant.Constants;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;

public class MemberService {
    private List<Member> members = new ArrayList<>();

    public List<Member> getMembers() {
        return members;
    }

    public void registerMember(Member member){
        members.add(member);
        System.out.println(Constants.SUCCESS_MEMBER_REGISTERED);
    }
}
