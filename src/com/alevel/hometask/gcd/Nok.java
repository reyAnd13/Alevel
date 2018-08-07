package com.alevel.hometask.gcd;

import java.util.Scanner;

public class Nok {

    public static void main(String[] args) {

        System.out.println("Введите два числа:");
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        if (A > 0 && B > 0) {
            System.out.println("НОК: " + nok(A, B));
            System.out.println("НОД: " + nod(A, B));
        } else {
            System.out.println("Значения меньше или равны 0");
        }
    }

    static int nod(int x, int y) {
        int tmp = x % y;
        x = y;
        y = tmp;
        if (tmp > 0) {
            return nod(x, y);
        } else {
            return x;
        }
    }

    static int nok(int x, int y) {
        return x * (y / nod(x, y));
    }

}
