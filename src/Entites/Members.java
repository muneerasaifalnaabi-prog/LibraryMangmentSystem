package Entites;

public class Members {
    //completed
    private String id;
    private String name ;
    private Adrress adress;
    private String borrowItem;

    public Members(String name, String id, Adrress adress, String borrowItem) {
        this.name = name;
        this.id = id;
        this.adress = adress;
        this.borrowItem = borrowItem;
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

    public String getBorrowItem() {
        return borrowItem;
    }

    public void setBorrowItem(String borrowItem) {
        this.borrowItem = borrowItem;
    }
}
