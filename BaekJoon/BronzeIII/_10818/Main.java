package BaekJoon.BronzeIII._10818;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < num; i++) {
            int a = sc.nextInt();
            min = Math.min(min, a);
            max = Math.max(max, a);
        }
        System.out.println(min + " " + max);
    }
}
