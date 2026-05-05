package Service;
import Constant.Constants;
import Entites.LibraryItem;
import Entites.Members;

import java.util.Scanner;

    public class BorrowingService {
        LibraryItem libraryItem = new LibraryItem();
        LibraryItemService libraryItemServices = new LibraryItemService();
        MemberService memberServices = new MemberService();
        Scanner scanner = new Scanner(System.in);

        public void BorrowItem(){
            System.out.println("Please enter your ID");
            String borrowerID = scanner.nextLine();
            if (memberServices.findMemberById() == true){
                System.out.println(borrowerID + " is MEMBER");
                System.out.println("Please enter the item ID you want to borrow");
                String itemToBorrow = scanner.nextLine();
                if (libraryItemServices.findBookById() == true){
                    System.out.println(itemToBorrow+" "+ "is available");
                    System.out.println("Borrowed Done");
                }else {
                    System.out.println("SORRY, Item is not available");
                }

            }else {
                System.out.println( borrowerID +" "+ "Is NOT MEMBER");
            }
        }

        public void ReturnItem(){
            System.out.println("Please enter your ID");
            String borrowerID = scanner.nextLine();
            if (memberServices.findMemberById() == true){
                System.out.println(borrowerID + " is MEMBER");
                System.out.println("Please enter the item ID you want to Return");
                String itemToReturn = scanner.nextLine();
                if (libraryItemServices.findBookById() == true){
                    System.out.println(itemToReturn+" "+ "is available");
                    System.out.println("Return Done");
                }else {
                    System.out.println("SORRY, Item is not available");
                }

            }else {
                System.out.println( borrowerID +" "+ "Is NOT MEMBER");
            }
        }
        public Boolean handleBorrowingMenu(Integer borrowingOption) {
            switch (borrowingOption) {
                case 1 -> {
                    BorrowItem();
                }
                case 2 -> {
                    ReturnItem();
                    }

                case 3 -> {
                        viewBorrowedFromInput();
                }
                case 4 -> {
                return false;
            }

            }
            return true;
        }
    }

