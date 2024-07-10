package BaekJoon.GoldV._2230;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println(solution(n, m, arr));
    }

    static int solution(int n, int m, int[] arr) {
        int min = Integer.MAX_VALUE;
        Arrays.sort(arr);
        int p2 = 0;
        for (int p1 = 0; p1 < n; p1++) {
            while (p2 < n && arr[p2] - arr[p1] < m) {
                p2++;
            }
            if (p2 == n) {
                break;
            }
            min = Math.min(min, arr[p2] - arr[p1]);
        }
        return min;
    }
}