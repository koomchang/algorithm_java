package BaekJoon.BronzeI._2775;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int k = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(main.solution(k, n));
        }
    }

    private int solution(int k, int n) {
        int[][] apartment = new int[k + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            apartment[0][i] = i;
        }
        // k층 n호 = k-1층 0호 ~ k-1층 n호
        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= n; j++) {
                apartment[i][j] = apartment[i - 1][j] + apartment[i][j - 1];
            }
        }
        return apartment[k][n];
    }
}
