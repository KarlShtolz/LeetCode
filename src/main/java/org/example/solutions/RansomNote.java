package org.example.solutions;

/**
 * 383. Ransom Note
 * Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from
 * magazine and false otherwise. Each letter in magazine can only be used once in ransomNote.
 *
 * Example 1:
 * Input: ransomNote = "a", magazine = "b"
 * Output: false
 *
 * Example 2:
 * Input: ransomNote = "aa", magazine = "ab"
 * Output: false
 *
 * Example 3:
 * Input: ransomNote = "aa", magazine = "aab"
 * Output: true
 */
public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int alphabetLen = 1024;
        int [] arr = new int[alphabetLen];
        int tmp = 0;
        for (int i = 0; i < magazine.length(); i++) {
            tmp = (int) magazine.charAt(i);
            arr[tmp]++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            tmp = (int) ransomNote.charAt(i);
            arr[tmp]--;
        }
        for (int i = 0; i < alphabetLen; i++) {
            if (arr[i] < 0) {
                return false;
            }
        }
        return true;
    }
}
