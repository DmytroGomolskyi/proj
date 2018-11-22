package com.company.lab9.ReaderClasses;

import com.company.lab9.api.Reader;

public class Site implements Reader {
    String url="www.sports.ru";

    @Override
    public void read(){
        System.out.println("The URL is "+url);
    }
}
