package com.tavisca.workshop.Mgtg;

public class TypeCalculateMetal {
        public String wordToCalculateMetal(String word) {
            String[] Word = word.split(" is ");
            String s = Word[1].substring(0, Word[1].length() - 2);
            return s;
        }
}
