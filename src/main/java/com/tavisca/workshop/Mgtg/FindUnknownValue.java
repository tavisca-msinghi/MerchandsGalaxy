package com.tavisca.workshop.Mgtg;

import java.util.HashMap;

public class FindUnknownValue {

    HashMap<String,Integer>FindingHashMap=new HashMap<>();

        public int unknownValue(int LeftSide,int RightSide, String unknownString){
            int Value=RightSide/LeftSide;
            FindingHashMap.put(unknownString, Value);
            return Value;
        }
}
