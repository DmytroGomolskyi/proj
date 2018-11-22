package com.company.lab7.myclass;

public class Main {
    public static void main(String[] args)
        {
        Computer notebook=new Computer();
        Device tableComputer= new Computer();
        ((Computer) tableComputer).turnOff("Pentium");
        if(notebook.equals(tableComputer)){
            System.out.println("Success");
        }
    }
}
