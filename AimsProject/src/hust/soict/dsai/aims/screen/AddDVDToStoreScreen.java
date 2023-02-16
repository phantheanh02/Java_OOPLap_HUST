/*
 * Họ và tên: Phan Thế Anh
 * MssV: 20204941
 * Mã lớp: 721428
*/
package hust.soict.dsai.aims.screen;
import hust.soict.dsai.aims.data.InitData;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddDVDToStoreScreen extends AddItemToStoreScreen{
    private Store myStore = InitData.myStore;
    // Create constructor
    public AddDVDToStoreScreen() {
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
        cp.add(createNorth(), BorderLayout.NORTH);
        cp.add(renderAddDVDScreen(), BorderLayout.CENTER);

        setVisible(true);
        setTitle("Store");
        setSize(1024, 768);

    }

    JPanel renderAddDVDScreen() {	
        JPanel layout = new JPanel();
        layout.setLayout(new GridLayout(3, 3, 2, 2));
        // Input Title
        JPanel inputTitleGroup = this.inputGroup("Title", 20);
        layout.add(inputTitleGroup);
        // Input category
        JPanel inputCategoryGroup = this.inputGroup("Category", 20);
        layout.add(inputCategoryGroup);
        // Input director
        JPanel inputDirectorGroup = this.inputGroup("Director", 20);
        layout.add(inputDirectorGroup);
        // Input Length
        JPanel inputLengthGroup = this.inputGroup("Length", 20);
        layout.add(inputLengthGroup);
        // Input Cost
        JPanel inputCostGroup = this.inputGroup("Cost", 20);
        layout.add(inputCostGroup);

        // Submit button
        layout.add(submitButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Create new DVD
                DigitalVideoDisc dvd = new DigitalVideoDisc(getValueTextField(inputTitleGroup), 
                		getValueTextField(inputCategoryGroup), getValueTextField(inputDirectorGroup), 
                		Integer.valueOf(getValueTextField(inputLengthGroup)) ,Float.valueOf(getValueTextField(inputCostGroup)));
                System.out.println(dvd);
                // Add DVD to store
                myStore.addMedia(dvd);
                System.out.println(myStore.getItemsInStore());
            }
        }));
        return layout;
    }
}
