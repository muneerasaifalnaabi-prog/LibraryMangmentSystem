package Entites;

import Behaviour.Borrowable;

public class LibraryItem implements Borrowable {
    private String id;
    private String title ;
    private Boolean status;

    public LibraryItem(String id, String title, Boolean status) {
        this.id = id;
        this.title = title;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public void checkOut() {
        if (!status){
            System.out.println("Item is Already checked out");

        }

    }

    @Override
    public void returnItem() {

    }
}
