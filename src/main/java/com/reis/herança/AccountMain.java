package com.reis.herança;

import java.util.ArrayList;
import java.util.List;

public class AccountMain {
    public static void main(String[] args) {
        List<Conta>list = new ArrayList<>();
        list.add(new SavingsAccount("Rd", 400.0, 200));
        list.add(new BussinesAccount("Ray", 700.0, 500));

        double sum = 0;
        for(Conta conta: list){
            sum += conta.getBalance();
        }
        System.out.println("Saldo total das contas: " + sum);

//        double deposito = 10;
//        double total = 0;
//        for(Conta conta: list){
//            total = deposito += conta.getBalance();
//        }
        for(Conta conta: list){
            conta.deposito(10);
        }
        System.out.println("Saldo de cada conta: ");
        for(Conta conta: list){
            System.out.println(conta.getBalance());
        }

    }
}
