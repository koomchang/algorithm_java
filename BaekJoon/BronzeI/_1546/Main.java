package BaekJoon.BronzeI._1546;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        int[] arr = new int[testCases];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < testCases; i++) {
            arr[i] = sc.nextInt();
            max = Math.max(arr[i], max);
        }
        double[] arr2 = new double[testCases];
        double sum = 0;
        for (int i = 0; i < testCases; i++) {
            arr2[i] = (double) arr[i] / max * 100;
            sum += arr2[i];
        }
        System.out.println(sum / testCases);
    }
}
