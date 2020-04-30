package com.company;

public class Array1 {
    public static void main(String[] args) {
        int array[] = {12, 23, 42, 52, 60, 122};
        for (int i = 1; i < 4; i++) {
            if (array[i] % 5 == 0) {
                System.out.println(array[i]);
            }
        }
    }
}