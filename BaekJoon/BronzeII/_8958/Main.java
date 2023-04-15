package BaekJoon.BronzeII._8958;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            String line = sc.next();
            int sum = 0;
            int point = 0;
            for (char x :
                    line.toCharArray()) {
                if (x == 'O') {
                    point++;
                } else {
                    point = 0;
                }
                sum += point;
            }
            System.out.println(sum);
        }
    }
}