package com.company;


import java.io.*;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) throws IOException {
        ArrayList<String> lineArray = readFileToStr();
        int lengthAllLine = 0;

        for (String line : lineArray) {
            System.out.println(line);
        }
        System.out.println("\nИнформация о файле\n");

        for (String line : lineArray) {
            System.out.println("Колличество символов в строке № " + (lineArray.indexOf(line)+1) + "= "+ line.length());
            lengthAllLine += line.length();
        }
        System.out.println("Колличество символов в файле: " + lengthAllLine);
        System.out.println("Колличество строк в файле: " + lineArray.size());
    }

    static ArrayList<String> readFileToStr () throws IOException{
        BufferedReader br = null;
        String str;
        ArrayList<String> strList = new ArrayList<>();

        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream("Test_text.txt"), "Cp1251"));
        }
        catch (FileNotFoundException e) {
            System.out.println("Невозможно открыть файл");
        }

        while ( (str = br.readLine()) != null ){
            strList.add(str);
        }
        return strList;
    }
}


