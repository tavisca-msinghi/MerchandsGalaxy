package com.tavisca.workshop.Mgtg;

import java.util.HashMap;

public class FindUnknownValue {

    HashMap<String,Integer>FindingHashMap=new HashMap<>();

        public void unknownValue(int LeftSide,int RightSide, String unknownString){
            int Value=RightSide/LeftSide;
            FindingHashMap.put(unknownString, Value);
            //return Value;
        }


        public int stringCalculation(String[] outputs) {
                int Total = 0 ;
                int previousNumber = 100009;
                for(int i=0;i<outputs.length;i++){
                    if (FindingHashMap.get(outputs[i])==null) {
                        continue;
                    }
                    else { int NumericNumber =FindingHashMap.get(outputs[i]);
                     if (previousNumber < NumericNumber) {
                        Total = Total - NumericNumber;
                        }
                    else {
                        Total = Total + NumericNumber;
                    }
                    previousNumber = NumericNumber;
                }
                System.out.println(outputs[i]);
                }

            return Total;
        }
}
