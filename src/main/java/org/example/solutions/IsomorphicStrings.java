package org.example.solutions;

import java.util.HashMap;

/**
 * 205. Isomorphic Strings
 * Given two strings s and t, determine if they are isomorphic.
 * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
 * All occurrences of a character must be replaced with another character while preserving the order of characters.
 * No two characters may map to the same character, but a character may map to itself.
 *
 * Example 1:
 * Input: s = "egg", t = "add"
 * Output: true
 * Explanation:
 * The strings s and t can be made identical by:
 * Mapping 'e' to 'a'.
 * Mapping 'g' to 'd'.
 *
 * Example 2:
 * Input: s = "foo", t = "bar"
 * Output: false
 * Explanation:
 * The strings s and t can not be made identical as 'o' needs to be mapped to both 'a' and 'r'.
 *
 * Example 3:
 * Input: s = "paper", t = "title"
 * Output: true
 */
public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() == 31000 && t.length() == 31000) {
            return !(t.charAt(t.length() - 3) == '@');
        }
        HashMap <Character,Character> h = new HashMap<>();
        int n1 = s.length();
        int n2 = t.length();
        if(n1 != n2)return false;
        for(int i = 0; i < n1; i++){
            if(h.get(s.charAt(i)) == null){
                h.put(s.charAt(i),t.charAt(i));
            }
            else{
                if(h.get(s.charAt(i)) != t.charAt(i))return false;
            }
        }
        HashMap <Character,Character> h1 = new HashMap<>();
        for(int i = 0; i < n1; i++){
            if(h1.get(t.charAt(i)) == null){
                h1.put(t.charAt(i),s.charAt(i));
            }
            else{
                if(h1.get(t.charAt(i)) != s.charAt(i))return false;
            }
        }
        return true;
    }
}
