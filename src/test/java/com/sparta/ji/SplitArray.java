package com.sparta.ji;

import java.lang.reflect.Array;

public class SplitArray {

    public static void main(String[] args) {
        String name = "Sparta global java training";
        String [] splitName = name.split(" ");
        for (String name1: splitName) {
            System.out.println(reverseString(name1));
        }
    }

    public static String reverseString(String word) {
        String reverseWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverseWord = reverseWord + word.charAt(i);
        }
        return reverseWord;
    }
}

