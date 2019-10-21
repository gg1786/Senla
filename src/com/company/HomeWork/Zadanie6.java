package com.company.HomeWork;

import static java.lang.Character.isDigit;

public class Zadanie6 {
    public static void main(String[] args) {
        String dataString = "a12.334tyz.78x";
        StringBuilder sb = new StringBuilder();
        for(char ch : dataString.toCharArray()) {
            if(!isDigit(ch)) {
                sb.append(ch);
            }
        }
        System.out.println("Result: " + sb.toString());
    }
}
