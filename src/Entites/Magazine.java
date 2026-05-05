package Entites;

import Constant.Constants;

public class Magazine extends LibraryItem{
    private String issueNumber;
    private String publisher ;

    public Magazine(String id, String title, Boolean status, String issueNumber, String publisher) {
        super(id, title, status);
        this.issueNumber = issueNumber;
        this.publisher = publisher;
    }

    public String getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(String issueNumber) {
        this.issueNumber = issueNumber;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public void getDetails() {
        System.out.println("Magazin");
        System.out.println("  ID     : " + getId());
        System.out.println("  Title  : " + getTitle());
        System.out.println("  Issue No : " + issueNumber);
        System.out.println("  publisher   : " + publisher);
        System.out.println("  Status : " + (getStatus() ? Constants.STATUS_AVAILABLE : Constants.STATUS_CHECKED_OUT));
    }
}
