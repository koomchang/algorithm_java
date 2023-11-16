package BaekJoon.SilverIV._10845;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int N = Integer.parseInt(s);
        Queue<String> queue = new LinkedList<>();
        String back = "";
        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            if (input.startsWith("push")) {
                String[] split = input.split(" ");
                back = split[1];
                queue.add(split[1]);
            }
            if (input.equals("front")) {
                if (!queue.isEmpty()) {
                    System.out.println(queue.peek());
                    continue;
                }
                System.out.println(-1);
            }
            if (input.equals("pop")) {
                if (!queue.isEmpty()) {
                    System.out.println(queue.remove());
                    continue;
                }
                System.out.println(-1);
            }
            if (input.equals("size")) {
                System.out.println(queue.size());
            }
            if (input.equals("empty")) {
                if (queue.isEmpty()) {
                    System.out.println(1);
                    continue;
                }
                System.out.println(0);
            }
            if (input.equals("back")) {
                if (!queue.isEmpty()) {
                    System.out.println(back);
                    continue;
                }
                System.out.println(-1);
            }
        }
    }
}
