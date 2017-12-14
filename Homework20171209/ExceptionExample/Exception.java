package com.Koper.Homework20171209.ExceptionExample;

import java.util.Scanner;

public class Exception {
    /*Utwórzcie własną klasę wyjątku. Od użytkownika pobierzcie
    3 długości odcinków, sprawdźcie czy można z nich zbudować trójkąt
    (suma 2 dowolnych odcinków jest większa od pozostałego).
    Jeśli z podanych odcinków nie da się zbudować trójkąta należy rzucić utworzony wyjątek */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj dlugosci trzech bokow trojkata: ");
        int a = sc.nextInt();

        int b = sc.nextInt();

        int c = sc.nextInt();

        try{
            triangleCreation(a,b,c);
        } catch (TriangleCreationNotPossibleException ex) {
            ex.printStackTrace();
        }


    }
    public static void triangleCreation (int a, int b,int c) throws TriangleCreationNotPossibleException {
        if (a+b>c) {
            int[] triangle = {a,b,c};
        } else {
            throw new TriangleCreationNotPossibleException();
        }
    }

}
