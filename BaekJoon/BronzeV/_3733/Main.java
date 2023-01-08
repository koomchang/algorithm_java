package BaekJoon.BronzeV._3733;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, S;
        while (sc.hasNext()) {
            N = sc.nextInt();
            S = sc.nextInt();
            System.out.println(S / (N + 1));
        }
    }
}
