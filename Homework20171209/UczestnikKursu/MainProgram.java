package com.Koper.Homework20171209.UczestnikKursu;

import java.util.Scanner;

public class MainProgram {
    /*Utwórz klasę UczestnikKursu (imie, nazwisko, obecność).
    W main utwórzcie tablicę uczestników, następnie za pomocą
    pętli odpytujcie użytkownika, aby powiedział czy dany uczestnik
     jest obecny na kursie (obecność należy zapisać w obiekcie
      np. tworzać i wywołujac metodę setObecnosc(boolean)).
       Wyniki sprawdzania obecności proszę wyświetlić na konsoli.*/
    public static void main(String[] args) {
        Uczestnik[] uczestnicy = new Uczestnik[5];
        uczestnicy[0] = new Uczestnik("Piotr");
        uczestnicy[1] = new Uczestnik("Lukasz");
        uczestnicy[2] = new Uczestnik("Karol");
        uczestnicy[3] = new Uczestnik("Dawid");
        uczestnicy[4] = new Uczestnik("Tomek");

        Scanner sc = new Scanner(System.in);
        for (int i=0; i<uczestnicy.length; i++) {
            System.out.println("Czy uczesnik kursu "+uczestnicy[i].getName()+" jest obecny? T/N");
            if (sc.nextLine().toUpperCase().equals("T")) {
                uczestnicy[i].setPresent(true);
            } else {
                uczestnicy[i].setPresent(false);
            }
        }
        for (Uczestnik uczestnik: uczestnicy) {
            System.out.println(uczestnik.getName() +" "+uczestnik.isPresent());
        }


    }
}
