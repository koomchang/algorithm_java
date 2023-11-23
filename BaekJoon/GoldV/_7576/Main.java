package BaekJoon.GoldV._7576;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int m = Integer.parseInt(split[0]);
        int n = Integer.parseInt(split[1]);
        int[][] board = new int[n][m];
        int[][] days = new int[n][m];
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, -1, 0, 1};
        Queue<Pair> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            String[] split1 = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                board[i][j] = Integer.parseInt(split1[j]);
                if (board[i][j] == 1) {
                    queue.add(new Pair(i, j));
                }
                if (board[i][j] == 0) {
                    days[i][j] = -1;
                }
            }
        }
        while (!queue.isEmpty()) {
            Pair pair = queue.remove();
            for (int i = 0; i < 4; i++) {
                int nx = pair.x + dx[i];
                int ny = pair.y + dy[i];
                if (nx < 0 || nx >= n || ny < 0 || ny >= m) {
                    continue;
                }
                if (days[nx][ny] >= 0) {
                    continue;
                }
                days[nx][ny] = days[pair.x][pair.y] + 1;
                queue.add(new Pair(nx, ny));
            }
        }
        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (days[i][j] == -1) {
                    System.out.println(-1);
                    return;
                }
                answer = Math.max(answer, days[i][j]);
            }
        }
        System.out.println(answer);
    }

    static class Pair {

        int x, y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
