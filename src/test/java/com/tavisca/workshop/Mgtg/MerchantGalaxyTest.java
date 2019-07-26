package com.tavisca.workshop.Mgtg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MerchantGalaxyTest {

    @Test
    void canParserWordToRoman(){
        TypeRoman typeRoman = new TypeRoman();
        assertArrayEquals(new String[]{"glob","I"}, typeRoman.parseWordToRoman("glob is I"));

    }
    @Test
    void canParseToCredits(){
        TypeCredit typeCredit = new TypeCredit();
        assertArrayEquals(new String[]{"glob glob", "Silver", "34"},typeCredit.wordToCredit("glob glob Silver is 34 Credits"));
    }
    @Test
    void canParseTocalculate(){
        TypeCalculate typeCalculate = new TypeCalculate();
        assertEquals("pish tegj glob glob",typeCalculate.wordToCalculate("how much is pish tegj glob glob ?"));
    }
    @Test
    void canParseTocalculateMetal(){
        TypeCalculateMetal typeCalculateMetal = new TypeCalculateMetal();
        assertEquals("glob prok Iron",typeCalculateMetal.wordToCalculateMetal("how many Credits is glob prok Iron ?"));

    }
    @Test
    void parseToCheckString(){
        CheckStringType checkStringType = new CheckStringType();
        assertArrayEquals(new String[]{"glob","I"},checkStringType.stringType("glob is I"));
        assertArrayEquals(new String[]{"glob glob", "Silver", "34"},checkStringType.stringType("glob glob Silver is 34 Credits"));
        assertArrayEquals(new String[]{"pish tegj glob glob"},checkStringType.stringType("how much is pish tegj glob glob ?"));
        assertArrayEquals(new String[]{"glob prok Iron"},checkStringType.stringType("how many Credits is glob prok Iron ?"));
    }
    @Test
    void canWordToRoman(){
        WordToRoman wordToRoman = new WordToRoman();
        CheckStringType checkStringType = new CheckStringType();
        wordToRoman.storeToWordToRomanHashMap(checkStringType.stringType("glob is I"));
        wordToRoman.storeToWordToRomanHashMap(checkStringType.stringType("prok is V"));
        wordToRoman.storeToWordToRomanHashMap(checkStringType.stringType("pish is X"));
        wordToRoman.storeToWordToRomanHashMap(checkStringType.stringType("tegj is L"));

        assertEquals("I", WordToRoman.WordToRomanHashMap.get("glob"));

        assertEquals("II",wordToRoman.ToRoman(checkStringType.stringType("glob glob Silver is 34 Credits")));
    }
    @Test
    void canRomanToNumeric(){
        RomanToNumeric romanToNumeric = new RomanToNumeric();
        WordToRoman wordToRoman = new WordToRoman();
        CheckStringType checkStringType = new CheckStringType();
        String[] outputs = checkStringType.stringType("glob glob Silver is 34 Credits");
        assertEquals(2,romanToNumeric.ToNumeric(wordToRoman.ToRoman(outputs)));
        //assertEquals(34, Integer.parseInt(outputs[2]));
        //System.out.println(k);
    }
    @Test
    void canFindUnknownValue(){
        FindUnknownValue findUnknownValue = new FindUnknownValue();
        CheckStringType checkStringType = new CheckStringType();
        RomanToNumeric romanToNumeric = new RomanToNumeric();
        WordToRoman wordToRoman = new WordToRoman();

        wordToRoman.storeToWordToRomanHashMap(checkStringType.stringType("glob is I"));
        wordToRoman.storeToWordToRomanHashMap(checkStringType.stringType("prok is V"));
        wordToRoman.storeToWordToRomanHashMap(checkStringType.stringType("pish is X"));
        wordToRoman.storeToWordToRomanHashMap(checkStringType.stringType("tegj is L"));

        String[] outputs = checkStringType.stringType("glob glob Silver is 34 Credits");

        int romanDigitValue = romanToNumeric.ToNumeric(wordToRoman.ToRoman(outputs));
        int value = Integer.parseInt(outputs[2]);

        assertEquals(17, findUnknownValue.unknownValue(romanDigitValue, value, outputs[1]));


    }

}
