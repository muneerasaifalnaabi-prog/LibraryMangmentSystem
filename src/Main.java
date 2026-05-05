import Constant.MenuMessages;
import Menu.Menu;
import Service.BorrowingService;
import Service.LibraryItemService;
import Service.MemberService;

import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);
    static Menu menu = new Menu();

    public static void main(String[] args) {
        LibraryItemService itemService = new LibraryItemService();
        MemberService memberService = new MemberService();
        BorrowingService borrowingService = new BorrowingService(itemService, memberService);

        Boolean mainMenuContinue = true;
        while (mainMenuContinue) {
            System.out.println("Enter Your Choice");
            menu.displayMenu();
            Integer option = input.nextInt();
            switch (option) {
                case 1 -> {
                    Boolean itemMenuContinue = true;
                    while (itemMenuContinue) {
                        System.out.println(MenuMessages.ITEM_MENU_MESSAGE);
                        Integer itemOption = input.nextInt();
                        itemMenuContinue = itemService.handleItemMenu(itemOption);

                    }
                }
                case 2 -> {
                    Boolean memeberMenuContinue = true;
                    while (memeberMenuContinue) {
                        System.out.println("-------------Member Menu---------");
                        System.out.println(MenuMessages.MEMBER_MENU_MESSAGE);
                        Integer itemOption = input.nextInt();
                        memeberMenuContinue = memberService.handleMemberMenu(itemOption);

                    }
                }
                case 3 -> {
                    Boolean borrowingMenuContinue = true;
                    while (borrowingMenuContinue) {
                        System.out.println(MenuMessages.BORROWING_MENU_MESSAGE);
                        int borrowingOption = input.nextInt();
                        borrowingMenuContinue = borrowingService.handleBorrowingMenu(borrowingOption);
                    }
                }
                case 6 -> {
                    menu.exit();
                    mainMenuContinue = false;
                }

            }
        }
    }


        }

