package com.tavisca.workshop.Mgtg;

import java.util.HashMap;

public class RomanToNumeric {

    HashMap<Character,Integer>RomanToNumericHashMap = new HashMap<Character, Integer>(){{
        put('I',1);
        put('V',5);
        put('X',10);
        put('L',50);
        put('C',100);
        put('D',500);
        put('M',1000);
    }};

    public int ToNumeric(String word){
        int previousNumber = 10009;
        int Total=0;
        //System.out.println(word.length());
        for(int i=0;i<word.length();i++){
            int NumericNumber = RomanToNumericHashMap.get(word.charAt(i));
            //System.out.println(NumericNumber);
             if(previousNumber < NumericNumber){
                 Total = Total - NumericNumber;
             }
             else{
                 Total= Total + NumericNumber;
             }

             previousNumber = NumericNumber;
        }
        return Total;
    }
}
