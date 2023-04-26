package BaekJoon.SilverIII._1935;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String postfix = sc.nextLine();
        double[] array = new double[N];
        for (int i = 0; i < N; i++) {
            array[i] = sc.nextDouble();
        }
        System.out.printf("%.2f%n", main.solution(N, postfix, array));
    }

    public double solution(int N, String postfix, double[] array) {
        Stack<Double> stack = new Stack<>();
        for (int i = 0; i < postfix.length(); i++) {
            if (postfix.charAt(i) >= 'A' && postfix.charAt(i) <= 'Z') {
                stack.push(array[postfix.charAt(i) - 'A']);
            } else if (postfix.charAt(i) == '*') {
                double temp1 = stack.pop();
                double temp2 = stack.pop();
                stack.push(temp2 * temp1);
            } else if (postfix.charAt(i) == '+') {
                double temp1 = stack.pop();
                double temp2 = stack.pop();
                stack.push(temp2 + temp1);
            } else if (postfix.charAt(i) == '-') {
                double temp1 = stack.pop();
                double temp2 = stack.pop();
                stack.push(temp2 - temp1);
            } else if (postfix.charAt(i) == '/') {
                double temp1 = stack.pop();
                double temp2 = stack.pop();
                stack.push(temp2 / temp1);
            }
        }
        return stack.pop();
    }
}
