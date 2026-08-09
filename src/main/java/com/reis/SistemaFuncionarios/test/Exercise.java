package com.reis.SistemaFuncionarios.test;

import com.reis.SistemaFuncionarios.domain.MetodosFuncionario;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a opção de escolha: ");
        int opcao;

        while (true) {
            System.out.println("1 - Cadastrar | 2 - Listar | 3 - Aumento | 0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            if (opcao == 0) {
                System.out.println("Saindo do sistema...");
                break;
            }
            switch (opcao) {
                case 1:
                    MetodosFuncionario.cadastrar();
                    break;
                case 2:
                    MetodosFuncionario.listarFuncionarios();
                    break;
                case 3:
                    MetodosFuncionario.aumentarSalario();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}
