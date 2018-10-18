package com.company.lab2;

/**
 * Base class for test busyness logic of app.
 */
public class Main {

    public static void main(String[] args) {

        int a = 4;
        int b = 4;
        Double c = 0d;
        Double d = 0d;


        System.out.println("Create instance of IntegralCalculator");
        IntegralCalculator calculator = new IntegralCalculator();

        System.out.println("Create instance of BooleanCalculator");
        BooleanCalculator booleanCalculator = new BooleanCalculator();

        System.out.println("Create instance of DoubleCalculator");
        DoubleCalculator doubleCalculator = new DoubleCalculator();


        System.out.println("\nTry calc int sum:");
        int sum = calculator.sum(a, b);
        ResultPrinter.print(a, "+", b, sum);
        System.out.println('\n');

        int sub = calculator.sub(a,b);
        ResultPrinter.print(a,"-",b,sub);
        System.out.println('\n');


        System.out.println("Try calc int multiply:");
        int multiply = calculator.mul(a, b);
        ResultPrinter.print(a, "*", b, multiply);
        System.out.println('\n');

        int div = calculator.div(a,b);
        ResultPrinter.print(a,"-",b,div);
        System.out.println('\n');

        a = 32;
        b = 2;
        System.out.println("Try calc boolean <<:");
        ResultPrinter.printBinary(a,"<<", b, booleanCalculator.shiftLeft(a, b));
        //booleanCalculator.shiftLeft(2, 4);
        System.out.println('\n');

        a = 32;
        b = 2;
        System.out.println("Try calc boolean >>:");
        ResultPrinter.printBinary(a,">>", b, booleanCalculator.unsignedShift(a, b));
        //booleanCalculator.unsignedShift(2, 4);
        System.out.println('\n');

        b = 8;
        System.out.println("Try calc boolean XOR:");
        ResultPrinter.printBinary(a,"^", b, booleanCalculator.xor(a, b));
        System.out.println('\n');

        a = 32;
        b = 2;
        System.out.println("Try calc inverse:");
        ResultPrinter.printBinary(a,"~", booleanCalculator.inverse(a));
        //booleanCalculator.shiftRight(2, 4);
        System.out.println('\n');

        Double div1 = doubleCalculator.div(c,d);
        ResultPrinter.print(c,"/",d,div1);
        System.out.println('\n');


    }
}
