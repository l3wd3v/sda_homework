package com.Koper.Homework20171209;

public class TableSort {
    /*Proszę napisać generyczną
    metodę odwracającą tablicę, tj pierwszy element staje się ostatni*/
    public static void main(String[] args) {
        Integer[] numbers = {1,2,3,4,5,6,7,8,9,10};
        Integer[] reversedNumbers = tableSort(numbers);
        for (Integer number: reversedNumbers) {
            System.out.println(number);
        }
        System.out.println("--->");
        for (Integer number: numbers) {
            System.out.println(number);
        }

    }
    public static <T> T[] tableSort(T[] table) {
        T buffer;
        for(int i=0; i<table.length/2; i++) {
            buffer = table[i];
            table[i] = table[table.length-1-i];
            table[table.length-1-i] = buffer;
        }
        return table;
    }
}
