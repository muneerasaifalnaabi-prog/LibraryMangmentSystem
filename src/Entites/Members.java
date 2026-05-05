package Entites;

import java.util.ArrayList;
import java.util.List;

public class Members {
    //completed
    private String id;
    private String name ;
    private Adrress adress;
    private List<String> borrowItem;

    public Members(String name, String id, Adrress adress) {
        this.name = name;
        this.id = id;
        this.adress = adress;
        this.borrowItem = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Adrress getAdress() {
        return adress;
    }

    public void setAdress(Adrress adress) {
        this.adress = adress;
    }
    public List<String> getBorrowedItems(LibraryItem item) {
        return borrowItem;
    }


    public void addBorrowedItem(String itemId) {
        borrowItem.add(itemId);
    }

    public boolean removeBorrowedItem(String itemId) {
        return borrowItem.remove(itemId);
    }

    public void getDetails() {
        System.out.println("Member");
        System.out.println("  ID       : " + id);
        System.out.println("  Name     : " + name);
        System.out.println("  Address  : " + adress);
     //  System.out.println("  Borrowed : " + getBorrowedItems(item).size() + " item(s)");
    }
}
