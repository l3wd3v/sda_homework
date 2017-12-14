package com.Koper.Homework20171209.Interfejsy;

public class Kolarstwo implements Sport {
    @Override
    public void uprawiaj() {
        System.out.println("jade rowerem");
    }

    @Override
    public void trenuj() {
        System.out.println("jade rowerem i wszystko spisuje");
    }

    @Override
    public void rywalizuj() {
        System.out.println("jade i wygrywam");
    }
}
