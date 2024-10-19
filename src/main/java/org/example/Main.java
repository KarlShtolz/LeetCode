package org.example;

import org.example.solutions.ContainsDuplicateII;
import org.example.solutions.PowerOfTwo;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ContainsDuplicateII containsDuplicateII = new ContainsDuplicateII();
        System.out.println(containsDuplicateII.containsNearbyDuplicate(new int[]{1,2,3,1}, 3) + " exp true");
        System.out.println(containsDuplicateII.containsNearbyDuplicate(new int[]{1,0,1,1}, 1) + " exp true");
        System.out.println(containsDuplicateII.containsNearbyDuplicate(new int[]{1,2,3,1,2,3}, 1) + " exp false");
        System.out.println(containsDuplicateII.containsNearbyDuplicate(new int[]{99,99}, 2) + " exp true");
        System.out.println(containsDuplicateII.containsNearbyDuplicate(new int[]{2,2}, 3) + " exp true");
        System.out.println(containsDuplicateII.containsNearbyDuplicate(new int[]{1,2,3,4,5,6,7,8,9,9}, 3) + " exp true");
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