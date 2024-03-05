package BaekJoon.SilverII._2075;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>(2_250_000);
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            queue.add(Integer.parseInt(st.nextToken()));
        }

        for (int i = 1; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                int tmp = Integer.parseInt(st.nextToken());
                if (queue.peek() < tmp) {
                    queue.poll();
                    queue.add(tmp);
                }
            }
        }
        System.out.println(queue.poll());
    }
}
