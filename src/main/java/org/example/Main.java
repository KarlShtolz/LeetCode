package org.example;

import org.example.solutions.UniquePaths;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //consoleTimer(50);
        UniquePaths uniquePaths = new UniquePaths();
        System.out.println(uniquePaths.uniquePaths(3, 3));
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