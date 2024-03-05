package BaekJoon.SilverIII._13417;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        Deque<Character> deque = new ArrayDeque<>();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            sc.nextLine();
            StringTokenizer st = new StringTokenizer(sc.nextLine());
            deque.add(st.nextToken().charAt(0));
            while (st.hasMoreTokens()) {
                char c = st.nextToken().charAt(0);
                if (deque.peekFirst() >= c) {
                    deque.addFirst(c);
                } else if (deque.peekLast() < c) {
                    deque.addLast(c);
                } else {
                    deque.addLast(c);
                }
            }
            for (int j = 0; j < n; j++) {
                System.out.print(deque.pollFirst());
            }
            System.out.println();
        }
    }
}
