package com.reis.herança;

public class Main {
    public static void main(String[] args) {
        Conta acc = new Conta("Rd", 0.0);
        BussinesAccount bacc = new BussinesAccount("Ray", 0.0, 400 );

        //UPCASTING
        Conta acc1 = bacc;
        Conta acc2 = new BussinesAccount("zap", 0.0, 200);
        Conta acc3 = new SavingsAccount("zap", 0.0, 290);

        Conta conta = new BussinesAccount("fernando", 19.0, 100);
        conta.saque(10);
        System.out.println(conta.getBalance());

        Conta conta2 = new SavingsAccount("fernando", 19.0, 100);
        conta2.saque(10);
        System.out.println(conta2.getBalance());

        //DOWNCASTING

        //BussinesAccount acc4 = acc2; // nao pode converter conta para bussines acount, compilador nao sabe se é seguro
        // deve ser feito um casting manual
        BussinesAccount acc4 = (BussinesAccount) acc2;// Downcasting manual feito

        if(acc3 instanceof BussinesAccount){
            BussinesAccount acc5 = (BussinesAccount) acc3;
            // Se o que estier na variavel acc3 for um objeto que seja intancia de bussines account faça o casting
            System.out.println("è um bussines");
        }

        if(acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            System.out.println("é um saving");
        }

    }
    }




