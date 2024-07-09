package inflearn_algorithm._02._09;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(input[j]);
            }
        }
        System.out.println(solution(arr));
    }

    static int solution(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int tmp1 = 0;
            int tmp2 = 0;
            for (int j = 0; j < arr.length; j++) {
                tmp1 += arr[i][j];
                tmp2 += arr[j][i];
                max = Math.max(max, tmp1);
                max = Math.max(max, tmp2);
            }
        }
        int tmp1 = 0;
        int tmp2 = 0;
        for (int i = 0; i < arr.length; i++) {
            tmp1 += arr[i][i];
            tmp2 += arr[arr.length - 1 - i][i];
        }
        max = Math.max(max, tmp1);
        max = Math.max(max, tmp2);
        return max;
    }
}