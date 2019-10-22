package com.company.HomeWork;

import java.util.Scanner;

public class Zadanie4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number to find GCD and LCM");
        int a = scanner.nextInt();
        System.out.println("Please enter second number to find GCD and LCM");
        int b = scanner.nextInt();

        //int a = 75, b = 60;
        System.out.println("LCM of " + a + " and " + b + " is " + lcm(a, b));
        System.out.println("GCD of " + a + " and " + b + " is " + gcd(a, b));
    }

    static int gcd(int a, int b) {

        if (a == 0)
            return b;
        if (b == 0)
            return a;

        if (a == b)
            return a;

        if (a > b)
            
            return gcd(a - b, b);
            return gcd(a, b - a);
    }

    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}