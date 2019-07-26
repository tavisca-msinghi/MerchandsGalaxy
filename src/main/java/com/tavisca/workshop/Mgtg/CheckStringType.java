package com.tavisca.workshop.Mgtg;

public class CheckStringType {
    public static String[] stringType(String word){

        String [] Word=word.split(" ");
        String [] wordreturn = new String[]{};

        if(Word.length==3) {
            TypeRoman typeRoman = new TypeRoman();
            wordreturn = typeRoman.parseWordToRoman(word);
        }
        else if(word.startsWith("how many")){
            TypeCalculateMetal typeCalculateMetal = new TypeCalculateMetal();
            wordreturn = new String[] {typeCalculateMetal.wordToCalculateMetal(word)};
        }
        else if(word.startsWith("how much")){
            TypeCalculate typeCalculate = new TypeCalculate();
            wordreturn = new String[] {typeCalculate.wordToCalculate(word)};
        }
        else if(!(Word[Word.length-1]=="Credits")){
            TypeCredit typeCredit = new TypeCredit();
            wordreturn=typeCredit.wordToCredit(word);
        }
        return wordreturn;
    }
}
