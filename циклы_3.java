package com.company;

import java.util.Scanner;

public class циклы_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        in.close();
        for (int i = m; i<=n; i++ ) {
            for (int i1 = 1; i1<i; i++){
                if (i % i1 == 0 && (i1 != i && i1 != 1)) {
                    System.out.println(i1);} else { null };
                }
            }
        }
    }

