package com.company.lab21;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PrintFile {
    public static void main(String[] args) throws FileNotFoundException {

        try (BufferedReader br = new BufferedReader(new FileReader("/Users/dimagomolskyi/Desktop/Main.java"))) {

            String s;
            while ((s = br.readLine()) != null) {

                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
