package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class FirstWindow extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FirstWindow.fxml"));
        Pane load = loader.load();

        Scene scene = new Scene(load);
        stage.setScene(scene);
        stage.setTitle("Car Rental Service");
        stage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
