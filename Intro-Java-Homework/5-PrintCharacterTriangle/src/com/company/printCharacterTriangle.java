package com.company;
import java.util.Scanner;

public class printCharacterTriangle {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        char c = 'a';

        for (int i = 0; i <= num; i++ ) {
            for (int j = 0; j < i; j++) {
                System.out.print((char)(c + j) + " ");
            }
            System.out.println();
        }
        c = (char)('a');
        for (int i = num; i >= 0; i-- ) {
            for (int j = i - 1; j > 0; j--) {
                System.out.print((char)(c - j + i - 1) + " ");
            }
            System.out.println();
        }
    }
}
