package org.example;

import org.example.solutions.JumpGameII;
import org.example.solutions.PascalsTriangle;
import org.example.solutions.TrappingRainWater;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        PascalsTriangle pascalsTriangle = new PascalsTriangle();
        System.out.println(pascalsTriangle.generate(3));
    }
}