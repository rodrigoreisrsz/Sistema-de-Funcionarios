package com.reis.poo;

import java.util.Locale;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {



    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ///Calculator calculator = new Calculator();

//        System.out.println("Enter radius: ");
//        double radius = sc.nextDouble();
//
//        double c = Calculator.circunference(radius);
//
//        double v= Calculator.volume(radius);
//
//        System.out.printf("Circumference: %.2f%n", c);
//        System.out.printf("Volume: %.2f%n", v);
//        System.out.printf("PI value: %.2f%n", Calculator.PI);
//
//        sc.close();

        System.out.println(CurrencyConverter.convertion(200));

    }



}