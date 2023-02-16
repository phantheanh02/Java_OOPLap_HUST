// PainterController.java
// Nguyen Duy Doanh 20204948
package hust.soict.globalict.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class PainterController {

    // Khu vực vẽ
    @FXML
    private Pane drawingAreaPane;

    // Chọn chế độ xóa
    @FXML
    private RadioButton radioEraserMode;

    // Chọn chế độ vẽ
    @FXML
    private RadioButton radioPenDrawMode;

    // Bút vẽ mặc định có màu đen
    private Color currentColor = Color.BLACK;
    @FXML
    // Khi nhấn clear, xóa tất cả
    void clearButtonPressed(ActionEvent event) {
        drawingAreaPane.getChildren().clear();
    }

    // Sự kiện khi click chuột và di trong vùng vẽ
    @FXML
    void drawingAreaMouseDragged(MouseEvent event) {
        Circle newCircle = new Circle(event.getX(), event.getY(), 4, currentColor);
        drawingAreaPane.getChildren().add(newCircle);
    }
    // Đổi màu mực sang trắng nếu là xóa
    @FXML
    void eraserMode(ActionEvent event) {
        currentColor = Color.WHITE;
        System.out.println(event);
    }

    // Nếu vẽ thì đổi màu mực là đen
    @FXML
    void penMode(ActionEvent event) {
        currentColor = Color.BLACK;
        System.out.println(event);
    }

}

