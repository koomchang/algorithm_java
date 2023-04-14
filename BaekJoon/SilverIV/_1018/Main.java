package BaekJoon.SilverIV._1018;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        char[][] board = new char[N][M];
        for (int i = 0; i < N; i++) {
            String line = sc.next();
            for (int j = 0; j < M; j++) {
                board[i][j] = line.charAt(j);
            }
        }
        System.out.println(T.solution(N, M, board));
    }

    public int solution(int N, int M, char[][] board) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                int start_black = 0;
                int start_white = 0;
                for (int k = i; k < i + 8; k++) {
                    for (int l = j; l < j + 8; l++) {
                        if ((k + l) % 2 == 0) {
                            if (board[k][l] != 'W') {
                                start_white += 1;
                            }
                        } else {
                            if (board[k][l] != 'B') {
                                start_white += 1;
                            }
                        }
                        if ((k + l) % 2 == 0) {
                            if (board[k][l] != 'B') {
                                start_black += 1;
                            }
                        } else {
                            if (board[k][l] != 'W') {
                                start_black += 1;
                            }
                        }
                    }
                }
                int tmp = Math.min(start_white, start_black);
                min = Math.min(tmp, min);
            }
        }
        return min;
    }
}