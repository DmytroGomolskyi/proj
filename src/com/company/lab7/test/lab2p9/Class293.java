package com.company.lab7.test.lab2p9;


public class Class293 {
    public static void main(String[] args) {
        uniqueChars("Using methods of class String");
    }

    private static char[] uniqueChars(String s) {
        char[] arr = s.toCharArray();
        String s1="";
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(arr[i])==s.lastIndexOf(arr[i])){
                System.out.print(arr[i]+"  ");
                s1+=arr[i];
            }
        }
        System.out.println(s1);
        return  s1.toCharArray();
        //return
    }
}
