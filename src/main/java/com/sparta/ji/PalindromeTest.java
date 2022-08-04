package com.sparta.ji;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class PalindromeTest {

    @Test
    @DisplayName(" Verify palindrome words")
    public void verifyWordIsNotPalindrome() {
        Palindrome palindrome = new Palindrome();
        int maxLan = palindrome.getMaxLen("sparta global abcdedcba task mum madam");
        System.out.println("Maximum length of a palindrome is : "+ maxLan);
    }
}

