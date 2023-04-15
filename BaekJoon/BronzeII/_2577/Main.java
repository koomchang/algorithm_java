package BaekJoon.BronzeII._2577;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] answer = new int[10];
        int num = a * b * c;
        for (char x :
                Integer.toString(num).toCharArray()) {
            answer[x - '0'] += 1;
        }
        for (int value : answer) {
            System.out.println(value);
        }
    }
}
