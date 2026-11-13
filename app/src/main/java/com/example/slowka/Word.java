package com.example.slowka;

import java.util.ArrayList;

public class Word {
    private String word;

    private int correctLang; // 0 english  1 spanish 2 deutsch 3 polish

    public String getWord() {
        return word;
    }

    public int getCorrectLang() {
        return correctLang;
    }

    public Word(String word, int correctLang) {
        this.word = word;
        this.correctLang = correctLang;
    }
}
