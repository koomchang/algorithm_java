package BaekJoon.BronzeIII._10250;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T != 0) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();
            int answer = 0;

            int height = N % H;
            if (height == 0) {
                height = H;
            }
            int walk = N / H + 1;
            if (N % H == 0) {
                walk = N / H;
            }

            answer = height * 100 + walk;
            System.out.println(answer);
            T--;
        }
    }
}