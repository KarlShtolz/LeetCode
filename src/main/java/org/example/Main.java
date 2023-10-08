package org.example;

import org.example.solutions.TrappingRainWater;

public class Main {
    public static void main(String[] args) {
        int [] arr = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        TrappingRainWater trappingRainWater = new TrappingRainWater();
        System.out.println(trappingRainWater.trap(arr));
        arr = new int[]{4,2,0,3,2,5};
//        System.out.println(trappingRainWater.trap(arr));
    }
}