package com.company.lab12;

public class Main {
    public static void main(String[] args) {
        MyPhoneBook myBook=new MyPhoneBook();
        myBook. addPhoneElements("0671112223", "Dima");
        myBook. addPhoneElements("0672223344", "Alex");
        myBook. addPhoneElements("0673334445", "Misha");
        myBook. addPhoneElements("0674445556", "Julia");
        myBook. addPhoneElements("0675556667", "Olga");
        myBook. addPhoneElements("0676667778", "Andrey");
        myBook. addPhoneElements("0677778889", "Uliana");
        myBook. addPhoneElements("0678889990", "Sam");
        myBook. addPhoneElements("0679990001", "Jack");
        myBook. addPhoneElements("0671113334", "Ilya");

        myBook.printPhoneBook();
        myBook.sortByName();
        System.out.println("\n");
        myBook.printPhoneBook();
        myBook.sortByNumber();
        System.out.println("\n");
        myBook.printPhoneBook();

    }
}
