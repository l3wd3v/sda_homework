package com.company.StatkiGame;

import java.util.Scanner;

public class ObslugaGry {
    private Scanner scanner;
    private PoleDoGry poleGracza;

    public ObslugaGry() {
        scanner = new Scanner(System.in);
        poleGracza = new PoleDoGry("Gracz");
    }

    public boolean wczytajStatek() {
        System.out.println("Podaj kolumne do wprowadzenia statku: (0-9)");
        int kolumnaDoWprowadzenia = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj wiersz do wprowadzenia statku: (0-9)");
        int wierszDoWprowadzenia = scanner.nextInt();
        scanner.nextLine();
        if (poleGracza.sprawdzStrzal(kolumnaDoWprowadzenia, wierszDoWprowadzenia).equals(StatusPola.PUSTE)) {
            poleGracza.wprowadzStatek(kolumnaDoWprowadzenia, wierszDoWprowadzenia);
            System.out.println("Wprowadzono statek na pozycji: "+kolumnaDoWprowadzenia+wierszDoWprowadzenia);
            poleGracza.wyswietlPole();
            return true;
        } else {
            System.out.println("To pole jest już zajete!");
            poleGracza.wyswietlPole();
            return false;
        }
    }
    public boolean wczytajStrzal() {
        System.out.println("Podaj kolumne do strzalu: (0-9)");
        int kolumnaDoStrzalu = scanner.nextInt();
        System.out.println("Podaj wiersz do strzalu: (0-9)");
        int wierszDoStrzalu = scanner.nextInt();

        poleGracza.wprowadzStrzal(kolumnaDoStrzalu, wierszDoStrzalu);
        if (poleGracza.czyWszystkieZatopione()) {
            return true;
        }
        poleGracza.wyswietlPole();
        return false;
    }





}
