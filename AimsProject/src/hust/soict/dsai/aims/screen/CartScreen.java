/*
 *  Họ và tên: Phan Thế Anh
 *  MssV: 20204941
 *  Mã lớp: 721428
*/
package hust.soict.dsai.aims.screen;

import java.io.IOException;

import javax.naming.LimitExceededException;
import javax.swing.JFrame;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.data.InitData;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
public class CartScreen extends JFrame {
    private Cart cart;
    // Create constructor 
    public CartScreen(Cart cart) {
        super();

        this.cart = cart;
        
        JFXPanel fxPanel = new JFXPanel(); // Create new object JFXPanel
        this.add(fxPanel);

        this.setTitle("Cart"); // Set title
        this.setVisible(true); // Set visible
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                try {
                    FXMLLoader loader = new FXMLLoader(getClass()
                    		.getResource("/screen/cart.fxml")); // Get resource from file cart.fxml
                    CartScreenController controller = 
                    		new CartScreenController(cart); // Create new object CartScreenController to control
                    loader.setController(controller);
                    Parent root = loader.load(); // Create a root
                    fxPanel.setScene(new Scene(root)); // Set scene for fxPanel
                } catch(IOException e) { // Exception	
                    e.printStackTrace();
                }
            }
        });
    }
    
    public static void main(String[] args) throws LimitExceededException {
		InitData.init();
		new CartScreen(InitData.myCart);
	}
}
