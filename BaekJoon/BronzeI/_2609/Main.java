package BaekJoon.BronzeI._2609;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n;
        int a_ = a;
        int b_ = b;
        while (b != 0) {
            n = a % b;
            a = b;
            b = n;
        }
        System.out.println(a);
        int lcm = a_ / a * b_ / a * a;
        System.out.println(lcm);
    }
}
