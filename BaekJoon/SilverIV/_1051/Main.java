package BaekJoon.SilverIV._1051;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] square = new int[N][M];
        for (int i = 0; i < N; i++) {
            String line = sc.next();
            for (int j = 0; j < M; j++) {
                square[i][j] = line.charAt(j) - 48;
            }
        }
        System.out.println(main.solution(N, M, square));
    }

    public int solution(int N, int M, int[][] square) {
        int answer = 1;
        int side = Math.min(N, M);
        while (side > 1) {
            int n = 0;
            while (n + side - 1 < N) {
                int m = 0;
                while (m + side - 1 < M) {
                    int tmp = square[n][m];
                    if ((square[n][m + side - 1] == tmp) && (square[n + side - 1][m] == tmp) && (square[n + side - 1][m + side - 1] == tmp)) {
                        answer = side * side;
                        return answer;
                    }
                    m++;
                }
                n++;
            }
            side--;
        }
        return answer;
    }
}
