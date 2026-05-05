package Service;

import Constant.Constants;
import Entites.LibraryItem;

import java.util.ArrayList;
import java.util.List;

public class LibraryItemService {
    private List<LibraryItem> items =new ArrayList<>();

    public void addedItem(LibraryItem item){
        items.add(item);
        System.out.println(Constants.SUCCESS_ITEM_ADDED);
    }


}
