package Entites;

import Behaviour.Borrowable;
import Constant.Constants;
import java.util.UUID;

public abstract class LibraryItem implements Borrowable {

    private UUID id;
    private String title;
    private boolean status = true;

    public LibraryItem() {}

    @Override
    public Boolean checkOut() {
        if (!status) {
            System.out.println(Constants.ALREADY_CHECKED_OUT);
            return false;
        }
        status = false;
        return true;
    }

    @Override
    public Boolean returnItem() {
        if (status) {
            System.out.println(Constants.NOT_CHECKED_OUT);
            return false;
        }
        status = true;
        return true;
    }

    public abstract void getDetails();

    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public boolean getStatus() { return status; }
    public void setStatus(boolean status) { this.status = status; }
}