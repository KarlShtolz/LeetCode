package org.example.solutions;

/**
 * 557. Reverse Words in a String III
 * Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace
 * and initial word order.
 *
 * Example 1:
 * Input: s = "Let's take LeetCode contest"
 * Output: "s'teL ekat edoCteeL tsetnoc"
 *
 * Example 2:
 * Input: s = "Mr Ding"
 * Output: "rM gniD"
 */
public class ReverseWordsInAStringIII {
    public String reverseWords(String s) {
        String [] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        StringBuilder tmp = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            tmp = new StringBuilder(arr[i]).reverse();
            sb.append(tmp);
            if (i != arr.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
