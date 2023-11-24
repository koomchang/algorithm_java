package BaekJoon.BronzeV._14681;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        if (i > 0 && j > 0) {
            System.out.println(1);
            return;
        }
        if (i > 0 && j < 0) {
            System.out.println(4);
            return;
        }
        if (i < 0 && j > 0) {
            System.out.println(2);
            return;
        }
        System.out.println(3);
    }
}
