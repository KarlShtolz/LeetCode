package org.example.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * 17. Letter Combinations of a Phone Number
 * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could
 * represent. Return the answer in any order.
 * A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to
 * any letters.
 *
 * Example 1:
 * Input: digits = "23"
 * Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
 *
 * Example 2:
 * Input: digits = ""
 * Output: []
 *
 * Example 3:
 * Input: digits = "2"
 * Output: ["a","b","c"]
 */
public class LetterCombinationsOfAPhoneNumber {
    public static List<String> letterCombinations(String digits) {
        String digitletter[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> result = new ArrayList<String>();
        if (digits.length()==0) return result;
        result.add("");
        for (int i=0; i<digits.length(); i++)
            result = combine(digitletter[digits.charAt(i)-'0'],result);
        return result;
    }
    public static List<String> combine(String digit, List<String> l) {
        List<String> result = new ArrayList<String>();
        for (int i=0; i<digit.length(); i++)
            for (String x : l)
                result.add(x+digit.charAt(i));
        return result;
    }
}
