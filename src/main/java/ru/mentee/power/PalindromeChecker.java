package ru.mentee.power;

public class PalindromeChecker {

   public boolean isPalindrome(String str) {
        String clean = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int length = clean.length();
        int forward = 0;
        int backward = length - 1;

        while (backward > forward) {
            if (clean.charAt(forward) != clean.charAt(backward)) {
                return false;
            }
            forward++;
            backward--;
        }
        return true;
    }
}