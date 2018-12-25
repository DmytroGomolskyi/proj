package com.company.lab12;

import java.util.Arrays;
import java.util.Comparator;

public class MyPhoneBook {
    PhoneNumber[] phoneNumbers= new PhoneNumber[10];
    public void addPhoneElements(String number,String name){
        PhoneNumber element=new PhoneNumber(number,name);
        for(int i=0; i<10;i++){
            if (phoneNumbers[i]==null)
            {
                phoneNumbers[i]=element;
                return;
            }
        }

    }
    public void printPhoneBook(){
        for(int i=0;i<10;i++){
            if (phoneNumbers[i]==null){
                continue;
            }
            //toString(phoneNumbers[i])
            System.out.println(phoneNumbers[i]);
        }
    }

    public void sortByNumber(){
        Arrays.sort(phoneNumbers, new Comparator<PhoneNumber>() {
            @Override
            public int compare(PhoneNumber o1, PhoneNumber o2) {
                String number1 = o1.number;
                String number2 = o2.number;
                return number1.compareTo(number2);
            }
        });

    }
    public void sortByName(){
        Arrays.sort(phoneNumbers, new Comparator<PhoneNumber>() {
            @Override
            public int compare(PhoneNumber o1, PhoneNumber o2) {
                String name1 = o1.name;
                String name2 = o2.name;
                return name1.compareTo(name2);
            }
        });
    }
    static class PhoneNumber{
        private String number;
        private String name;

        PhoneNumber(String number,String name)
        {
            this.number=number;
            this.name=name;
        }
        public String getNumber()
        {
            return number;
        }
        public String getName()
        {
            return name;
        }

        @Override
        public String toString() {
            return "PhoneNumber{" +
                    "number='" + number + '\'' +
                    ", name='" + name + '\''
                    ;
        }
    }

}
