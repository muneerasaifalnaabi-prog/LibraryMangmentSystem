package Entites;

import Behaviour.Borrowable;
import Constant.Constants;

public abstract class LibraryItem implements Borrowable {

    private String id;
    private String title;
    private Boolean status = true;


    public LibraryItem(String id, String title, Boolean status) {
        this.id = id;
        this.title = title;
        this.status = status;
    }

    @Override
    public Boolean checkOut() {
        if (status == true) {
            System.out.println(Constants.ALREADY_CHECKED_OUT);
            return false;
        }
        this.status = false;
        return true;
    }

    @Override
    public Boolean returnItem() {
        if (status == false) {
            System.out.println(Constants.NOT_CHECKED_OUT);
            return false;
        }
        this.status = true;
        return true;
    }

    public abstract void getDetails();

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public Boolean getStatus() { return status; }
    public void setStatus(Boolean status) { this.status = status; }
}