package com.Koper.Homework20171209.SpatialFigure;

public class Stozek implements SpatialFigure {
    private int r;
    private int l;
    private int h;

    public Stozek(int r, int l, int h) {
        this.r = r;
        this.l = l;
        this.h = h;
    }

    @Override
    public double obliczPolePowieszchni() {

        return (Math.PI*r*r)+Math.PI*r*l;
    }

    @Override
    public double obliczObjetosc() {

        return ((r*r)*Math.PI*h)/3;
    }
}
