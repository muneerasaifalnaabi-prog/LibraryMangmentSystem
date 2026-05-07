package Service;

import Constant.Constants;
import Entites.LibraryItem;
import Entites.Members;

import java.util.Scanner;

public class BorrowingService {
    static Scanner scanner = new Scanner(System.in);
    private LibraryItemService itemService;
    private MemberService memberService;
    private static  int MAX_BORROW_LIMIT = 5;


    public BorrowingService(LibraryItemService itemService, MemberService memberService) {
        this.itemService = itemService;
        this.memberService = memberService;
    }

    public void borrowItem() {
        Members member = memberService.selectMemberFromList("borrow an item");
        if (member == null) return;

        if (member.getBorrowedItems().size() >= MAX_BORROW_LIMIT) {
            System.out.println(Constants.BORROW_LIMIT_REACHED);
            return;
        }

        LibraryItem item = itemService.selectItemFromList("borrow");
        if (item == null) return;

        if (!item.getStatus()) {
            System.out.println(Constants.ALREADY_CHECKED_OUT);
            return;
        }

        if (item.checkOut()) {
            member.addBorrowedItem(item);
            System.out.println(Constants.BORROW_SUCCESS);
        }
    }

    public void returnItem() {
        Members member = memberService.selectMemberFromList("return an item");
        if (member == null) return;

        if (member.getBorrowedItems().isEmpty()) {
            System.out.println("This member has no borrowed items.");
            return;
        }


        System.out.println("\nSelect an item to return:");
        for (int i = 0; i < member.getBorrowedItems().size(); i++) {
            LibraryItem item = member.getBorrowedItems().get(i);
            System.out.println((i + 1) + ". " + item.getTitle() + " (ID: " + item.getId() + ")");
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int index = sc.nextInt() - 1;
        sc.nextLine();
        if (index < 0 || index >= member.getBorrowedItems().size()) {
            System.out.println(Constants.ITEM_NOT_FOUND);
            return;
        }
        LibraryItem item = member.getBorrowedItems().get(index);
        if (item.returnItem()) {
            member.removeBorrowedItem(item);
            System.out.println(Constants.RETURN_SUCCESS);
        }
    }

    public void viewBorrowed() {
        Members member = memberService.selectMemberFromList("view borrowed items");
        if (member == null) return;

        System.out.println("\nItems borrowed by " + member.getName() + ":");
        if (member.getBorrowedItems().isEmpty()) {
            System.out.println("  None");
            return;
        }
        for (LibraryItem item : member.getBorrowedItems()) {
            System.out.println("  - " + item.getTitle() + " (ID: " + item.getId() + ")");
        }
    }

   public void handleBorrowingMenu() {
        int option =scanner.nextInt();
        switch (option) {
            case 1 -> {
                borrowItem();
                handleBorrowingMenu();
            }
            case 2 ->{
                returnItem();
                handleBorrowingMenu();
            }
            case 3 -> {
                viewBorrowed();
                handleBorrowingMenu();
            }
            case 4 -> {
                System.out.println("Exit Borrow Service...");
                return;

            }
        }

    }


    }