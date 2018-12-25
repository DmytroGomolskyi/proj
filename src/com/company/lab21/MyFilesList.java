package com.company.lab21;

import java.io.File;

public class MyFilesList {
    public static void main(String[] args) {

 File f = new File("/");
  for(File s:f.listFiles()){
     if(f.isFile())
     {
         System.out.println(s.getName());
     }
  }

    }
}
