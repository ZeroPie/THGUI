package sample;

import javafx.fxml.FXML;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Orientation;
import javafx.scene.control.ListView;
import javafx.scene.control.Slider;


public class Controller {

    @FXML
    private ListView<String> myListView;

    @FXML
    private Slider mySlider;

    @FXML
    private void initialize() {

        initializeList();
        //Event Handler
        mySlider.valueProperty().addListener((observable, oldValue, newValue) -> {
            slideListElement(newValue.intValue());
        });


    }

    private void slideListElement(int index) {
        myListView.getSelectionModel().select(index);
        myListView.getFocusModel().focus(index);
    }

    private void initializeList() {
        myListView.setOrientation(Orientation.HORIZONTAL);
        ObservableList<String> listViewData  = FXCollections.observableArrayList ("0", "1", "2", "3", "4", "5", "6", "7", "8", "9");
        myListView.setItems(listViewData);
    }


}
