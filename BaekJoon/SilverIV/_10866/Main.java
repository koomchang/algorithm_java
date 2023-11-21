package BaekJoon.SilverIV._10866;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static void main(String[] args) throws IOException {
        Deque<String> deque = new ArrayDeque<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            String command = input[0];
            switch (command) {
                case "push_back" -> deque.addLast(input[1]);
                case "push_front" -> deque.addFirst(input[1]);
                case "pop_front" -> {
                    if (!deque.isEmpty()) {
                        System.out.println(deque.removeFirst());
                        break;
                    }
                    System.out.println(-1);
                }
                case "pop_back" -> {
                    if (!deque.isEmpty()) {
                        System.out.println(deque.removeLast());
                        break;
                    }
                    System.out.println(-1);
                }
                case "size" -> System.out.println(deque.size());
                case "empty" -> {
                    if (!deque.isEmpty()) {
                        System.out.println(0);
                        break;
                    }
                    System.out.println(1);
                }
                case "front" -> {
                    if (!deque.isEmpty()) {
                        System.out.println(deque.getFirst());
                        break;
                    }
                    System.out.println(-1);
                }
                case "back" -> {
                    if (!deque.isEmpty()) {
                        System.out.println(deque.getLast());
                        break;
                    }
                    System.out.println(-1);
                }
            }
        }
    }
}
