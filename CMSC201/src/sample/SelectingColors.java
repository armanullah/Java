package sample;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.text.Text;

import java.util.Scanner;

public class SelectingColors extends Application {
    //Sliders and labels
    Text text = new Text("Color selector");
    Slider Red = new Slider();
    Slider Blue = new Slider();
    Slider Green = new Slider();
    Slider Opacity = new Slider();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        StackPane textPane= new StackPane(text);
        textPane.setPadding(new Insets(20,10,5,10));

        //Slider range
        Red.setMin(0.0);
        Red.setMax(1.0);

        Green.setMin(0.0);
        Green.setMax(1.0);

        Blue.setMin(0.0);
        Blue.setMax(1.0);

        Opacity.setMin(0.0);
        Opacity.setMax(1.0);

        //Listeners
        Red.valueProperty().addListener(ov->Color());
        Green.valueProperty().addListener(ov->Color());
        Blue.valueProperty().addListener(ov->Color());
        Opacity.valueProperty().addListener(ov->Color());
        Opacity.setValue(1);

        GridPane sliderPane = new GridPane();
        sliderPane.setAlignment(Pos.CENTER);
        sliderPane.setVgap(5);
        sliderPane.setHgap(5);

        sliderPane.add(new Label("Red"),0,0);
        sliderPane.add(Red, 1, 0);

        sliderPane.add(new Label("Green"),0,1);
        sliderPane.add(Green, 1, 1);

        sliderPane.add(new Label("Blue"),0,2);
        sliderPane.add(Blue, 1, 2);

        sliderPane.add(new Label("Opacity"),0,3);
        sliderPane.add(Opacity,1,3);

        //Place nodes in a border pane
        BorderPane pane = new BorderPane();
        pane.setTop(textPane);
        pane.setCenter(sliderPane);

        //Scene
        Scene scene = new Scene(pane, 250, 150);
        primaryStage.setTitle("Color Selector");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void Color() {
        text.setFill(new Color(Red.getValue(),
                Green.getValue(), Blue.getValue(),
                Opacity.getValue()));
    }
}
