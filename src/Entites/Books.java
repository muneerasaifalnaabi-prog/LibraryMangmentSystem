package Entites;

public class Books extends LibraryItem {
    private  String author;
    private String isbn;

    public Books(String id, String title, Boolean status, String author, String isbn) {
        super(id, title, status);
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


}
