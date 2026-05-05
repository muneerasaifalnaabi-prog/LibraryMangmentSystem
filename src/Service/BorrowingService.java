package Service;

import Entites.LibraryItem;
import Entites.Members;

public class BorrowingService {
    private LibraryItemService libraryItem;
    private MemberService members;

    public static int MAX_ITEMS=3;

    public BorrowingService(LibraryItemService libraryItem, MemberService members) {
        this.libraryItem = libraryItem;
        this.members = members;
    }

    public Boolean borrowItem(String memberId, String itemId) {
        Members m= members.findMemberById(memberId);
        if (m==null){
            return false;
        }
        LibraryItem item = libraryItem.findBookById(itemId);
        if (item == null) {
            return false;
        }
        return true;

    }


    }
