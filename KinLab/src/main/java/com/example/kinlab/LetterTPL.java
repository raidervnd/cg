package com.example.kinlab;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LetterTPL {
    public static List<Line> DEFAULT_FIRST_LETTER = new ArrayList<>();

    static {
        Line kWord1 = new Line(50, 50, 50, 350);
        kWord1.setStroke(Color.BLACK);
        kWord1.setStrokeWidth(10);

        Line kWord2 = new Line(55, 200, 200, 50);
        kWord2.setStroke(Color.BLACK);
        kWord2.setStrokeWidth(10);

        Line kWord3 = new Line(55, 200, 200, 350);
        kWord3.setStroke(Color.BLACK);
        kWord3.setStrokeWidth(10);
        DEFAULT_FIRST_LETTER.addAll(Arrays.asList(kWord1, kWord2, kWord3));
    }

    public static List<Line> DEFAULT_SECOND_LETTER = new ArrayList<>();

    static {
        Line iWord1 = new Line(250, 50, 250, 350);
        iWord1.setStroke(Color.DARKRED);
        iWord1.setStrokeWidth(10);

        Line iWord2 = new Line(253, 345, 447, 55);
        iWord2.setStroke(Color.DARKRED);
        iWord2.setStrokeWidth(10);

        Line iWord3 = new Line(450, 50, 450, 350);
        iWord3.setStroke(Color.DARKRED);
        iWord3.setStrokeWidth(10);
        DEFAULT_SECOND_LETTER.addAll(Arrays.asList(iWord1, iWord2, iWord3));
    }

    public static List<Line> DEFAULT_THIRD_LETTER = new ArrayList<>();

    static {
        Line nWord1 = new Line(500, 50, 500, 350);
        nWord1.setStroke(Color.PALEVIOLETRED);
        nWord1.setStrokeWidth(10);

        Line nWord2 = new Line(500, 200, 700, 200);
        nWord2.setStroke(Color.PALEVIOLETRED);
        nWord2.setStrokeWidth(10);

        Line nWord3 = new Line(700, 50, 700, 350);
        nWord3.setStroke(Color.PALEVIOLETRED);
        nWord3.setStrokeWidth(10);

        DEFAULT_THIRD_LETTER.addAll(Arrays.asList(nWord1, nWord2, nWord3));
    }
}
