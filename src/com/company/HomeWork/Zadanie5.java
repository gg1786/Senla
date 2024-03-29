package com.company.HomeWork;

import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final String s = scan.next();
        isPalindrome(s);
    }

    public static String reverseString(String s) {
        String r = "";
        for (int i = s.length() - 1; i >= 0; --i)
            r += s.charAt(i);
        return r;
    }

    public static Boolean isPalindrome(String s) {
        if (s.equals(reverseString(s))) {
            System.out.println("Полиндром");
        } else {
            System.out.println("Не полиндром");
        }
        return s.equals(reverseString(s));
    }
}
