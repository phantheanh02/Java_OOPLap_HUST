    /*
     *  Họ và tên: Phan Thế Anh
     *  MssV: 20204941
     *  Mã lớp: 721428
    */
package hust.soict.dsai.aims.screen;
import hust.soict.dsai.aims.Aims;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class AddItemToStoreScreen extends JFrame {
    protected JPanel centerLayout;
    public AddItemToStoreScreen() {
    	super();
    }

    JPanel createNorth() {
        JPanel north = new JPanel();
        north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
        north.add(createMenuBar());
        north.add(createHeader());
        return north;
    }

    // Header
    JPanel createHeader() {
        JPanel header = new JPanel();
        header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));

        JLabel title = new JLabel("AIMS");
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
        title.setForeground(Color.RED);
        header.add(Box.createRigidArea(new Dimension(10, 10)));
        header.add(title);
        header.add(Box.createHorizontalGlue());
        header.add(Box.createRigidArea(new Dimension(10, 10)));
        return header;
    }
    
    // Menu
    JMenuBar createMenuBar() {
        JMenu menu = new JMenu("Options");

        JMenu smUpdateStore = new JMenu("Update Store");
        smUpdateStore.add(new JMenuItem("Add Book"));
        smUpdateStore.add(new JMenuItem("Add CD"));
        smUpdateStore.add(new JMenuItem("Add DVD"));

        menu.add(smUpdateStore);
        Aims.MenuItemListener menuItemListener = new Aims.MenuItemListener();


        JMenuItem viewStoreMenu = new JMenuItem("View Store");
        viewStoreMenu.setActionCommand("view_store");
        viewStoreMenu.addActionListener(menuItemListener);
        menu.add(viewStoreMenu);

        JMenuItem viewCartMenu = new JMenuItem("View Cart");
        viewCartMenu.setActionCommand("view_cart");
        viewCartMenu.addActionListener(menuItemListener);
        menu.add(viewCartMenu);



        JMenuBar menuBar = new JMenuBar();

        menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
        menuBar.add(menu);
        return menuBar;
    }

    // Create input
    JPanel inputGroup(String label, int Column) {
        JPanel inputGroup = new JPanel();
        inputGroup.setLayout(new FlowLayout());
        JLabel inputLabel = new JLabel(label, JLabel.RIGHT);
        JTextField input = new JTextField(Column);
        inputGroup.add(inputLabel);
        inputGroup.add(input);
        return inputGroup;
    }

    // Create event
    JPanel submitButton(ActionListener actionListener) {
        JPanel buttonGroup = new JPanel();
        buttonGroup.setLayout(new FlowLayout());

        JButton submitButton = new JButton("Add Media");
        submitButton.addActionListener(actionListener);
        buttonGroup.setPreferredSize(new Dimension(100, 50));
        buttonGroup.setMaximumSize(new Dimension(100, 50));
        buttonGroup.add(submitButton);
        return buttonGroup;
    }

    // Get text from TextField
    String getValueTextField(JPanel element) {
        String result = "";
        Component[] components = element.getComponents();
        for (Component comp : components) {
            if (comp instanceof JTextField) {
                JTextField textField = (JTextField) comp;
                result = textField.getText();
                break;
            }
        }
        return result;
    }
}
