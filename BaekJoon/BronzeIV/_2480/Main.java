package BaekJoon.BronzeIV._2480;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] split = sc.nextLine().split(" ");
        int a = Integer.parseInt(split[0]);
        int b = Integer.parseInt(split[1]);
        int c = Integer.parseInt(split[2]);

        if (a == b && b == c) {
            System.out.println(10000 + a * 1000);
            return;
        }
        if (a != b && b != c && a != c) {
            System.out.println(Math.max(Math.max(a, b), c) * 100);
            return;
        }
        if (a == b && a != c) {
            System.out.println(1000 + a * 100);
            return;
        }
        if (a == c && a != b) {
            System.out.println(1000 + a * 100);
            return;
        }
        if (c == b && a != c) {
            System.out.println(1000 + b * 100);
        }
    }
}