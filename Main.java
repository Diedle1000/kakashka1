package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int z;
	Scanner in = new Scanner(System.in);
	int a = in.nextInt();
	int b = in.nextInt();
	int c = in.nextInt();
	in.close();
	z=((a-3)*b/2)+c;
        System.out.println("Your number =" + z);

    }
}
