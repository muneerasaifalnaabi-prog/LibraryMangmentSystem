package Entites;

import Constant.Constants;

public class Books extends LibraryItem {
    private  String author;
    private String isbn;

    public Books(String id, String title, String author, String isbn) {
        super(id, title, true);
        this.author = author;
        this.isbn = isbn;
    }
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public void getDetails() {
        System.out.println("Book");
        System.out.println("  ID     : " + getId());
        System.out.println("  Title  : " + getTitle());
        System.out.println("  Author : " + author);
        System.out.println("  ISBN   : " + isbn);
        System.out.println("  Status : " + (getStatus() ? Constants.STATUS_AVAILABLE : Constants.STATUS_CHECKED_OUT));
    }


}
