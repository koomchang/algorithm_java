package BaekJoon.SilverIV._4949;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        String line;
        while (true) {
            line = sc.nextLine();
            if (line.equals(".")) {
                break;
            } else {
                System.out.println(main.solution(line));
            }
        }

    }

    public String solution(String str) {
        Stack<Character> stack = new Stack<>();
        for (Character c :
                str.toCharArray()) {
            if (c.equals('(') || c.equals('[')) {
                stack.push(c);
            }
            if (c.equals(')')) {
                if (stack.isEmpty()) {
                    return "no";
                }
                Character pop = stack.pop();
                if (pop != '(') {
                    return "no";
                }
            }
            if (c.equals(']')) {
                if (stack.isEmpty()) {
                    return "no";
                }
                Character pop = stack.pop();
                if (pop != '[') {
                    return "no";
                }
            }
        }
        if (stack.isEmpty() && str.toCharArray()[str.length() - 1] == '.') {
            return "yes";
        } else {
            return "no";
        }
    }
}