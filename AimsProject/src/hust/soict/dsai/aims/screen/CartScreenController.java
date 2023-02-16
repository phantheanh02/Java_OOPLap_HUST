/*
 *  Họ và tên: Phan Thế Anh
 *  MssV: 20204941
 *  Mã lớp: 721428
*/
package hust.soict.dsai.aims.screen;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.exception.PlayerException;
import hust.soict.dsai.aims.media.Disc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Playable;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ListChangeListener;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;


public class CartScreenController {
    private Cart cart;
    @FXML
    private TableColumn<Media, Float> colMediaCost; // Create table column

    @FXML
    private TableColumn<Media, String> colMediaTitle; // Create table column

    @FXML
    private TableColumn<Media, String> colMediaCategory; // Create table column

    @FXML
    private TableView<Media> tblMedia; // Create table 

    @FXML
    private Button btnPlay;

    @FXML
    private Button btnRemove;

    @FXML
    private Button btnPlaceOrder;
    @FXML
    private TextField tfFilter;

    @FXML
    private ToggleGroup filterCategory;

    @FXML
    private RadioButton radioBtnFilterId;

    @FXML
    private RadioButton radioBtnFilterTitle;

    @FXML
    private Label totalCostLabel;

    // List filtered
    private FilteredList<Media> filteredList;

    public CartScreenController(Cart cart) {
        super();
        this.cart = cart;
        this.filteredList = new FilteredList<Media>(cart.getItemsOrdered());
    }


    // Event
    @FXML
    private void initialize() {
        // Fill data to col
        colMediaCategory.setCellValueFactory(
                new PropertyValueFactory<Media, String>("category"));
        colMediaTitle.setCellValueFactory(
                new PropertyValueFactory<Media, String>("title"));
        colMediaCost.setCellValueFactory(
                new PropertyValueFactory<Media, Float>("cost"));

        tblMedia.setItems(this.cart.getItemsOrdered());
        
       // Set visible button
       btnPlay.setVisible(false);
       btnRemove.setVisible(false);
       
       tblMedia.getSelectionModel().selectedItemProperty().addListener(
            new ChangeListener<Media>() {
                    @Override
                    public void changed(ObservableValue<? extends Media> observable, Media oldValue, 
                    		Media newValue) {
                        if(newValue != null) {
                            // Update cart
                            updateButtonBar(newValue);
                        } else {
                            // Set visible button
                            btnPlay.setVisible(false);
                            btnRemove.setVisible(false);
                        }
                    }
            }

        );


        totalCostLabel.setText(String.valueOf(cart.totalCost()));


        // Event enter input
        tfFilter.textProperty().addListener(
                new ChangeListener<String>() {
                    @Override
                    public void changed(ObservableValue<? extends String> observable, String oldValue, 
                    		String newValue) {
                        showFilterMedia(newValue);
                    }
                }
        );

        /*
         *  Họ và tên: Phan Thế Anh
         *  MssV: 20204941
         *  Mã lớp: 721428
        */
        // Calculate total cost
        cart.getItemsOrdered().addListener((ListChangeListener<Media>) change -> {
            while (change.next()) {
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        totalCostLabel.setText(String.valueOf(cart.totalCost()) + " $"); // Update total cost
                        System.out.println("Update total cost");
                    }
                });

            }
        });
    }

    /*
     *  Họ và tên: Phan Thế Anh
     *  MssV: 20204941
     *  Mã lớp: 721428
    */
    // Create method for remove button
    @FXML
    void btnRemovePressed(ActionEvent event) {
        Media media = tblMedia.getSelectionModel().getSelectedItem();
        cart.removeMedia(media); // Remove
    }

    
    // Action when click button Place order
    @FXML
    void btnPlaceOrderPressed(ActionEvent event) {
        cart.placeOrder();
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Notification");
        alert.setHeaderText("Order Success!!!");
        alert.show();
    }

    /*
     *  Họ và tên: Phan Thế Anh
     *  MssV: 20204941
     *  Mã lớp: 721428
    */
    // Action when click button Play
    @FXML
    void btnPlayPressed(ActionEvent event) {
    	// Media selected
        Playable media = (Playable)tblMedia.getSelectionModel().getSelectedItem();
        // Get title
        String mediaTitle = tblMedia.getSelectionModel().getSelectedItem().getTitle();
        try {
            // Play
            media.play();
            // Notification
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Play");
            Disc disc = (Disc)media;
            alert.setHeaderText(mediaTitle + " from " + disc.getDirector());
            alert.show();
        } catch (PlayerException e) {
            // Exception
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(e.getLocalizedMessage());
            alert.show();
        }

    }

  

    void updateButtonBar(Media media) {
        btnRemove.setVisible(true); // Set visible button
        if(media instanceof Playable) {
            btnPlay.setVisible(true);
        } else {
            btnPlay.setVisible(false);
        }
    }

    /*
     *  Họ và tên: Phan Thế Anh
     *  MssV: 20204941
     *  Mã lớp: 721428
    */
    // Filter data
    void showFilterMedia(String filter) {
        filteredList.setPredicate(item -> {
            if(filter.isEmpty()) {
                return true;
            }
            try {
                // Filter by ID
                if(radioBtnFilterId.isSelected()) {
                    return String.valueOf(item.getId()).equals(filter);
                } else if(radioBtnFilterTitle.isSelected()) {
                	// Filter by title
                    return item.getTitle().contains(filter);
                }
            } catch(Exception e) {
                e.printStackTrace();
            }

            return true;

        });

    }


}
