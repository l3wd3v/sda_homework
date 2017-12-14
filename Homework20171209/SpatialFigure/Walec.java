package com.Koper.Homework20171209.SpatialFigure;

public class Walec implements SpatialFigure {
    private int r;
    private int h;

    public Walec(int r, int h) {
        this.r = r;
        this.h = h;
    }

    @Override
    public double obliczPolePowieszchni() {

        return (2*Math.PI*r*r) + (2*Math.PI*r*h);
    }

    @Override
    public double obliczObjetosc() {

        return Math.PI*r*r*h;
    }
}
