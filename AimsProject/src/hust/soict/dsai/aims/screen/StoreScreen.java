package hust.soict.dsai.aims.screen;

import hust.soict.dsai.aims.Aims;
import hust.soict.dsai.aims.data.InitData;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.store.Store;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;

import javax.naming.LimitExceededException;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class StoreScreen extends JFrame {
    private Store store;
    // Render UI
    public StoreScreen(Store store) {
            this.store = store;
            Container cp = getContentPane();
            cp.setLayout(new BorderLayout());
            // North Layout
            cp.add(createNorth(), BorderLayout.NORTH);

            // Center Layout
            cp.add(createCenter(), BorderLayout.CENTER);

            setVisible(true);
            setTitle("Store");
            setSize(1024, 768);
    }

    // North Layout
    JPanel createNorth() {
        JPanel north = new JPanel();
        north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
        north.add(createMenuBar());
        north.add(createHeader());
        return north;
    }

    // Menu
    JMenuBar createMenuBar() {
        JMenu menu = new JMenu("Options");
        
        Aims.MenuItemListener menuItemListener = new Aims.MenuItemListener();
        JMenu smUpdateStore = new JMenu("Update Store");
        smUpdateStore.add(new JMenuItem("Add Book"));
        smUpdateStore.add(new JMenuItem("Add CD"));
        smUpdateStore.add(new JMenuItem("Add DVD"));
        
        menu.add(smUpdateStore);
        menu.add(new JMenuItem("View store"));
        menu.add(new JMenuItem("View cart"));
        
        JMenuBar menuBar = new JMenuBar();
        menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
        menuBar.add(menu);
        // Add các Menu Con
        JMenuItem addBookMenu = new JMenuItem("Add Book");
        addBookMenu.setActionCommand("add_book");
        addBookMenu.addActionListener(menuItemListener);
        smUpdateStore.add(addBookMenu);

        JMenuItem addCDMenu = new JMenuItem("Add CD");
        addCDMenu.setActionCommand("add_cd");
        addCDMenu.addActionListener(menuItemListener);
        smUpdateStore.add(addCDMenu);

        JMenuItem addDvdMenu = new JMenuItem("Add DVD");
        addDvdMenu.setActionCommand("add_dvd");
        addDvdMenu.addActionListener(menuItemListener);
        smUpdateStore.add(addDvdMenu);

        menu.add(smUpdateStore);

        JMenuItem viewStoreMenu = new JMenuItem("View Store");
        viewStoreMenu.setActionCommand("view_store");
        viewStoreMenu.addActionListener(menuItemListener);
        menu.add(viewStoreMenu);

        JMenuItem viewCartMenu = new JMenuItem("View Cart");
        viewCartMenu.setActionCommand("view_cart");
        viewCartMenu.addActionListener(menuItemListener);
        menu.add(viewCartMenu);


        menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
        menuBar.add(menu);
        return menuBar;
    }

    // Create Header
    JPanel createHeader() {
        JPanel header = new JPanel();
        header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));
        // Title
        JLabel title = new JLabel("AIMS");
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
        title.setForeground(Color.CYAN);

        // Button ViewCart
        JButton cart = new JButton("View Cart");
        cart.setPreferredSize(new Dimension(100, 50));
        cart.setMaximumSize(new Dimension(100, 50));

        header.add(Box.createRigidArea(new Dimension(10, 10)));
        header.add(title);
        header.add(Box.createHorizontalGlue());
        header.add(cart);
        header.add(Box.createRigidArea(new Dimension(10, 10)));
        
        return header;
    }

    // Render Center
    JPanel createCenter() {
        JPanel center = new JPanel();
        // Layout Grid
        center.setLayout(new GridLayout(3, 3, 2, 2));
        ArrayList<Media> mediaInStore = store.getItemsInStore();
        // Lắng nghe sự thay đổi danh sách sản phẩm để update UI
//        mediaInStore.addListener((ListChangeListener<Media>) change -> {
//            while (change.next()) {
//                if (change.wasAdded()) {
//                    System.out.println(change.getAddedSubList().get(0)
//                            + " was added from the list!");
//                    MediaStore cell = new MediaStore(change.getAddedSubList().get(0), this);
//                    center.add(cell);
//                    center.revalidate();
//
//                } else if (change.wasRemoved()) {
//                    System.out.println(change.getRemoved().get(0)
//                            + " was removed from the list!");
//                }
//            }
//        });
        // Render UI
        for(int i = 0; i < mediaInStore.size(); i++) {
            MediaStore cell = new MediaStore(mediaInStore.get(i),this);
            center.add(cell);
        }
        return center;
    }

    public static void main(String[] args) throws LimitExceededException {
    	InitData.init();
		new StoreScreen(InitData.myStore);
	}

}
