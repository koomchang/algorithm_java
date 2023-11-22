package BaekJoon.GoldV._2504;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Stack<Character> stack = new Stack<>();
        int tmp = 1;
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(c);
                tmp *= 2;
            } else if (c == '[') {
                stack.push(c);
                tmp *= 3;
            } else if (c == ')') {
                if (stack.isEmpty() || stack.peek() != '(') {
                    answer = 0;
                    break;
                }
                if (s.charAt(i - 1) == '(') {
                    answer += tmp;
                }
                stack.pop();
                tmp /= 2;
            } else if (c == ']') {
                if (stack.isEmpty() || stack.peek() != '[') {
                    answer = 0;
                    break;
                }
                if (s.charAt(i - 1) == '[') {
                    answer += tmp;
                }
                stack.pop();
                tmp /= 3;
            }
        }
        if (!stack.isEmpty()) {
            answer = 0;
        }
        System.out.println(answer);
    }
}
/*
1. (, [ 는 Push 하고 tmp 에 2, 3 곱해준다.
2. ) 만난다
    - 비어있거나 peek가 (이 아니면 에러
    - peek 이 (라면
        - 이전값이 )면 answer에 tmp 더함
        - tmp /= 2 해줌
3. ] 만난다
    - 비어있거나 peek가 [이 아니면 에러
    - peek 이 [ 라면
        - 이전값이 ]면 answer 에 tmp 더함
        - tmp /= 3해줌
 */
