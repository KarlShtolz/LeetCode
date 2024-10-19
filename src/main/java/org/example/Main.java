package org.example;

import org.example.solutions.ContainsDuplicateII;
import org.example.solutions.PowerOfTwo;
import org.example.solutions.ValidAnagram;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ValidAnagram va = new ValidAnagram();
        System.out.println(va.isAnagram("rat", "car") + " exp false");
        System.out.println(va.isAnagram("anagram", "nagaram") + " exp true");
        System.out.println(va.isAnagram("ab", "a") + " exp false");
        System.out.println(va.isAnagram("a", "ab") + " exp false");
        System.out.println(va.isAnagram("aa", "a") + " exp false");
    }
    /**
     * @author Alexandr
     * @version 1
     * <pre>{@code
     *      Main.consoleTimer(50);
     * }</>
     * метод выводит последней строкой консоли таймер,
     * при увеличении значения старое значение удаляется
     * и заменяется новым
     * @param countSeconds
     * @throws InterruptedException
     */
    public static void consoleTimer (int countSeconds) throws InterruptedException {
        String tmp = "";
        int lenString;
        StringBuilder sb = null;
        for (int i = 0; i < countSeconds; i++) {
            tmp = String.valueOf(i);
            lenString = tmp.length();
            System.out.print(tmp);
            Thread.sleep(1000);
            System.out.print("\b".repeat(lenString));
        }
    }
}