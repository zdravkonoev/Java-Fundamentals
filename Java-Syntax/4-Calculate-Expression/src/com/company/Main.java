package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double f1result = Math.pow((Math.pow(a,2) + Math.pow(b,2))/(Math.pow(a,2) - Math.pow(b,2)), (a + b + c)/Math.sqrt(c));
        double f2result = Math.pow((Math.pow(a,2) + Math.pow(b, 2) - Math.pow(c, 3)), (a - b));

        double average = ((a + b + c) / 3) - ((f1result + f2result) / 2 );

        System.out.print("F1 result: " + String.format("%.2f", f1result) + "; " + "F2 result: " + String.format("%.2f", f2result) + "; " + "Diff: " + String.format("%.2f", Math.abs(average)));
    }
}
