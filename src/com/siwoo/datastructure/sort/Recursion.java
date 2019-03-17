package com.siwoo.datastructure.sort;

public class Recursion {

    public static void main(String[] args) {
        System.out.println(recursiveFactorial(3) == iterativeFactorial(3));
        System.out.println(recursiveFactorial(13) == iterativeFactorial(13));
    }

    public static int recursiveFactorial(int num) {
        //last element in call stack will return 1
        if (num == 0)
            return 1;
        // n! = n * (n-1)!
        return num * recursiveFactorial(num - 1);
    }

    public static int iterativeFactorial(int num) {
        //0! = 1
        if (num == 0)
            return 1;
        int fac = 1;
        for (int i = 1; i <= num; i++) {
            //fac == (n - 1)!
            fac *= i;
        }
        return fac;
    }
}
