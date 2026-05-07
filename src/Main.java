import Constant.MenuMessages;
import Menu.Menu;
import Service.BorrowingService;
import Service.LibraryItemService;
import Service.MemberService;

import java.util.Scanner;

public class Main {
   static LibraryItemService itemService = new LibraryItemService();
    static  MemberService memberService = new MemberService();
    static BorrowingService borrowingService = new BorrowingService(itemService, memberService);

    static Scanner input = new Scanner(System.in);
    static Menu menu = new Menu();

    public static void main(String[] args) {
        handleMainMenu();


    }
    public static void  handleMainMenu(){
        Menu menu = new Menu();
        System.out.println("Enter Your Choice");
        menu.displayMenu();
        Integer option = input.nextInt();
        switch (option) {
            case 1 -> {
                    System.out.println(MenuMessages.ITEM_MENU_MESSAGE);
                    itemService.handleItemMenu();
                    handleMainMenu();

                }
            case 2 -> {

                    System.out.println("-------------Member Menu---------");
                    System.out.println(MenuMessages.MEMBER_MENU_MESSAGE);
                     memberService.handleMemberMenu();
                       handleMainMenu();


            }
            case 3 -> {

                    System.out.println(MenuMessages.BORROWING_MENU_MESSAGE);
                    borrowingService.handleBorrowingMenu();
                      handleMainMenu();
                }

            case 6 -> {
                System.out.println("Exit from system .........");
            }
        }
    }
        }
        //completed

