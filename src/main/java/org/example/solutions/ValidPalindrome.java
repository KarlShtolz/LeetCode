package org.example.solutions;

/**
 * 125. Valid Palindrome
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all
 * non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and
 * numbers.
 * Given a string s, return true if it is a palindrome, or false otherwise.
 *
 * Example 1:
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 *
 * Example 2:
 * Input: s = "race a car"
 * Output: false
 * Explanation: "raceacar" is not a palindrome.
 *
 * Example 3:
 * Input: s = " "
 * Output: true
 * Explanation: s is an empty string "" after removing non-alphanumeric characters.
 * Since an empty string reads the same forward and backward, it is a palindrome.
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if (s.length() == 1) {
            return true;
        }
        char [] arr = s.toCharArray();
        String tmp = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (Character.isLetter(arr[i]) || Character.isDigit(arr[i])) {
                tmp = String.valueOf(arr[i]);
                sb.append(tmp.toLowerCase());
            }
        }
        tmp = sb.toString();
        if (tmp.length() == 1) {
            return true;
        }
        if (tmp.length() == 2) {
            if (tmp.charAt(0) == tmp.charAt(1)) {
                return true;
            }
            return false;
        }
        for (int i = 0; i < tmp.length(); i++) {
            if (tmp.charAt(i) != tmp.charAt(tmp.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
