package com.reis.logicadeprogramacao.app;

import com.reis.logicadeprogramacao.entities.Produtos;
import com.reis.logicadeprogramacao.exception.IdInexistenteException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Produtos.adicionarProduto();
        Produtos.listarProdutos();

        try{
            Produtos.escolherProduto();
        }catch(IdInexistenteException e){
            e.printStackTrace();
        }



    }
}
