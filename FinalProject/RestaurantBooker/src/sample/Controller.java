package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;

public class Controller {

    @FXML
    private DatePicker scheduleDate;

    @FXML
    private ComboBox<Integer> comboBox;

    @FXML
    private Button confirmButton;

    public void initialize() {
        final ComboBox comboBox = new ComboBox();
        comboBox.getItems().addAll(1, 2, 3, 4, 5, 6, 7, 8);
    }
}
