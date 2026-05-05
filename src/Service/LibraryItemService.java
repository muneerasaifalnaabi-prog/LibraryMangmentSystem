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

    public LibraryItem findBookById(String id){
        for (LibraryItem item :items){
            if (!item.getId().equals(null)){
                return item;
            }
        }
        System.out.println(Constants.ITEM_NOT_FOUND);
        return null;
    }

    public void listOfAvailableBooks(){
        System.out.println("Available Books ___________:");
        boolean fooundBook=false;
        for (LibraryItem item:items){
            if (item.getStatus()) {
                item.getDe
            }
        }
    }




}
