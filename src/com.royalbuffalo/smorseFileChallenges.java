package com.royalbuffalo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// https://www.reddit.com/r/dailyprogrammer/comments/cmd1hb/20190805_challenge_380_easy_smooshed_morse_code_1/

public class smorseFileChallenges {

    public static void main (String[] args) {

        AlphaMorseMap myMap = AlphaMorseMap.getSingleInstance();

        processTestFile(myMap);

        // The sequence -...-....-.--. is the code for four different words (needing, nervate, niding, tiling). Find the only sequence that's the code for 13 different words.

        // autotomous encodes to .-..--------------..-..., which has 14 dashes in a row. Find the only word that has 15 dashes in a row.

        // Call a word perfectly balanced if its code has the same number of dots as dashes. counterdemonstrations is one of two 21-letter words that's perfectly balanced. Find the other one.

        // protectorate is 12 letters long and encodes to .--..-.----.-.-.----.-..--., which is a palindrome (i.e. the string is the same when reversed). Find the only 13-letter word that encodes to a palindrome.

        // --.---.---.-- is one of five 13-character sequences that does not appear in the encoding of any word. Find the other four.

    }

    private static void processTestFile(AlphaMorseMap myMap) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("enable1.txt"));
            String st;
            while ((st = br.readLine()) != null) {
                System.out.println(getMorseString(myMap, st));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
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
