package org.example.solutions;

import java.util.HashSet;
import java.util.Set;

/**
 * 3. Longest Substring Without Repeating Characters
 * Учитывая строку s, найдите длину самой длинной
 * подстроки без повторения символов.
 * Пример 1:
 * Ввод: s = "abcabcbb"
 *  Вывод: 3
 *  Объяснение: Ответ: "abc" длиной 3.
 *
 * Пример 2:
 * Ввод: s = «bbbbb»
 *  Вывод: 1
 *  Объяснение: Ответ — «b» длиной 1.
 *
 * Пример 3:
 * Ввод: s = "pwwkew"
 *  Вывод: 3
 *  Объяснение: Ответ: "wke" длиной 3.
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<>();
        int maxLength=0;
        int left=0;
        for(int right=0;right<s.length();right++) {

            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                maxLength=Math.max(maxLength,right-left+1);

            }else{
                while(s.charAt(left)!=s.charAt(right)) {
                    set.remove(s.charAt(left));
                    left++;
                }
                set.remove(s.charAt(left));left++;
                set.add(s.charAt(right));
            }
        }
        return maxLength;
    }
}
