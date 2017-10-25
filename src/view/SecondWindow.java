package view;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class SecondWindow  {

    public SecondWindow() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("SecondWindow.fxml"));
        Pane load = loader.load();
        Stage stage = new Stage();
        stage.setTitle("Car Rental Service");
        Scene scene = new Scene(load);
        stage.setScene(scene);
        stage.show();
    }





}
