package com.Koper.Homework20171209.SpatialFigure;

public class Prostopadloscian implements SpatialFigure{

    private int a;
    private int b;
    private int h;

    public Prostopadloscian(int a, int b, int h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    @Override
    public double obliczPolePowieszchni() {
        return 2*(a*b + b*h + h*a);
    }

    @Override
    public double obliczObjetosc() {
        return a*b*h;
    }
}
