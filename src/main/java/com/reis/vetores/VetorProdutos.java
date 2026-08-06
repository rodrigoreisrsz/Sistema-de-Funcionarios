package com.reis.vetores;

import java.sql.SQLOutput;
import java.util.Scanner;

public class VetorProdutos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Produto[] produtos = new Produto[n];
        for (int i = 0; i < produtos.length; i++) {
            scanner.nextLine();
            String nome = scanner.nextLine();
            double preco = scanner.nextDouble();
            produtos[i] = new Produto(nome, preco);
        }
        double soma =0;
        for (int i = 0; i < produtos.length; i++) {
            soma+=produtos[i].getPreco();
        }
        double media = soma / produtos.length;
        System.out.println(media);
        scanner.close();
    }
}
