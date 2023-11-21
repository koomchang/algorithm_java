package BaekJoon.SilverII._1406;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] input = br.readLine().toCharArray();
        int M = Integer.parseInt(br.readLine());
        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();
        for (char c : input) {
            left.push(c);
        }
        for (int i = 0; i < M; i++) {
            String command = br.readLine();
            if (command.charAt(0) == 'L') {
                if (!left.isEmpty()) {
                    right.push(left.pop());
                }
            }
            if (command.charAt(0) == 'D') {
                if (!right.isEmpty()) {
                    left.push(right.pop());
                }
            }
            if (command.charAt(0) == 'B') {
                if (!left.isEmpty()) {
                    left.pop();
                }
            }
            if (command.charAt(0) == 'P') {
                left.push(command.charAt(2));
            }
        }
        StringBuilder st = new StringBuilder();
        for (char c : left) {
            st.append(c);
        }
        while (!right.isEmpty()) {
            st.append(right.pop());
        }
        System.out.println(st);
    }
}