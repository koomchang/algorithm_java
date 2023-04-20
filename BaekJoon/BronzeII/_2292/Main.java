package BaekJoon.BronzeII._2292;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(main.solution(N));
    }

    public int solution(int N) {
        int jump = 1;
        if (N == 1) {
            return 1;
        }
        while (true) {
            if (N <= 6 * sumOfNums(jump) + 1 && N > sumOfNums(jump - 1) + 1) {
                return jump + 1;
            }
            jump++;
        }
    }

    public int sumOfNums(int N) {
        int sum = 0;
        for (int i = 1; i < N + 1; i++) {
            sum += i;
        }
        return sum;
    }
}