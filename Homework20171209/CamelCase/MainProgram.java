package com.Koper.Homework20171209.CamelCase;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to convert to camel case: ");
        String toConvert = sc.nextLine();
        String converted = "";

        for (int i=0; i<toConvert.length(); i++) {
            if (i%2 ==0) {
                converted += toConvert.substring(i, i+1).toUpperCase();
            } else {
                converted += toConvert.substring(i, i+1).toLowerCase();
            }
        }
        System.out.println(converted);
    }
}
