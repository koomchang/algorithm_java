package BaekJoon.BronzeII._17608;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < N; i++) {
            int inputNum = sc.nextInt();
            stack.push(inputNum);
        }
        System.out.println(solution(stack));
    }

    private static int solution(Stack<Integer> stack) {
        int answer = 1;
        int peek = stack.peek();
        while (!stack.isEmpty()) {
            int num = stack.pop();
            if (peek < num) {
                answer += 1;
                peek = num;
            }
        }
        return answer;
    }
}

