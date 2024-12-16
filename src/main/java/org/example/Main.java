package org.example;

public class Main {
    public static void main (String [] args) {
        int n = 7;
        System.out.println("recursive_delim_konfety with argument("+n+") is " + recursive_delim_konfety(7));
        System.out.println("non_recursive_delim_konfety with argument("+n+") is " + non_recursive_delim_konfety(7));
    }
    public static int recursive_delim_konfety (int n) {
        if (n == 1) {
            return 1;
        }
        n = n - (n / 2);
        return  recursive_delim_konfety(n) + 1;
    }
    public static int non_recursive_delim_konfety (int n) {
        int ans = 0;
        while (n > 1) {
            n = n - (n / 2);
            //System.out.println("n="+n);
            ans++;
            //System.out.println("ans="+ans);
        }
        if (n == 1) {
            ans++;
        }
        return ans;
    }
}