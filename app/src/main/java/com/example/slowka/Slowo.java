package com.example.slowka;

public class Slowo {
    private String word;

    private Jezyk prawidlowyJezyk;

    public String getWord() {
        return word;
    }

    public Jezyk getPrawidlowyJezyk() {
        return prawidlowyJezyk;
    }

    public Slowo(String word, Jezyk jezyk) {
        this.word = word;
        this.prawidlowyJezyk = jezyk;
    }
}
