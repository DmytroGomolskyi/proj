package com.company.lab15;

import java.util.*;


import java.util.ArrayList;

public class Labcollection {

        public static void main(String[] args) {
            List<String> list1 = new ArrayList<>();
            for(int i=0;i<10;i++)
            {
                list1.add(i,"number"+i);

            }
            System.out.println("list1  :"+list1);
            List<String> list2 = new ArrayList<>(list1);
            String[]a= {"Dima", "Misha", "Lena"};
            List<String> list3 = Arrays.asList(a);
            System.out.println("list3 :"+list3);
            list2.addAll(list2.size()/2,list3);
            System.out.println("list2  :"+list2);

            int i = 0;
            for (  ListIterator<String> listIter = list2.listIterator(); listIter.hasNext(); )
            {
                listIter.next();
                if (i % 2 != 0)
                {
                    listIter.remove();
                }
                i++;
            }
            System.out.println("list2 divided  :"+list2);

            System.out.print("Set :");

            Set<String> set = new HashSet<>();


            set.addAll(list1);
            set.addAll(list2);
            for (String j : set) {
                System.out.print(j + " ");
            }
            System.out.print("\n"+"Set1 :");

            Set<String> set1 = new LinkedHashSet<>();


            set1.addAll(list2);
            set1.addAll(list3);
            for (String j : set1) {
                System.out.print(j + " ");
            }
            Map<Integer, String> map = new LinkedHashMap<Integer, String>();
            map.put(0,"January");
            map.put(1,"February");
            map.put(2,"March");
            map.put(3,"April");
            map.put(4,"May");
            map.put(5,"June");
            map.put(6,"July");
            map.put(7,"August");
            map.put(8,"September");
            map.put(9,"October");
            map.put(10,"November");
            map.put(11,"December");
            System.out.println("\n"+map.get(0));
            System.out.println(map.get(11));
            map.put(6,"Holiday");
            Map<Integer, String> map2 = new LinkedHashMap<Integer, String>();
            map2.putAll(map);
            printmap(map2);


            }
            public static <K,V> void printmap(Map <K,V> map){
            for(Map.Entry<K,V> entry : map.entrySet()) {


                System.out.print(entry.getKey());
                System.out.print(entry.getValue());
            }


















        }
    }

