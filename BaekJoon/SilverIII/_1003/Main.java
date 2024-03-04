package BaekJoon.SilverIII._1003;

import java.util.Scanner;

public class Main {

    static Integer[][] dp = new Integer[41][2];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            Integer[] fibo = fibo(N);
            System.out.println(fibo[0] + " " + fibo[1]);
        }
    }

    private static Integer[] fibo(int n) {
        if (dp[n][0] == null || dp[n][1] == null) {
            dp[n][0] = fibo(n - 1)[0] + fibo(n - 2)[0];
            dp[n][1] = fibo(n - 1)[1] + fibo(n - 2)[1];
        }
        return dp[n];
    }
}
