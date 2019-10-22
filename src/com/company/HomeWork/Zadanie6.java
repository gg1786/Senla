package com.company.HomeWork;

import java.util.Scanner;

import static java.lang.Character.isDigit;

public class Zadanie6 {
    public static void main(String[] args) {
        //Первый вариант
        String dataString = "a12.334tyz.78x";
        StringBuilder sb = new StringBuilder();
        for (char ch : dataString.toCharArray()) {
            if (!isDigit(ch)) {
                sb.append(ch);
            }
        }
        System.out.println("Result: " + sb.toString());


        //Второй вариант
        Scanner str = new Scanner(System.in);
        System.out.println("Please enter: ");
        String chislo = str.next();
        chislo = chislo.replaceAll("[0-9]", "");
        System.out.println(chislo);

    }

}
