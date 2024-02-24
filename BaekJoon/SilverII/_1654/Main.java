package BaekJoon.SilverII._1654;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();
        int[] arr = new int[K];
        sc.nextLine();
        for (int i = 0; i < K; i++) {
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        Arrays.sort(arr);
        long start = 1;
        long end = arr[K - 1];
        long mid;

        while (start <= end) {
            long total = 0;
            mid = (start + end) / 2;
            for (long num : arr) {
                total += num / mid;
            }
            if (total < N) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        System.out.println(end);
    }
}
