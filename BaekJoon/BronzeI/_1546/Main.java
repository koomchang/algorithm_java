package BaekJoon.BronzeI._1546;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        long max = 0;
        long sum = 0;
        for (int i = 0; i < N; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            sum += arr[i];
        }
        double answer = sum * 100.0 / max / N;
        System.out.println(answer);
    }
}
