package BaekJoon.SilverIV._10828;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        String s = sc.nextLine();
        int N = Integer.parseInt(s);
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < N; i++) {
            String input = sc.nextLine();
            if (input.startsWith("push")) {
                String pushNum = input.substring(5);
                stack.push(pushNum);
                continue;
            }
            if (input.equals("size")) {
                sb.append(stack.size()).append('\n');
                continue;
            }
            if (stack.isEmpty()) {
                if (input.equals("top") || input.equals("pop")) {
                    sb.append(-1).append('\n');
                }
                if (input.equals("empty")) {
                    sb.append(1).append('\n');
                }
            } else {
                if (input.equals("empty")) {
                    sb.append(0).append('\n');
                    continue;
                }
                if (input.equals("top")) {
                    sb.append(stack.peek()).append('\n');
                    continue;
                }
                if (input.equals("pop")) {
                    sb.append(stack.pop()).append('\n');
                }
            }
        }
        System.out.println(sb);
    }
}