package Entites;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Members {

    private UUID id;
    private String name;
    private Adrress adress;
    private List<LibraryItem> borrowedItems;

    public Members() {
        this.borrowedItems = new ArrayList<>();
    }

    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Adrress getAdress() { return adress; }
    public void setAdress(Adrress adress) { this.adress = adress; }

    public List<LibraryItem> getBorrowedItems() {
        return borrowedItems;
    }

    public void addBorrowedItem(LibraryItem item) {
        borrowedItems.add(item);
    }

    public boolean removeBorrowedItem(LibraryItem item) {
        return borrowedItems.remove(item);
    }

    public void getDetails() {
        System.out.println("Member");
        System.out.println("  ID       : " + id);
        System.out.println("  Name     : " + name);
        System.out.println("  Address  : " + adress);
        System.out.println("  Borrowed : " + borrowedItems.size() + " item(s)");
    }
}