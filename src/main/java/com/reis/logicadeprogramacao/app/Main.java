package com.reis.logicadeprogramacao.app;

import com.reis.logicadeprogramacao.entities.Produtos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produtos produto1 = new Produtos("Maça");
        Produtos produto2 = new Produtos("Banana");
        List<Produtos>produtos = new ArrayList<>();
        produtos.add(produto1);
        produtos.add(produto2);

        System.out.println("Lista de produtos: ");

        for(Produtos produto: produtos){
            System.out.println(produto);
        }

        System.out.println("Escolha um produto: ");
        String escolha = sc.nextLine();
        if(escolha.equalsIgnoreCase("Maça") || escolha.equalsIgnoreCase("Banana")){
            System.out.println("Deseja pagar pelo produto? ");
            String resposta = sc.nextLine();
            if(resposta.equalsIgnoreCase("sim")){
                System.out.println("Produto comprado!");
            }else{
                System.out.println("Produto devolvido!");
            }
        }


    }
}
