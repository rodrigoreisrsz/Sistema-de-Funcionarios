//package com.reis.SistemaFuncionarios.test;
//
//import com.reis.SistemaFuncionarios.domain.ContratoPorHora;
//import com.reis.SistemaFuncionarios.domain.Departamento;
//import com.reis.SistemaFuncionarios.domain.Funcionario;
//
//import com.reis.SistemaFuncionarios.domain.TrabalhadorNivel;
//
//import java.io.IO;
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//import java.util.Locale;
//import java.util.Scanner;
//
//public class Exercise {
//    public static void main(String[] args) {
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//
//        IO.print("Entre o nome do departamento: ");
//        String nomeDepartamento = sc.nextLine();
//
//        Departamento dept = new Departamento(nomeDepartamento);
//
//        IO.println("Entre os dados do trabalhador:");
//        IO.print("Nome: ");
//        String funcionarioNome = sc.nextLine();
//        IO.print("Nivel: ");
//        //TrabalhadorNivel = trabalhadorNivel.valueOf(sc.nextLine());
//        IO.print("Salario base: ");
//        double baseSalario = sc.nextDouble();
//
//        Funcionario funcionario = new Funcionario(funcionarioNome, //trabalhadorNivel, baseSalario, dept);
//
//        IO.print("Quantos contratos esse trabalhador tem? ");
//        int n = sc.nextInt();
//
//        for (int i=1; i<=n; i++) {
//            IO.println("Entre com os dados do contrato #" + i + ":");
//            IO.print("Data (DD/MM/YYYY): ");
//            LocalDate contratoData = LocalDate.parse(sc.next(), fmt);
//            IO.print("Valor por hora: ");
//            double valorPorHora = sc.nextDouble();
//            IO.print("Duracao (horas): ");
//            int horas = sc.nextInt();
//            ContratoPorHora contrato = new ContratoPorHora(contratoData, valorPorHora, horas);
//            Funcionario.adicionarContrato(contrato);
//        }
//
//        IO.println();
//        IO.print("Entre o ano e mes para calcular o ganho (MM/YYYY): ");
//        String monthAndYear = sc.next();
//
//        int month = Integer.parseInt(monthAndYear.substring(0, 2));
//        int year = Integer.parseInt(monthAndYear.substring(3));
//
//        IO.println("Nome: " + funcionario.getNome());
//        IO.println("Departamento: " + funcionario.getDepartamento().getNome());
//        IO.println("Ganho para " + monthAndYear + ": " + String.format("%.2f", funcionario.income(year, month)));
//
//        sc.close();
//}
