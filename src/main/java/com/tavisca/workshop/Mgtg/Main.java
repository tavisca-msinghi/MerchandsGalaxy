package com.tavisca.workshop.Mgtg;

public class Main {
    public static void main(String[] args) {
        TypeRoman typeRoman = new TypeRoman();
        String []strings;
        strings = typeRoman.parseWordToRoman("glob is I");
        System.out.println(strings[0]+" "+strings[1]);
    }
}
