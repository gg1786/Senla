package com.company.HomeWork;

import java.util.Scanner;

public class Zadanie2 {

   public static int f(int n){
       if(n==0){
           return 0;
       }else if(n==1){
           return 1;
       }else {
           return f(n-1)+ f(n-2);
       }
   }

    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();

        final int fn = f(n);

        System.out.println("Искомое число: " + fn);
    }
}
