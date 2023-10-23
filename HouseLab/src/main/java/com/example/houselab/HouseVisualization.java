package com.example.houselab;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class HouseVisualization extends Application {
    @Override
    public void start(Stage stage) {
        Group group = new Group();
        Scene scene = new Scene(group, 800, 800, Color.WHITE);
        stage.setTitle("House Visualization");

        Rectangle house = new Rectangle(100, 200, 200, 150);
        house.setFill(Color.BEIGE);

        Polygon roof = new Polygon();
        roof.getPoints().addAll(
                100.0, 200.0,
                300.0, 200.0,
                200.0, 100.0
        );
        roof.setFill(Color.BROWN);

        Polygon pipe = new Polygon();
        pipe.getPoints().addAll(
                130.0, 170.0,
                130.0, 85.0,
                150.0, 85.0,
                150.0, 150.0
        );
        pipe.setFill(Color.ROSYBROWN);

        Rectangle window = new Rectangle(140, 240, 60, 60);
        window.setFill(Color.LIGHTBLUE);
        Rectangle windowLineVertical = new Rectangle(167, 240, 5, 60);
        windowLineVertical.setFill(Color.WHITE);
        Rectangle windowLineHorizontal = new Rectangle(140, 267, 60, 5);
        windowLineHorizontal.setFill(Color.WHITE);

        Rectangle door = new Rectangle(240, 250, 50, 100);
        door.setFill(Color.DARKRED);
        Rectangle doorKnob = new Rectangle(250, 300, 12, 6);
        doorKnob.setFill(Color.BEIGE);

        Rectangle borderBase = new Rectangle(80, 250, 250, 10);
        borderBase.setFill(Color.BLACK);

        List<Rectangle> borderBoards = new ArrayList<>();
        for (int i = 80; i < 350; i = i + 50) {
            Rectangle board = new Rectangle(i, 250, 10, 100);
            board.setFill(Color.BLACK);
            borderBoards.add(board);
        }

        group.getChildren().addAll(
                house,
                roof,
                pipe,
                window,
                windowLineVertical,
                windowLineHorizontal,
                door,
                doorKnob,
                borderBase);
        group.getChildren().addAll(borderBoards);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}