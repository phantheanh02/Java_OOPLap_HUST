/*
 * Họ và tên: Phan Thế Anh
 * MssV: 20204941
 * Mã lớp: 721428
*/
package hust.soict.dsai.aims.screen;
import hust.soict.dsai.aims.data.InitData;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.store.Store;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddCDToStoreScreen extends AddItemToStoreScreen {
    private Store myStore = InitData.myStore;
    // Constructor
    public AddCDToStoreScreen() {
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
        cp.add(createNorth(), BorderLayout.NORTH);
        cp.add(renderAddCDScreen(), BorderLayout.CENTER);

        setVisible(true);
        setTitle("Store");
        setSize(1024, 768);

    }

    // Add CD
    JPanel renderAddCDScreen() {
        JPanel layout = new JPanel();
        layout.setLayout(new GridLayout(3, 3, 2, 2));
        // Input Title
        JPanel inputTitleGroup = this.inputGroup("Title", 20);
        layout.add(inputTitleGroup);
        // Input category
        JPanel inputArtistGroup = this.inputGroup("Artist", 20);
        layout.add(inputArtistGroup);
        // Input director
        JPanel inputDirectorGroup = this.inputGroup("Director", 20);
        layout.add(inputDirectorGroup);
        // Input Cost
        JPanel inputCostGroup = this.inputGroup("Cost", 20);
        layout.add(inputCostGroup);

        // Submit button
        layout.add(submitButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Create new CD
                CompactDisc cd = new CompactDisc(getValueTextField(inputArtistGroup), 
                		getValueTextField(inputTitleGroup), getValueTextField(inputDirectorGroup), 
                		Float.valueOf(getValueTextField(inputCostGroup)));
                // Add CD to store
                myStore.addMedia(cd);
            }
        }));
        return layout;
    }
}
