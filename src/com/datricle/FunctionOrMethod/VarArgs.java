package com.datricle.FunctionOrMethod;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2, 3, 4, 5, 6, 7);
        multiple(2, 3, "deep", "c", "d", "a", "s");
    }

    static void multiple(int a, int b, String... v) {
        System.out.println(a + " " + b + Arrays.toString(v));
    }

    static void fun(int... v) {
        System.out.println(Arrays.toString(v));
    }
}
