package com.tavisca.workshop.Mgtg;

public class TypeRoman {
    public String[] parseWordToRoman(String word){
        String Word[]=word.split(" ");
        String first=Word[0];
        String last=Word[2];
        return new String[]{first,last};
    }
}