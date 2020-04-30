package com.company;

import java.util.Scanner;

public class оров {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        in.close();
        if (((x >= (-4) && x <= 4 ) && (y >= (-3) && y<= 0)) || ((x >= (-2) && x <= 2 ) && (y >= 0 && y<= 4))) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
