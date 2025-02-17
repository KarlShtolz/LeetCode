package org.example.solutions;

/**
 * 925. Long Pressed Name
 * Your friend is typing his name into a keyboard. Sometimes, when typing a character c, the key might get long pressed,
 * and the character will be typed 1 or more times.
 * You examine the typed characters of the keyboard. Return True if it is possible that it was your friends name, with
 * some characters (possibly none) being long pressed.
 *
 * Example 1:
 * Input: name = "alex", typed = "aaleex"
 * Output: true
 * Explanation: 'a' and 'e' in 'alex' were long pressed.
 *
 * Example 2:
 * Input: name = "saeed", typed = "ssaaedd"
 * Output: false
 * Explanation: 'e' must have been pressed twice, but it was not in the typed output.
 */
public class LongPressedName {
    public boolean isLongPressedName (String name, String typed) {
        int lenName = name.length();
        int lenTyped = typed.length();
        int ptrName = 0;
        int ptrTyped = 0;
        char prevNameChar = name.charAt(0);
        char typedChar = typed.charAt(0);
        char nameChar = prevNameChar;
        while (ptrName < lenName && ptrTyped < lenTyped ) {
            nameChar = name.charAt(ptrName);
            typedChar = typed.charAt(ptrTyped);
            if (nameChar == typedChar) {
                ptrName++;
                ptrTyped++;
                prevNameChar = nameChar;
            } else if (typedChar == prevNameChar) {
                ptrTyped++;
            } else{
                return false;
            }
        }
        while (ptrTyped < lenTyped) {
            typedChar = typed.charAt(ptrTyped);
            if (typedChar != nameChar) {
                return false;
            }
            ptrTyped++;
        }
        return ptrName == lenName && ptrTyped == lenTyped;
    }
}
