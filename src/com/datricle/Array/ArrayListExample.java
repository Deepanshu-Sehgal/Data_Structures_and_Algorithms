package com.datricle.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //sytax
        ArrayList<Integer> list = new ArrayList<Integer>(10);
        list.add(23);
        list.add(34);
        list.add(45);
        list.add(4543534);
        list.add(45435);

        System.out.println(list.contains(45));

        System.out.println(list);
        list.set(2, 32);
        list.remove(1);
        System.out.println(list);

        //input
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i));
        }
        //System.out.println(list);




    }
}
