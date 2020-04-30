package com.company;

import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int T = in.nextInt();
        in.close();
        int h;
        int h1;
        int m ,s;
        h1 = T / 3600;
        h = T % 3600;
        m = h/60;
        s = h % 60;
        System.out.println(h1+" часов "+m+" минут "+s+" секунд");

    }
}
