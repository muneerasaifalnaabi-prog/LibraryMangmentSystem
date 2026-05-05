import Service.BorrowingService;
import Service.LibraryItemService;
import Service.MemberService;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Menu menu = new Menu();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        LibraryItemService itemService       = new LibraryItemService();
        MemberService memberService   = new MemberService();
        BorrowingService borrowingService = new BorrowingService(itemService, memberService);
        Boolean mainMenuContinue=true;

        while (mainMenuContinue){
            //displayMenue()
            Integer option =in
        }

    }
}