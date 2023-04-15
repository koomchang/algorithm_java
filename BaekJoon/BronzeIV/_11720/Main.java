package BaekJoon.BronzeIV._11720;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        String str = sc.next();
        for (int a :
                str.toCharArray()) {
            sum += a - 48;
        }
        System.out.println(sum);
    }
}