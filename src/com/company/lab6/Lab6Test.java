package com.company.lab6;

import static com.company.lab6.NBU.*;

public class Lab6Test {

    public static void main(String[] args) {

        System.out.println(USD_TO_UAH_OFFICIAL) ;
      System.out.println(UAH_TO_USD_OFFICIAL) ;

      PrivatBank bank1=new PrivatBank();
      PrivatBank bank2=new PrivatBank();
      AngolenkoMoneyAgent baryga = new AngolenkoMoneyAgent();

      bank1.displayUSD();
      bank2.displayUSD();

      System.out.println("If you sell 100$ in branch 1 you receive "+bank1.convertUSDtoUAH(100)+"grn");
      System.out.println("If you buy dollars for 100 grn in branch 1 you receive  "+bank1.convertUAHToUSD(1000)+"$");
      System.out.println("If you sell 100$ in branch 2you receive "+bank2.convertUSDtoUAH(100)+"grn");
      System.out.println("If you buy dollars for 100 grn in branch 2 you receive  "+bank2.convertUAHToUSD(1000)+"$");

      cheapenUAH(10);

        bank1.displayUSD();
        bank2.displayUSD();

        System.out.println("If you sell 100$ in branch 1 you receive "+bank1.convertUSDtoUAH(100)+"grn");
        System.out.println("If you buy dollars for 100 grn in branch 1 you receive  "+bank1.convertUAHToUSD(1000)+"$");
        System.out.println("If you sell 100$ in branch 2 you receive "+bank2.convertUSDtoUAH(100)+"grn");
        System.out.println("If you buy dollars for 100 grn in branch 2you receive  "+bank2.convertUAHToUSD(1000)+"$");

        baryga.askExchangeRates("USD");
        baryga.askExchangeRates("EUR");
        baryga.askExchangeRates("Rouble");


    }
    public static void compare(PrivatBank a, Demos b,AngolenkoMoneyAgent c){
        a = new PrivatBank();
        b = new Demos();
        c= new AngolenkoMoneyAgent();
        double min = a.USD_CURRENCY_RATIO;
        String best = "PrivatBank";
        if  (b.USD_CURRENCY_RATIO<=min) { min = b.USD_CURRENCY_RATIO; best = "Demos"; }
        if (c.USD_CURRENCY_RATIO<=min) { min = c.USD_CURRENCY_RATIO; best = "Baryga";}
        System.out.println("The best place to buy dollars is "+best);





    }

}
