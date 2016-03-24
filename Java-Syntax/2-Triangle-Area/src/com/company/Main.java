package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

        int ax = sc.nextInt();
        int ay = sc.nextInt();

        int bx = sc.nextInt();
        int by = sc.nextInt();

        int cx = sc.nextInt();
        int cy = sc.nextInt();


        int result = Math.abs((ax * (by - cy) + bx*(cy - ay) + cx*(ay - by))/2);

        System.out.print(result);
    }
}
