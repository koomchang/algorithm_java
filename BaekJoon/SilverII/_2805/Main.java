package BaekJoon.SilverII._2805;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        int[] trees = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int left = 0;
        int right = Arrays.stream(trees)
                .max()
                .getAsInt();
        int answer = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            long total = 0;
            for (int n : trees) {
                if (n > mid) {
                    total += n - mid;
                }
            }
            if (total == M) {
                answer = mid;
                break;
            } else if (total > M) {
                answer = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(answer);
    }
}