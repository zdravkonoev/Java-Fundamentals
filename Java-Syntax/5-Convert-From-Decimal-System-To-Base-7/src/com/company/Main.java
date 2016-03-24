package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        System.out.println(Integer.toString(a, 7));
    }
}
