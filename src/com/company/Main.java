package com.company;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.concurrent.TimeoutException;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        Rectangle rectangle = new Rectangle();
        rectangle.setX(500.0f);
        rectangle.setY(200.0f);
        rectangle.setHeight(200);
        rectangle.setWidth(100);

        Ellipse ellipse = new Ellipse();
        ellipse.setCenterX(600.0f);
        ellipse.setCenterY(700.0f);
        ellipse.setRadiusX(100.0f);
        ellipse.setRadiusY(150.0f);

        Line line = new Line();
        line.setStartX(130.0);
        line.setStartY(650.0);
        line.setEndX(400.0);
        line.setEndY(580.0);

        Text text = new Text("ТОЧКА ТУТ -> .");
        text.setX(500);
        text.setY(100);


        Group root = new Group(rectangle, ellipse,line,text);

        Scene scene = new Scene(root, 1000, 900);
        stage.setTitle("Легкая(нет)");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String args[]){
        launch(args);
    }
}