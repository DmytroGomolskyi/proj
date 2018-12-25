package com.company.lab15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
     List<String> list= new ArrayList<>();
     for(int i=0;i<10;i++)
     {
         list.add(i,"number"+i);

     }
        System.out.println(list);
        LinkedList<String> list1 = new LinkedList<String>();
        Random random=new Random();
        for(int i=0;i<10;i++){
            int j = random.nextInt(10);
            list1.add(i,"Num_"+j);

        }
        System.out.println(list1);


    }
}
