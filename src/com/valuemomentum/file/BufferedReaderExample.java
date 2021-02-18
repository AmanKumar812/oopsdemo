package com.valuemomentum.file;
 

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

 

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new FileReader(new File("c:/demo/Countries.txt")));
            String line = "";
            while((line=br.readLine())!=null){
                System.out.println(line);
            }
            br.close();
            }
    }