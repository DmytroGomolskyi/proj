package com.company.lab18;
import java.math.BigInteger;

import static java.lang.Math.random;

public class Main {
    public static void main(String[] args) {
       int num= (int)(( random() * (40) ) + 10);
        System.out.println(factorial(num));

    }
    public static BigInteger factorial(int n)
    {
        BigInteger sum = new BigInteger("1");

        for(int i=n;i>0;i--)
        {
          sum=sum.multiply(BigInteger.valueOf(i));
        }
        return sum;



    }
}
