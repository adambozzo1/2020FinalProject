package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DataSource {
    public static ObservableList<Restaurant> getAllRestaurants(){
        ObservableList<Restaurant> info = FXCollections.observableArrayList();

        info.add(new Restaurant("Test Name", 50, "123 Test Rd, Oshawa, ON, L1N5V4", "American"));
        info.add(new Restaurant("Test Name2", 80, "456 Test Rd, Oshawa, ON, L1N5V4", "Indian"));

        return info;
    }
}
