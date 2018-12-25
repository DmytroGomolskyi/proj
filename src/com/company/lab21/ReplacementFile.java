package com.company.lab21;

import java.io.IOException;
import java.io.RandomAccessFile;

public class ReplacementFile {
    static String fileAsText (String file) throws IOException {
        RandomAccessFile f = new RandomAccessFile (file,"r");

        try{
            byte [] buf = new byte [(int)f.length()];
            f.read(buf);
            return new String(buf);
        } finally {
            f.close();
        }
    }
    static void writeTextToFile (String file, String text) throws IOException {
        RandomAccessFile f = new RandomAccessFile (file,"rw");
        try{
            f.setLength(0);
            byte[] buf = text.getBytes();
            f.write(buf);
        } finally {
            f.close();
        }
    }
    public static void main(String[] args) throws IOException {

        final String file = "program.txt";
        String text = fileAsText(file);
        text = text.replace("private", "public");
        writeTextToFile (file,text);
    }

}

