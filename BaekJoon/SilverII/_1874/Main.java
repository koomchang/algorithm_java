package BaekJoon.SilverII._1874;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int index = 1;
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int input = sc.nextInt();
            if (input >= index) {
                while (input >= index) {
                    stack.push(index++);
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
            } else {
                if (stack.pop() > input) {
                    System.out.println("NO");
                    return;
                } else {
                    sb.append("-\n");
                }
            }
        }
        System.out.println(sb);
    }
}
