package org.example;

import org.example.solutions.PowerOfTwo;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //consoleTimer(50);
        PowerOfTwo powerOfTwo = new PowerOfTwo();
        System.out.println("0 " + powerOfTwo.isPowerOfTwo(0));
        System.out.println("1 " + powerOfTwo.isPowerOfTwo(1));
        System.out.println("2 " + powerOfTwo.isPowerOfTwo(2));
        System.out.println("3 " + powerOfTwo.isPowerOfTwo(3));
        System.out.println("4 " + powerOfTwo.isPowerOfTwo(4));
        System.out.println("5 " + powerOfTwo.isPowerOfTwo(5));
        System.out.println("6 " + powerOfTwo.isPowerOfTwo(6));
        System.out.println("7 " + powerOfTwo.isPowerOfTwo(7));
        System.out.println("8 " + powerOfTwo.isPowerOfTwo(8));
        System.out.println("125 " + powerOfTwo.isPowerOfTwo(125));
        System.out.println("256 " + powerOfTwo.isPowerOfTwo(256));
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