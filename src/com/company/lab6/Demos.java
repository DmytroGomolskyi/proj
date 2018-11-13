package com.company.lab6;


import com.company.lab6.api.CurrencyBoard;
import com.company.lab6.api.CurrencyConvertor;

import static com.company.lab6.NBU.*;

public class Demos implements CurrencyConvertor, CurrencyBoard {

    public static double USD_CURRENCY_RATIO = 1.1;
    public static double EUR_CURRENCY_RATIO =1.2;
    // TODO for EUR (RATIO = 1.2)

    @Override
    public double convertUAHToUSD(double value) { return value / UAH_TO_USD_OFFICIAL /USD_CURRENCY_RATIO; }

    @Override
    public double convertUSDtoUAH(double value) { return value * USD_TO_UAH_OFFICIAL * USD_CURRENCY_RATIO; }

    @Override
    public double convertUAHToEUR(double value) { return value / UAH_TO_EUR_OFFICIAL / EUR_CURRENCY_RATIO; }

    @Override
    public double convertEURtoUAH(double value) { return value * EUR_TO_UAH_OFFICIAL * EUR_CURRENCY_RATIO; }

    @Override
    public void displayUSD() {
        double buyUsd1 = UAH_TO_USD_OFFICIAL / USD_CURRENCY_RATIO;
        double saleUsd1 = USD_TO_UAH_OFFICIAL * USD_CURRENCY_RATIO;
        System.out.printf("DEMOS! USD: sale = %f, buy = %f", buyUsd1, saleUsd1);
        System.out.println();
    }

    @Override
    public void displayEUR() {
        double buyUsd1 = UAH_TO_EUR_OFFICIAL / EUR_CURRENCY_RATIO;
        double saleUsd1 = EUR_TO_UAH_OFFICIAL * EUR_CURRENCY_RATIO;
        System.out.printf("DEMOS! EUR: sale = %f, buy = %f", buyUsd1, saleUsd1);
        System.out.println();
    }
}