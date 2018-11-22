package com.company.lab9.ReaderClasses;

import com.company.lab9.api.Reader;

public class Journal implements Reader {
    String name = "Rolling Stones";
    @Override
    public void read(){
        System.out.println("Journal name is "+name);
    }

}
