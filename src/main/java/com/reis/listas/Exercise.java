package com.reis.listas;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a opção de escolha: ");
        int opcao;

        while (true) {
            System.out.println("1 - Cadastrar | 2 - Listar | 0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt(); // <--- ISSO ATUALIZA A VARIÁVEL E FAZ O PROGRAMA ESPERAR O USUÁRIO

            if (opcao == 0) {
                System.out.println("Saindo do sistema...");
                break; // Sai do while(true)
            }
            switch (opcao) {
                case 1:
                    MetodosFuncionario.cadastrar();
                    break;
                case 2:
                    MetodosFuncionario.listarFuncionarios();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}
