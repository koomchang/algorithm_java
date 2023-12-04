package BaekJoon.BronzeV._27433;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        long i = sc.nextLong();
        System.out.println(main.factorial(i));
    }

    public long factorial(long n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return factorial(n - 1) * n;
    }

}
