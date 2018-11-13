package com.company.lab6;


import com.company.lab6.api.CurrencyConvertor;

import static com.company.lab6.NBU.*;

public class AngolenkoMoneyAgent implements CurrencyConvertor {

    public static double USD_CURRENCY_RATIO = 1.2;
    public static double EUR_CURRENCY_RATIO =1.25;

    @Override
    public double convertUAHToUSD(double value) {
        return value / UAH_TO_USD_OFFICIAL / USD_CURRENCY_RATIO;
    }

    @Override
    public double convertUSDtoUAH(double value) {
        return value * USD_TO_UAH_OFFICIAL * USD_CURRENCY_RATIO;
    }

    @Override
    public double convertUAHToEUR(double value) {
        return value / UAH_TO_EUR_OFFICIAL /EUR_CURRENCY_RATIO;
    }

    @Override
    public double convertEURtoUAH(double value) {
        return value * EUR_TO_UAH_OFFICIAL * EUR_CURRENCY_RATIO;
    }

    public void askExchangeRates(String currency) // USD, EUR
    {
       switch(currency) {
           case USD:
               System.out.println("Dollar ratio is " + UAH_TO_USD_OFFICIAL / USD_CURRENCY_RATIO);
               break;
           case EUR:
               System.out.println("Euro ratio is " + UAH_TO_EUR_OFFICIAL / EUR_CURRENCY_RATIO);
               break;
           default:
               System.out.println("Idi nafig");
       }
    }
}
