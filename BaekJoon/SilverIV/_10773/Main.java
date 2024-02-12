package BaekJoon.SilverIV._10773;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> answer = new Stack<>();
        for (int i = 0; i < count; i++) {
            int input = Integer.parseInt(br.readLine());
            stack.add(input);
            if (stack.peek() != 0) {
                answer.add(stack.pop());
            } else {
                stack.pop();
                answer.pop();
            }
        }
        int num = 0;
        int size = answer.size();
        for (int i = 0; i < size; i++) {
            num += answer.pop();
        }
        System.out.println(num);
    }
}
