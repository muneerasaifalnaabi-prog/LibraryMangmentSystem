package Entites;

public class LibraryItem {
    private String id;
    private String title ;
    private Boolean status;

    public LibraryItem(String id, String title, Boolean status) {
        this.id = id;
        this.title = title;
        this.status = status;
    }
}
