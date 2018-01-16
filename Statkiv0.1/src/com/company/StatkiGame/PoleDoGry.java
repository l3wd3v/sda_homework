package com.company.StatkiGame;

public class PoleDoGry {
    private String wlascicielPola;
    private ElementPola[][] pole;


    public PoleDoGry(String wlascicielPola) {
        this.wlascicielPola = wlascicielPola;
        this.pole = new ElementPola[10][10];
        for (int i=0; i<pole.length; i++) {
            for (int j = 0; j < pole[i].length; j++) {
                pole[i][j] = new ElementPola();
            }
        }
    }

    public String getWlascicielPola() {
        return wlascicielPola;
    }


    public void wyswietlPole() {
        for (int i=0; i<pole.length; i++) {
            System.out.println();
            for (int j=0; j<pole[i].length; j++) {
                if (pole[j][i].getStatus().equals(StatusPola.PUSTE)) {
                    System.out.print("-");
                } else if (pole[j][i].getStatus().equals(StatusPola.STATEK_TRAFIONY)) {
                    System.out.print("x");
                } else if (pole[j][i].getStatus().equals(StatusPola.STATEK_NIETRAFIONY)) {
                    System.out.print("o");
                }
            }
        }
        System.out.println();
    }
    public void wprowadzStrzal(int kolumna, int wiersz) {
        switch (sprawdzStrzal(kolumna, wiersz)) {
            case PUSTE:
                System.out.println("Pudlo");
                break;
            case STATEK_NIETRAFIONY:
                pole[kolumna][wiersz].setStatus(StatusPola.STATEK_TRAFIONY);
                System.out.println("Trafiony!");
                break;
            case STATEK_TRAFIONY:
                System.out.println("Juz strzelałeś w to miejsce i trafiles!");
                break;

        }
    };
    public void wprowadzStatek(int kolumna, int wiersz) {
        pole[kolumna][wiersz].setStatus(StatusPola.STATEK_NIETRAFIONY);
    }

    public StatusPola sprawdzStrzal(int kolumna, int wiersz) {
        return pole[kolumna][wiersz].getStatus();
    };

    public boolean czyWszystkieZatopione() {
        for (int i=0; i<pole.length; i++) {
            for (int j=0; j<pole[i].length; j++) {
                if (pole[j][i].getStatus().equals(StatusPola.STATEK_NIETRAFIONY))
                    return false;
            }
        }
        return true;
    }
}
