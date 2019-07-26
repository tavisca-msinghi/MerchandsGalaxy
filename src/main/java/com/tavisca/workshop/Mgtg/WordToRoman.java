package com.tavisca.workshop.Mgtg;

import java.util.HashMap;

public class WordToRoman {
    public static HashMap<String,String> WordToRomanHashMap = new HashMap<>();

    public String ToRoman(String[] words){
        String romanString="";
        for(int i=0;i<words.length;i++){
            String []romanKey=words[i].split(" ");
            for(int j=0;j<romanKey.length;j++){
            if(WordToRomanHashMap.containsKey(romanKey[j])){
                romanString = romanString + WordToRomanHashMap.get(romanKey[i]);
            }}
        }
        return romanString;
    }

    public void storeToWordToRomanHashMap(String[] words){
        WordToRomanHashMap.put(words[0],words[1]);
    }

}
