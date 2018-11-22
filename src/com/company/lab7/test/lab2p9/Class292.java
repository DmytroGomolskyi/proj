package com.company.lab7.test.lab2p9;

public class Class292 {
    public static void main(String[] args) {
        String myStr1="Cartoon";
        String myStr2="Tomcat";
        int a=myStr1.length();
        for(int i=0;i<a;i++){
            char c= myStr1.charAt(i);
            if (myStr2.indexOf(c)==-1)
            {
                System.out.println(c);

            }

        }

    }
}
