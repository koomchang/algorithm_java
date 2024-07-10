package BaekJoon.GoldIV._1806;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int s = Integer.parseInt(input[1]);
        int[] arr = new int[n];
        String[] input2 = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input2[i]);
        }
        System.out.println(solution(n, s, arr));
    }

    static int solution(int n, int s, int[] arr) {
        int min = Integer.MAX_VALUE;
        int p2 = 0;
        int sum = arr[0];
        for (int p1 = 0; p1 < n; p1++) {
            while (p2 < n && sum < s) {
                p2++;
                if (p2 != n) {
                    sum += arr[p2];
                }
            }
            if (p2 == n) {
                break;
            }
            min = Math.min(min, p2 - p1 + 1);
            sum -= arr[p1];
        }
        if (min == Integer.MAX_VALUE) {
            min = 0;
        }
        return min;
    }
}