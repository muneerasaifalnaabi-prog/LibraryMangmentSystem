package Service;

import Entites.LibraryItem;
import Entites.Members;

public class BorrowingService {
    private LibraryItem libraryItem;
    private Members members;

    public static int MAX_ITEMS=3;

    public BorrowingService(LibraryItem libraryItem, Members members) {
        this.libraryItem = libraryItem;
        this.members = members;
    }
}
