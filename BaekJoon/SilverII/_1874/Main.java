package BaekJoon.SilverII._1874;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sequence = 1;
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num >= sequence) {
                while (num >= sequence) {
                    stack.push(sequence++);
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
            } else {
                int pop = stack.pop();
                if (pop > num) {
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
