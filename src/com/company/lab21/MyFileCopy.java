package com.company.lab21;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyFileCopy {
    public static void main(String[] args) {
      try(FileInputStream fin = new FileInputStream ("test.txt");
          FileOutputStream fos = new FileOutputStream("test2.txt")){
          byte[ ] buffer = new byte[fin.available()];
          fin.read(buffer,0,buffer.length);
          fos.write(buffer,0,buffer.length);
      }
      catch(IOException ex){
          System.out.println(ex.getMessage());
      }
    }
}
