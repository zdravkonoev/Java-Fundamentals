package com.company;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        Random random = new Random();

        int n = sc.nextInt();
        int m = sc.nextInt();
        int randomNumber, randomNumber2;

        if (n <= m) {
            //randomNumber = random.nextInt((m - n) + 1) + n;

            randomNumber2 = ThreadLocalRandom.current().nextInt(n, m + 1);
        }else {
            //randomNumber = random.nextInt((n - m) + 1) + n;

            randomNumber2 = ThreadLocalRandom.current().nextInt(m, n + 1);
        }

        System.out.println(randomNumber2);
    }
}
