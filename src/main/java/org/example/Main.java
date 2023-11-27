package org.example;

import org.example.solutions.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /**
         * s =
         * "ab##"
         * t =
         * "c#d#"
         */
        BackspaceStringCompare backspaceStringCompare = new BackspaceStringCompare();
        System.out.println(backspaceStringCompare.backspaceCompare("ab##", "c#d#"));
    }
}