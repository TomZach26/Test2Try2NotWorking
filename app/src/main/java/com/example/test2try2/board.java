package com.example.test2try2;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.GridLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class board extends GridLayout {

    private int rows = 8;
    private int columns = 8;
    private int squareSize = 100;
    private Stack<Integer> recycle, colors;
    RndColor rndColor;
    ArrayList<String> colorbank=new ArrayList<>();

    public board(Context context) {

        super(context);


        colorbank.add("0xfff44336");
        colorbank.add("0xffe91e63");
        colorbank.add("0xff9c27b0");
        colorbank.add("0xff673ab7");
        colorbank.add("0xff3f51b5");
        colorbank.add("0xff2196f3");
        colorbank.add("0xff03a9f4");
        colorbank.add("0xff00bcd4");
        colorbank.add("0xff009688");
        colorbank.add("0xff4caf50");
        colorbank.add("0xff8bc34a");
        colorbank.add("0xffcddc39");
        colorbank.add("0xffffeb3b");
        colorbank.add("0xffffc107");
        colorbank.add("0xffff9800");
        colorbank.add("0xffff5722");
        colorbank.add("0xff795548");
        colorbank.add("0xff9e9e9e");
        colorbank.add("0xff607d8b");
        colorbank.add("0xff333333");



        System.out.println("Original List : \n" + colorbank);


        Collections.shuffle(colorbank);


        System.out.println("\nShuffled List : \n" + colorbank);



        setRowCount(rows);
        setColumnCount(columns);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                TextView square = new TextView(context);
                square.setWidth(squareSize);
                square.setHeight(squareSize);
                square.setGravity(Gravity.CENTER);
                    square.setBackgroundColor(finalcolor());
                addView(square);
            }
        }
    }

    private int finalcolor() {
        colorbank(0) =
    }


}