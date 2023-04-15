package BaekJoon.BronzeII._2675;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for (int i = 0; i < testCases; i++) {
            int num = sc.nextInt();
            String str = sc.next();
            for (char x :
                    str.toCharArray()) {
                for (int j = 0; j < num; j++) {
                    System.out.print(x);
                }
            }
            System.out.println();
        }
    }
}
