package view;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.io.IOException;

public class FirstWindow_Controller {


    @FXML
     TextField city_name;

    @FXML
     DatePicker from;

    @FXML
     DatePicker to;


    @FXML
    public void initialize(){


    }


    @FXML
    public void setSearch(){

        try {
            new SecondWindow();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }




}
