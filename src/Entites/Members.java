package Entites;

public class Members {
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
}
