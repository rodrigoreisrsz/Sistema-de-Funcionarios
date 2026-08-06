package com.reis.wrapper;

import java.sql.SQLOutput;

public class wrapper {

    public static void main(String[] args) {
        int x = 10;

        Object object = x;

        int i = /*casting*/(int) object;

        System.out.println(object);
        System.out.println(i);

        // Usando Wrapper -- Tratam os tipos primitivos como classes, sem necessidade de casting
        int y = 15;

        Integer obj = y;

        int z = obj;

        System.out.println(obj);
        System.out.println(z);
    }
}
