package com.company.StatkiGame;

public class MainStatki {
    public static void main(String[] args) {
        ObslugaGry nowaGra = new ObslugaGry();
        // petla wczytywania statkow
        for (int i = 0; i < 5; i++) {
            nowaGra.wczytajStatek();
        }
        // petla gry
        boolean exit = false;
        while (!exit) {
            exit = nowaGra.wczytajStrzal();
        }
        System.out.println("Wygrales z samym soba. Gratulacje!");
    }
}
