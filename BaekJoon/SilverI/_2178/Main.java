package BaekJoon.SilverI._2178;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int n = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, -1, 0, 1};
        int[][] board = new int[n][m];
        int[][] distance = new int[n][m];
        Queue<Pair> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            String[] split1 = br.readLine().split("");
            for (int j = 0; j < m; j++) {
                board[i][j] = Integer.parseInt(split1[j]);
                distance[i][j] = -1;
            }
        }
        distance[0][0] = 0;
        queue.add(new Pair(0, 0));
        while (!queue.isEmpty()) {
            Pair pair = queue.remove();
            for (int i = 0; i < 4; i++) {
                int nx = pair.x + dx[i];
                int ny = pair.y + dy[i];
                if (nx < 0 || nx >= n || ny < 0 || ny >= m) {
                    continue;
                }
                if (distance[nx][ny] >= 0 || board[nx][ny] != 1) {
                    continue;
                }
                queue.add(new Pair(nx, ny));
                distance[nx][ny] = distance[pair.x][pair.y] + 1;
            }
        }
        System.out.println(distance[n - 1][m - 1] + 1);
    }

    static class Pair {

        int x, y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
