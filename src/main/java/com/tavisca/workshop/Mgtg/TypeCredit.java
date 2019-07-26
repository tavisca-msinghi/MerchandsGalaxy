package com.tavisca.workshop.Mgtg;

public class TypeCredit {
    public String[] wordToCredit(String word){

        String Word[]=word.split(" is ");
        String first[]=Word[0].split(" ");

        String itemName="";
        String metalName = first[first.length-1];
        for(int i=0;i<first.length-1;i++){
                itemName = itemName + first[i]+ " ";
        }

        String second[]=Word[1].split(" ");
        String credit=second[0];
        return new String[]{itemName.trim(), metalName, credit};
    }

}
