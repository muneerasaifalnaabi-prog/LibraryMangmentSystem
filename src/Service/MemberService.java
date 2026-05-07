package Service;

import Constant.Constants;
import Entites.Adrress;
import Entites.Members;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class MemberService {
    static Scanner scanner = new Scanner(System.in);


    private List<Members> members = new ArrayList<>();

    public void registerMember(Members member) {
        members.add(member);
        System.out.println(Constants.SUCCESS_MEMBER_REGISTERED);
    }

    public Members findMemberById(String id) {
        for (Members m : members) {
            if (m.getId().toString().equals(id)) return m;
        }
        System.out.println(Constants.MEMBER_NOT_FOUND);
        return null;
    }

    public Members selectMemberFromList(String action) {
        if (members.isEmpty()) {
            System.out.println(Constants.NO_MEMBERS);
            return null;
        }
        System.out.println("\nSelect a member to " + action + ":");
        for (int i = 0; i < members.size(); i++) {
            System.out.println((i + 1) + ". " + members.get(i).getName() + " (ID: " + members.get(i).getId() + ")");
        }
        System.out.print("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt() - 1;
        sc.nextLine();
        if (index >= 0 && index < members.size()) return members.get(index);
        System.out.println(Constants.MEMBER_NOT_FOUND);
        return null;
    }

    public void listAllMembers() {
        if (members.isEmpty()) {
            System.out.println(Constants.NO_MEMBERS);
            return;
        }
        System.out.println("----- All Members ------");
        for (Members m : members) m.getDetails();
    }

    public void register() {
        Scanner sc = new Scanner(System.in);
        Members member = new Members();
        member.setId(UUID.randomUUID());
        System.out.print("Enter Name: ");
        member.setName(sc.nextLine());

        System.out.print("Enter Street: ");
        String street = sc.nextLine();
        System.out.print("Enter City: ");
        String city = sc.nextLine();
        System.out.print("Enter Postal Code: ");
        String postal = sc.nextLine();
        Adrress addr = new Adrress(street, city, postal);
        member.setAdress(addr);

        registerMember(member);
    }

    public Boolean handleMemberMenu() {
        switch (option) {
            case 1 -> {
                register();
            }
            case 2 -> {
                listAllMembers();
            }
            case 3 -> {
                return false;
            }
        }
        return true;
    }
}