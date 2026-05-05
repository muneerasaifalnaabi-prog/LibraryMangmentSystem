package Service;

import Constant.Constants;
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

    public void borrowItem(String memberId, String itemId) {
        Members m= members.findMemberById(memberId);
        if (m==null){
            return;
        }
        LibraryItem item = libraryItem.findBookById(itemId);
        if (item == null) {
            return ;
        }

        if (m.getBorrowedItems(item).size() >= MAX_ITEMS) {
            System.out.println(Constants.BORROW_LIMIT_REACHED);
            return;
        }
        boolean success = item.checkOut();
        if (success) {
            m.getBorrowedItems(item);
            System.out.println(Constants.SUCCESS_CHECKED_OUT);
        }
    }

    public void returnItem(String memberId, String itemId) {

        Members member = members.findMemberById(memberId);
        if (member == null) {
            return;
        }

        LibraryItem item = libraryItem.findBookById(itemId);
        if (item == null) {
            return;
        }
}


    }
