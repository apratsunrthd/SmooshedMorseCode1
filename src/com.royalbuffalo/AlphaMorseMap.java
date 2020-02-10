package com.royalbuffalo;

import java.util.HashMap;

public class AlphaMorseMap {

    private static final AlphaMorseMap SINGLE_INSTANCE = new AlphaMorseMap();

    final String MORSE_INPUT = ".- -... -.-. -.. . ..-. --. .... .. .--- -.- .-.. -- -. --- .--. --.- .-. ... - ..- ...- .-- -..- -.-- --..";
    String[] eachMorse = MORSE_INPUT.split("\\s+");
    HashMap<Character, String> alphaToMorseMap = new HashMap<>();

    private AlphaMorseMap() {
        int eachMorseIt = 0;
        for (char alphabet = 'a'; alphabet <= 'z'; alphabet++) {
            alphaToMorseMap.put(alphabet, eachMorse[eachMorseIt]);
            eachMorseIt++;
        }
    }

    public HashMap<Character, String> getAlphaToMorseMap() {
        return alphaToMorseMap;
    }

    public static AlphaMorseMap getSingleInstance() {
        return SINGLE_INSTANCE;
    }
}
