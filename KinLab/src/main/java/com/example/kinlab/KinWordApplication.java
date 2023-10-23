package com.example.kinlab;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

import java.util.ArrayList;
import java.util.List;


public class KinWordApplication extends Application {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;

    @Override
    public void start(Stage stage) {
        stage.setTitle("КИН");
        stage.setWidth(WIDTH);
        stage.setHeight(HEIGHT);

        Group root = new Group();
        Scene scene = new Scene(root, WIDTH, HEIGHT, Color.WHITE);

        List<Line> allLetters = new ArrayList<>();
        allLetters.addAll(LetterTPL.DEFAULT_FIRST_LETTER);
        allLetters.addAll(LetterTPL.DEFAULT_SECOND_LETTER);
        allLetters.addAll(LetterTPL.DEFAULT_THIRD_LETTER);

        allLetters.forEach(x -> root.getChildren().addAll(x));


        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}