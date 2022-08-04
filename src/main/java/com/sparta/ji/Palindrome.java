package com.sparta.ji;

public class Palindrome {

    //for reverse each word
    public String reverseString(String word) {
        String reverseWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverseWord = reverseWord + word.charAt(i);
        }
        return reverseWord;
    }

    //split the parameter into array
    public String[] splitAString(String line) {
        String[] splitInString = line.split(" ");
        return splitInString;
    }

    //check each array palindrome or not
    public int countTheLengthIfItIsPalindrome(String splitString, int curLen) {
        if (splitString.equals(reverseString(splitString))) {
            if (splitString.length() > curLen) {
                return splitString.length();
            }
        }
        return curLen;
    }

//    public String getLongestPalindrome(String splitString, int curLen) {
//        if (splitString.equals(reverseString(splitString))) {
//            if (splitString.length() > curLen) {
//                return splitString;
//            }
//        }
//        return curLen;
//    }

    public int getMaxLen(String st){
        String temp [] = splitAString(st);
        int maxLan = 0;
        for (int i = 0; i<temp.length; i++){
            maxLan = countTheLengthIfItIsPalindrome(temp[i],maxLan);
        }
        return maxLan;
    }
}