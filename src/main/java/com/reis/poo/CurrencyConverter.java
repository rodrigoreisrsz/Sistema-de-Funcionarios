package com.reis.poo;

import static com.reis.poo.CotacaoDolar.dollarPrice;

public class CurrencyConverter {
    public static double convertion(double reais){
        System.out.println("Amount to be paid in reais: ");
        double v = dollarPrice * reais;
        return v;
    }
}
