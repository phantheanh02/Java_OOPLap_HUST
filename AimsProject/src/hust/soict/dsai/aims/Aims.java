/*
 *  Họ và tên: Phan Thế Anh
 *  MssV: 20204941
 *  Mã lớp: 721428
*/
package hust.soict.dsai.aims;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.data.InitData;
import hust.soict.dsai.aims.screen.*;
import hust.soict.dsai.aims.store.Store;

import javax.naming.LimitExceededException;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aims {
    private static JFrame currentView;
    private static Store myStore;
    private static Cart myCart;
    public static void main(String[] args) throws LimitExceededException {
        InitData.init();
        myStore = InitData.myStore;
        myCart = InitData.myCart;
        // Show windows
        currentView = new StoreScreen(myStore);
    }

    // Menubar
    public static class MenuItemListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            // View store
            if(command.equals("view_store")) {
                currentView = new StoreScreen(myStore);
            } 
            // View cart
            else if(command.equals("view_cart")) {
                currentView = new CartScreen(myCart);
            }
            else if(command.equals("add_dvd")) { // Add DVD
                new AddDVDToStoreScreen();
            } else if(command.equals("add_cd")) { // Add CD
                new AddCDToStoreScreen();
            }  else if(command.equals("add_book")) { // Add Book
                new AddBookToStoreScreen();
            }
            System.out.println(e.getActionCommand() + " JMenuItem clicked.");
        }
    }




}