/*
 *  Họ và tên: Phan Thế Anh
 *  MssV: 20204941
 *  Mã lớp: 721428
*/package hust.soict.dsai.aims.store.controller;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.data.InitData;
import hust.soict.dsai.aims.exception.PlayerException;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

import javax.naming.LimitExceededException;
import java.util.Scanner;

public class StoreController {
    public static Store myStore = InitData.myStore;
    public static Cart myCart = InitData.myCart;

    /**
     * In các sản phẩm có trong giỏ hàng
     */
    public static void printStore() {
        System.out.println("Danh sách các sản phẩm có trong cửa hàng");
        myStore.printStore();
    }

    /**
     * Thêm sản phẩm vào cart
     */
    public static void addToCart() {
        int productIndex = getIndex();
        try {
            myCart.addMedia(myStore.getItemByIndex(productIndex));
        } catch (LimitExceededException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Số sản phẩm có trong giỏ hàng là: " + myCart.getCountItem());
    }

    /**
     * Tính năng play
     */
    public static void playItem() {
        int productIndex = getIndex();
        if(myStore.getItemByIndex(productIndex) instanceof DigitalVideoDisc || myStore.getItemByIndex(productIndex) instanceof CompactDisc) {
            DigitalVideoDisc item = (DigitalVideoDisc) myStore.getItemByIndex(productIndex);
            try {
                item.play();
            } catch (PlayerException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("Sản phẩm này không phải là DVD, không hỗ trợ play");
        }
    }

    /**
     * Thêm sản phẩm vào cửa hàng
     */
    public static void addToStore() {
        System.out.println("Chọn loại sản phẩm cần thêm: ");
        System.out.println("1. DVD");
        System.out.println("2. CD");
        System.out.println("3. Book");
        Scanner sc = new Scanner(System.in);
        int type = sc.nextInt();
        // Loại DVD
        if(type == 1) {
            sc.nextLine(); // Bỏ qua enter
            System.out.print("Nhập tên sản phẩm: ");
            String name = sc.nextLine();
            System.out.print("Nhập danh mục: ");
            String category = sc.nextLine();
            System.out.print("Nhập tên tác giả: ");
            String director = sc.nextLine();
            System.out.print("Nhập thời lượng: ");
            int length = sc.nextInt();
            System.out.print("Nhập giá: ");
            float cost = sc.nextFloat();
            // Thêm vào cửa hàng
            DigitalVideoDisc dvd = new DigitalVideoDisc(name, category, director, length, cost);
            myStore.addMedia(dvd);
        }
    }

    /**
     * Xóa sản phẩm khỏi cửa hàng
     */
    public static void removeFromStore() {
        System.out.println("Nhập tiêu đề sản phẩm cần xóa");
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        int index = myStore.isExist(title);
        if(index == -1) {
            System.out.println("Sản phẩm này không tồn tại");
        } else {
            System.out.println("Đã xóa sản phẩm " + title + " khỏi cửa hàng");
            myStore.removeMedia(index);
        }
    }

    /**
     * Lấy index sản phẩm theo tiêu đề
     * @return
     */
    private static int getIndex() {
        Scanner sc = new Scanner(System.in);
        int productIndex = -1;
        // Kiểm tra xem sản phẩm đó có tồn tại không
        while(true) {
            System.out.println("Vui lòng nhập tên sản phẩm");
            String title = sc.nextLine();
            productIndex = myStore.isExist(title);
            if(productIndex >= 0) {
                break;
            } else {
                System.out.println("Cửa hàng không có sản phẩm nào là " + title);
            }
        }

        return productIndex;
    }
}
