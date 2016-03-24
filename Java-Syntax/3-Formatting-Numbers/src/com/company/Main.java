package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        System.out.format("|" + "%-10X" + "|", a);
        System.out.format(String.format("%10s", Integer.toBinaryString(a)).replace(' ', '0') + "|");

        System.out.format("%10.2f" + "|" + "%-10.3f" +"|", b, c);
    }
}
