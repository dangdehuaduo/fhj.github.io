package com.homeworks.hw09;

public class LabeledPoint extends Point{
    private String labeled;

    public LabeledPoint(String labeled, int x, int y){
        super(x, y);
        this.labeled = labeled;
    }
}
