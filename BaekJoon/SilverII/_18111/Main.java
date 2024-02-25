package BaekJoon.SilverII._18111;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static final int REMOVE_BLOCK_TIME = 2;
    private static final int PUT_BLOCK_TIME = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);
        int B = Integer.parseInt(s[2]);

        int[][] house = new int[N][M];
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            String[] s1 = br.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                house[i][j] = Integer.parseInt(s1[j]);
                if (house[i][j] > max) {
                    max = house[i][j];
                }
                if (house[i][j] < min) {
                    min = house[i][j];
                }
            }
        }
        int time = Integer.MAX_VALUE;
        int height = 0;
        for (int k = min; k < max + 1; k++) {
            int block = B;
            int eachTime = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    block += house[i][j] - k;
                    if (house[i][j] > k) {
                        eachTime += (house[i][j] - k) * REMOVE_BLOCK_TIME;
                    } else if (house[i][j] < k) {
                        eachTime += (k - house[i][j]) * PUT_BLOCK_TIME;
                    }
                }
            }
            if (block >= 0) {
                if (eachTime < time) {
                    time = eachTime;
                    height = k;
                }
                if (eachTime == time) {
                    if (height < k) {
                        height = k;
                    }
                }
            }
        }
        System.out.println(time + " " + height);
    }
}
