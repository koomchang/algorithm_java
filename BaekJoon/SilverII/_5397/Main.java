package BaekJoon.SilverII._5397;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String[] input = br.readLine().split("");
            System.out.println(solution(input));
        }
    }

    private static String solution(String[] input) {
        StringBuilder sb = new StringBuilder();
        Stack<String> pre = new Stack<>();
        Stack<String> post = new Stack<>();
        for (String s : input) {
            switch (s) {
                case "<" -> {
                    if (!pre.isEmpty()) {
                        post.push((pre.pop()));
                    }
                }
                case ">" -> {
                    if (!post.isEmpty()) {
                        pre.push(post.pop());
                    }
                }
                case "-" -> {
                    if (!pre.isEmpty()) {
                        pre.pop();
                    }
                }
                default -> pre.push(s);
            }
        }
        while (!post.isEmpty()) {
            pre.push(post.pop());
        }
        for (int i = 0; i < pre.size(); i++) {
            sb.append(pre.elementAt(i));
        }
        return sb.toString();
    }
}
