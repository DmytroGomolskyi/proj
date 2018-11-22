package com.company.lab9.ReaderClasses;

import com.company.lab9.api.Reader;

public class Ebook implements Reader {
    String name = "Gone with the wind";

    @Override
    public void read(){
        System.out.println("Ebook name is "+name);
    }
}
