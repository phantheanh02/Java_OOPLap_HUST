/*
 * Họ và tên: Phan Thế Anh
 * MssV: 20204941
 * Mã lớp: 721428
*/
package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.media.Media;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;

import javax.naming.LimitExceededException;

public class Cart {
    public static final int MAX_NUMBERS_ORDERD = 20;
    private ObservableList<Media> itemsOrdered =
    		FXCollections.observableArrayList();

    // Add media to cart
    public boolean addMedia(Media ... medias) throws LimitExceededException {
        // Exception
        if(itemsOrdered.size() + medias.length > MAX_NUMBERS_ORDERD) {
            throw new LimitExceededException("Your cart was full!!");
        }
        for(Media media: medias) {
            if(!itemsOrdered.contains(media)) {
                itemsOrdered.add(media);
            } else {
                System.out.println(media.getTitle() + " already exists in your cart");
            }
        }

        return true;
    }
  
    public int searchProduct(int id) {
        int index = -1;
        for(int i = 0; i < itemsOrdered.size(); i++) {
            Media item = itemsOrdered.get(i);
            if(item.getId() == id) {
                return i;
            }
        }

        return index;
    }

    public int searchProduct(String title) {
        int index = -1;
        for(int i = 0; i < itemsOrdered.size(); i++) {
            Media item = itemsOrdered.get(i);
            if(item.isMatch(title)) {
                return i;
            }
        }
        return index;
    }

    public void removeMedia(int id) {
        itemsOrdered.remove(id);
    }

    public void removeMedia(Media media) {
        for(int i = 0; i < itemsOrdered.size(); i++) {
            if(itemsOrdered.get(i).equals(media)) {
                itemsOrdered.remove(i);
                break;
            }
        }
    }

    public float totalCost() {
        float cartTotal = 0f;
        for(int i = 0; i < itemsOrdered.size(); i++) {
            cartTotal += itemsOrdered.get(i).getCost();
        }
        return cartTotal;
    }


    public void printCart() {
        System.out.println("***********************CART***********************");
        for(int i = 0; i < itemsOrdered.size(); i++) {
            Media item = itemsOrdered.get(i);
            System.out.println(item.toString());
        }
        System.out.printf("Total cost: %f\n", totalCost());
        System.out.println("***************************************************");

    }

    public void placeOrder() {
        itemsOrdered.removeAll(itemsOrdered);
    }

    public ObservableList<Media> getItemsOrdered() {
        return itemsOrdered;
    }

    public int getCountItem() {
        return itemsOrdered.size();
    }
}
