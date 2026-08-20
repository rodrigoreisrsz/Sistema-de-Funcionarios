package com.reis.poliorfismo;

import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Product {
    static Scanner sc = new Scanner(System.in);
    private String name;
    private double price;
    static List<Product>products = new ArrayList<>();

    public Product(){

    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public final static void addProduct(){
        System.out.println("Enter the number of products: ");
        int quantity = sc.nextInt();
        System.out.println("Common, used or imported (C/U/I)? ");
        sc.nextLine();
        String type = sc.nextLine();


        for(int i = 1; i <= quantity; i++){
            System.out.println("Product #"+i+" data: ");
            System.out.println("Write name of product: ");
            String name = sc.nextLine();

            System.out.println("Write price of product: ");
            double price = sc.nextDouble();

            if(type.equalsIgnoreCase("c")){
                Product product = new Product(name, price);
                //System.out.println(name);
                products.add(product);
            }
            else if(type.equalsIgnoreCase("i")){
                System.out.println("Customs fee: ");
                double customsFee = sc.nextDouble();
                Product product = new ImportedProduct(name, price, customsFee);
                //System.out.println(name);
                products.add(product);
            }
            else if(type.equalsIgnoreCase("u")){
                System.out.println("Manufacture date (DD/MM/YYYY): ");
                String manufacture = sc.nextLine();
                Product product = new UsedProduct(name, price, manufacture);
                //System.out.println(name);
                products.add(product);
            }

        }
        System.out.println("Price tags: ");
        for(Product product: products){
            System.out.println("Name: "+product.getName());
            System.out.println("Price: " +  " $" + product.getPrice());
//            if(type.equals("i")){
//                System.out.println(ImportedProduct.get);
//            }
        }
    }

    public String priceTag(){
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", price=" + price;
    }
}
