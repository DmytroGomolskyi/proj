package com.company.lab9.ReaderClasses;

import com.company.lab9.api.Reader;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        Ebook ebook = new Ebook();
        Journal journal = new Journal();
        Site site = new Site();
        read2(book,site,journal,ebook);
    }

    static void read2(Reader ... example) {
        for(Reader r : example){
            r.read();
        }


    }
}

