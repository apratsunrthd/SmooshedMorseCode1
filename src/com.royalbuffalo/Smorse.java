package com.royalbuffalo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Smorse {

    public static void main(String[] args) {

        AlphaMorseMap myMap = AlphaMorseMap.getSingleInstance();
        String[] arguIn = args;
//        String smooshee = getInputString();
        for (String argu : arguIn) System.out.println(getOutputString(myMap, argu));

//        processTestFile(myMap);


    }

    private static void processTestFile(AlphaMorseMap myMap) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("enable1.txt"));
            String st;
            while ((st = br.readLine()) != null) {
                System.out.println(getOutputString(myMap, st));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static StringBuilder getOutputString(AlphaMorseMap myMap, String smooshee) {
        StringBuilder sb = new StringBuilder();
//        sb.append("smorse(\"" + smooshee + "\") = > ");
        sb.append("\"");
        sb.append(getMorseString(myMap, smooshee));
        sb.append("\"");
        return sb;
    }

    private static String getInputString() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter string to smoosh to Morse code: ");
        return in.nextLine().toLowerCase();
    }

    private static StringBuilder getMorseString(AlphaMorseMap myMap, String smooshee) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < smooshee.length(); i++) {
            char c = smooshee.charAt(i);
            sb.append(myMap.getAlphaToMorseMap().get(c));
        }
        return sb;
    }

}
