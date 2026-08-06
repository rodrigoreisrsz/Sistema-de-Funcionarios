package com.reis.listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas{
    public static void main(String[] args) {
        // lista nao aceita tipos primitivos
        // <> generics - parametrizar oque vc quer
        List<String> list = new ArrayList<>();

        // inserção
        list.add("Rodrigo");
        list.add("Letícia");
        list.add("Luan");
        // inserir um elemento numa determinada posiçao
        list.add(2, "Rodriguinho");
        // tamanhp da lista
        System.out.println(list.size());
        // remover da lista
        //list.remove("Rodriguinho");
        //list.remove(0);



//        for(String nome: list){
//            System.out.println(nome);
//
//        }
        // remover com predicado
        list.removeIf(nome -> nome.charAt(0) == 'L');
        for(String nome: list){
            System.out.println(nome);

        }
        // encontrar posição
        System.out.println("Posicao: " + list.indexOf("Rodrigo"));

        // retorna uma lista apenas com os elementos que começam com R
        List<String>result = list.stream().filter(nome -> nome.charAt(0) == 'R').collect(Collectors.toList());
        for(String x: result){
            System.out.println(x);
        }

        //encontrar o primeiro elemento que comece com R
        String name = list.stream().filter(nome -> nome.charAt(0) == 'L').findFirst().orElse(null); // se o elemento nao existir retorna null
        System.out.println(name);

    }
}
