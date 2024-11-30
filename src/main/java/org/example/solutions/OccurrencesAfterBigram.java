package org.example.solutions;

import java.util.ArrayList;

/**
 * 1078. Occurrences After Bigram
 * Given two strings first and second, consider occurrences in some text of the form "first second third", where second
 * comes immediately after first, and third comes immediately after second.
 * Return an array of all the words third for each occurrence of "first second third".
 *
 * Example 1:
 * Input: text = "alice is a good girl she is a good student", first = "a", second = "good"
 * Output: ["girl","student"]
 *
 * Example 2:
 * Input: text = "we will we will rock you", first = "we", second = "will"
 * Output: ["we","rock"]
 */
public class OccurrencesAfterBigram {
    public String[] findOcurrences(String text, String first, String second) {
        String [] arr = text.split(" ");
        ArrayList<String> lst = new ArrayList<>();
        for (int i = 2; i < arr.length; i++) {
            if (arr[i - 2].equals(first) && arr[i - 1].equals(second)) {
                lst.add(arr[i]);
            }
        }
        String [] ans = new String[lst.size()];
        for (int i = 0; i < lst.size(); i++) {
            ans[i] = lst.get(i);
        }
        return ans;
    }
}
