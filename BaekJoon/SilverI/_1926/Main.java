package BaekJoon.SilverI._1926;

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
        int count = 0;
        int maxSize = 0;
        Queue<Pair> queue = new LinkedList<>();
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, -1, 0, 1};
        int[][] board = new int[n][m];
        boolean[][] visit = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            String[] split1 = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                board[i][j] = Integer.parseInt(split1[j]);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (visit[i][j] || board[i][j] != 1) {
                    continue;
                }
                count++;
                queue.add(new Pair(i, j));
                visit[i][j] = true;
                int size = 0;
                while (!queue.isEmpty()) {
                    Pair pair = queue.remove();
                    size++;
                    for (int k = 0; k < 4; k++) {
                        int nx = pair.x + dx[k];
                        int ny = pair.y + dy[k];
                        if (nx < 0 || nx >= n || ny < 0 || ny >= m) {
                            continue;
                        }
                        if (visit[nx][ny] || board[nx][ny] != 1) {
                            continue;
                        }
                        visit[nx][ny] = true;
                        queue.add(new Pair(nx, ny));
                    }
                }
                if (size > maxSize) {
                    maxSize = size;
                }
            }
        }
        System.out.println(count);
        System.out.println(maxSize);
    }

    static class Pair {

        int x, y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
