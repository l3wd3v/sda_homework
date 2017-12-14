package com.Koper.Homework20171209.UczestnikKursu;

public class Uczestnik {
    private boolean present;
    private String name;

    public Uczestnik(String name) {
        this.name = name;
    }

    public boolean isPresent() {
        return present;
    }

    public void setPresent(boolean present) {
        this.present = present;
    }

    public String getName() {
        return name;
    }
}
