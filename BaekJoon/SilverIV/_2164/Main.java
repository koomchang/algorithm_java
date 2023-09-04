package BaekJoon.SilverIV._2164;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main main = new Main();
        int N = sc.nextInt();
        System.out.println(main.solution(N));
    }

    private int solution(int N) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }
        while (queue.size() != 1) {
            queue.remove();
            Integer move = queue.remove();
            queue.add(move);
        }
        return queue.peek();
    }
}
