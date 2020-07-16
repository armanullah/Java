package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {

    int x = 0;
    @Override
    public void start(Stage primaryStage) throws Exception {

    }

    public static void main(String[] args){
        launch(args);
    }
    public void clicker(TextField input){
        x++;
        if(x == 1){
            input.setText("You have clicked " + x + " time");
        }
        else if(x > 1){
            input.setText("You have clicked " + x + " times");
        }
    }

}


