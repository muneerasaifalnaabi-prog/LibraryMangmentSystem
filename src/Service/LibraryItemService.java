package Service;

import Constant.Constants;
import Entites.Books;
import Entites.LibraryItem;
import Entites.Magazine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryItemService {
    private List<LibraryItem> items =new ArrayList<>();

    public List<LibraryItem> getItems() {
        return items;
    }

    public void addedItem(LibraryItem item){
        items.add(item);
        System.out.println(Constants.SUCCESS_ITEM_ADDED);
    }

    public LibraryItem findBookById(String id){
        for (LibraryItem item :items){
            if (item.getId().equals(id)){
                return item;
            }
        }
        System.out.println(Constants.ITEM_NOT_FOUND);
        return null;
    }

    public void listOfAvailableBooks(){
        System.out.println("---------Available Books --------:");
        boolean foundBook=false;
        for (LibraryItem item:items){
            if (item.getStatus()) {
                item.getDetails();
                foundBook =true;
            }
        }
    }
    public void searchByTitle(String t){
        System.out.println("Books Details By name");
        boolean foundBook=false;
        for (LibraryItem item : items) {
            if (item.getTitle().toLowerCase().contains(t.toLowerCase())) {
                item.getDetails();
                foundBook =true;
            }

        }
        System.out.println(Constants.NO_SEARSH_RESULT);
    }
    public void addBook() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Books ID");
        String id = scanner.nextLine();

        System.out.println("Enter Title Of Book");
        String title = scanner.nextLine();

        System.out.println("Enter Author ");
        String author = scanner.nextLine();

        System.out.println("Enter ISBN ");
        String isbn = scanner.nextLine();

        Books book = new Books(id, title, author, isbn);
        addedItem(book);
    }
    public void addMagazine() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Magazine Id");
        String id = scanner.nextLine();

        System.out.println("Enter Title Of Magazine");
        String title = scanner.nextLine();

        System.out.println("Enter Issue Number");
        int issueNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Publisher");
        String publisher = scanner.nextLine();

        Magazine magazine = new Magazine(id, title, issueNumber, publisher);
        addedItem(magazine);
    }
    public void search() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter title To Search ");
        String title = scanner.nextLine();
        searchByTitle(title);
    }


    public Boolean handleItemMenu(Integer itemOption) {
        switch (itemOption) {
            case 1 -> {
                addBook();
            }
            case 2 -> {
                addMagazine();
            }
            case 3 -> {
                if (items.isEmpty()) {
                    System.out.println(Constants.NO_ITEMS_IN_SYSTEM);
                } else {
                    listOfAvailableBooks();
                }
            }
            case 4 -> {
                if (items.isEmpty()) {
                    System.out.println(Constants.NO_ITEMS_IN_SYSTEM);
                } else {
                    search();
                }
            }
            case 5 -> {
                return false;
            }
        }
        return true;
    }
    }





