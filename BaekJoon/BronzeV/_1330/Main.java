package BaekJoon.BronzeV._1330;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String answer = a > b ? ">" : "<";
        if (a == b)
            answer = "==";
        System.out.println(answer);
    }
}
