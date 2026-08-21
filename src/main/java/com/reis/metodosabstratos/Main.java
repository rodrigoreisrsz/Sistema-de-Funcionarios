package com.reis.metodosabstratos;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Shape>list = new ArrayList<>();

        System.out.println("Enter the number of shapes: ");
        int quantity = sc.nextInt();


        for(int i = 1; i <= quantity; i++){
            System.out.println("Shape data #"+i);
            System.out.println("Rectangle  or Circle (R/C)? ");
            sc.nextLine();
            String type = sc.nextLine();

            if(type.equalsIgnoreCase("r")){
                System.out.println("Color (BLACK/BLUE/RED): ");
                Color color = Color.valueOf(sc.nextLine());
                System.out.println("Width: ");
                double width = sc.nextDouble();
                System.out.println("Height: ");
                double height = sc.nextDouble();
                //Rectangle rectangle = new Rectangle(color, width, height);
                list.add(new Rectangle(color, width, height)); // UPCASTING para o shape
            }
            else if(type.equalsIgnoreCase("c")){
                //sc.nextLine();
                System.out.println("Color (BLACK/BLUE/RED): ");
                Color color = Color.valueOf(sc.nextLine());
                System.out.println("Radius: ");
                double radius = sc.nextDouble();
                //Circle circle = new Circle(color, radius);
                list.add(new Circle(color, radius)); // UPCASTING para o shape
            }


        }
        System.out.println("Shape areas: ");
        for(Shape shape: list){
            System.out.println(shape.area());
        }
        sc.close();


    }
}
