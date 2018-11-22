package com.company.lab9.ReaderClasses;

import com.company.lab9.api.Reader;


public class Book implements Reader {
    String data="Three musketers";
    @Override
    public void read(){
        System.out.println("Book name is "+ data);
    }
}
