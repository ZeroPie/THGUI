package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent parent         = FXMLLoader.load(getClass().getResource("numberSlider.fxml"));
        AnchorPane anchorpane = new AnchorPane();
        Scene scene           = new Scene(anchorpane);

        primaryStage.setScene(scene);
        primaryStage.setScene(new Scene(parent, 400, 300));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
