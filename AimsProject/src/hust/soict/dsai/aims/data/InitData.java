/*
 *  Họ và tên: Phan Thế Anh
 *  MssV: 20204941
 *  Mã lớp: 721428
*/
package hust.soict.dsai.aims.data;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.model.Track;
import hust.soict.dsai.aims.store.Store;

import javax.naming.LimitExceededException;

public class InitData {
    public static  Store myStore = new Store();
    public static  Cart myCart = new Cart();

    public static void init() throws LimitExceededException{
        // Tạo các DVD có trong cửa hàng
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Mẹ chồng nàng dâu", "Truyền hình", "Truyền hình hay", 21 ,24.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Winx", "Hoạt hình", "Change", 54 ,99.7f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Doraemon", "Hoạt hình", "Hoạt hình cho trẻ em", 65 ,90f);
        // Tạo các CD có trong cửa hàng
        CompactDisc cd1 = new CompactDisc("Phan Thế Anh", "Nhạc vip", 75.5f);
        cd1.addTrack(new Track("Vip 1", 13));
        cd1.addTrack(new Track("Vip 2", 24));


        CompactDisc cd2 = new CompactDisc("Sơn Tùng", "Những ca khúc triệu view", "Sơn Tùng", 25.99f);
        cd2.addTrack(new Track("Cơn mưa ngang qua", 2));
        cd2.addTrack(new Track("Em của ngày hôm qua", 2));

        // Tạo các Book có trong cửa hàng
        Book book1 = new Book("Giải tích I", "Toán cao cấp", 20f);
        Book book2 = new Book("Giải tích II", "Toán cao cấp", 20f);
        Book book3 = new Book("Giải tích III", "Toán cao cấp", 20f);
        Book book4 = new Book("Lập trình hướng đối tượng", "Chuyên ngành IT", 9f);
        myStore.addMedia(dvd1, dvd2, dvd3, cd1, cd2, book1, book2, book3, book4);

        myCart.addMedia(dvd1, cd2);
    }
}
