package Service;

import Constant.Constants;
import Entites.Books;
import Entites.LibraryItem;
import Entites.Magazine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class LibraryItemService {

    private List<LibraryItem> items = new ArrayList<>();

    public void addItem(LibraryItem item) {
        items.add(item);
        System.out.println(Constants.SUCCESS_ITEM_ADDED);
    }

    public LibraryItem findItemById(String idString) {
        for (LibraryItem item : items) {
            if (item.getId().toString().equals(idString)) return item;
        }
        System.out.println(Constants.ITEM_NOT_FOUND);
        return null;
    }

    public LibraryItem findItemById(UUID id) {
        for (LibraryItem item : items) {
            if (item.getId().equals(id)) return item;
        }
        return null;
    }

    public LibraryItem selectItemFromList(String action) {
        if (items.isEmpty()) {
            System.out.println(Constants.NO_ITEMS_IN_SYSTEM);
            return null;
        }
        System.out.println("\nSelect an item to " + action + ":");
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ". " + items.get(i).getTitle() + " (ID: " + items.get(i).getId() + ")");
        }
        System.out.print("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt() - 1;
        sc.nextLine();
        if (index >= 0 && index < items.size()) return items.get(index);
        System.out.println(Constants.ITEM_NOT_FOUND);
        return null;
    }

    public void listAvailableItems() {
        System.out.println("--------- Available Items --------");
        boolean found = false;
        for (LibraryItem item : items) {
            if (item.getStatus()) {
                item.getDetails();
                found = true;
            }
        }
        if (!found) System.out.println(Constants.NO_ITEMS_IN_SYSTEM);
    }

    public void searchByTitle(String keyword) {
        System.out.println("Search Results:");
        boolean found = false;
        for (LibraryItem item : items) {
            if (item.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                item.getDetails();
                found = true;
            }
        }
        if (!found) System.out.println("No items found");
    }

    public void addBook() {
        Scanner sc = new Scanner(System.in);
        Books book = new Books();
        book.setId(UUID.randomUUID());
        System.out.print("Enter Title: ");
        book.setTitle(sc.nextLine());
        System.out.print("Enter Author: ");
        book.setAuthor(sc.nextLine());
        System.out.print("Enter ISBN: ");
        book.setIsbn(sc.nextLine());
        addItem(book);
    }

    public void addMagazine() {
        Scanner sc = new Scanner(System.in);
        Magazine mag = new Magazine();
        mag.setId(UUID.randomUUID());
        System.out.print("Enter Title: ");
        mag.setTitle(sc.nextLine());
        System.out.print("Enter Issue Number: ");
        mag.setIssueNumber(sc.nextLine());
        System.out.print("Enter Publisher: ");
        mag.setPublisher(sc.nextLine());
        addItem(mag);
    }

    public void search() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter title to search: ");
        searchByTitle(sc.nextLine());
    }

    public Boolean handleItemMenu(Integer option) {
        switch (option) {
            case 1 -> {
                addBook();
            }
            case 2 ->{
                addMagazine();
            }
            case 3 -> {
                listAvailableItems();
            }
            case 4 -> {
                search();
            }
            case 5 -> {
                return false;
            }
        }
        return true;
    }
}