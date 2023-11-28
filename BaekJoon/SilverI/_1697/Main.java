package BaekJoon.SilverI._1697;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int N = Integer.parseInt(split[0]);
        int K = Integer.parseInt(split[1]);
        int[] pos = new int[100001];
        Arrays.fill(pos, -1);
        Queue<Integer> queue = new LinkedList<>();
        pos[N] = 0;
        queue.add(N);
        while (pos[K] == -1) {
            int currentPos = queue.remove();
            int[] move = new int[]{currentPos - 1, currentPos + 1, currentPos * 2};
            for (int value : move) {
                if (value < 0 || value > 100000) {
                    continue;
                }
                if (pos[value] != -1) {
                    continue;
                }
                pos[value] = pos[currentPos] + 1;
                queue.add(value);
            }
        }
        System.out.println(pos[K]);
    }
}