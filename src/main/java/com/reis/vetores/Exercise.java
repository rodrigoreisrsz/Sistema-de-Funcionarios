package com.reis.vetores;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Exercise {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//
//        int n = scanner.nextInt();
//        double[]alturas = new double[n];
//        for(int i =0; i< n; i++){
//            alturas[i] = scanner.nextDouble();
//        }
        //negativos();
        somaVetor();


    }
    public static void negativos(){
        System.out.println("Quantos numeros?: ");
        Scanner scanner = new Scanner(System.in);
        int quantidadeNumeros = scanner.nextInt();
        int[]vetor = new int[quantidadeNumeros];
        for (int i = 0; i < quantidadeNumeros; i++) {
            System.out.println("Digite um número: ");
            vetor[i] = scanner.nextInt();

        }
        System.out.println("Numeros negativos: ");
        for(int i = 0; i < quantidadeNumeros; i++){
            if(vetor[i] < 0){
                System.out.println(vetor[i]);
            }
        }
    }
    public static void somaVetor(){
        System.out.println("Quantos numeros?: ");
        Scanner scanner = new Scanner(System.in);
        int quantidadeNumeros = scanner.nextInt();
        int[]vetor = new int[quantidadeNumeros];
        int soma=0;
        for (int i = 0; i < quantidadeNumeros; i++) {
            System.out.println("Digite um número: ");
            vetor[i] = scanner.nextInt();
            soma+=vetor[i];

        }
        System.out.print("Valores: ");
        for(int i =0; i< quantidadeNumeros; i++){
           // System.out.printf(String.format(vetor[i]));
        }




        int media = soma / quantidadeNumeros;

        System.out.println(soma);
        System.out.println(media);
    }
}
