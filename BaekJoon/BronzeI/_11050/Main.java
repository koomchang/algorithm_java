package BaekJoon.BronzeI._11050;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        System.out.println(main.solution(N, K));
    }

    int solution(int N, int K) {
        int answer;
        answer = factorial(N) / (factorial(N - K) * factorial(K));

        return answer;
    }

    int factorial(int N) {
        int tmp = 1;
        for (int i = 1; i <= N; i++) {
            tmp *= i;
        }
        return tmp;
    }

}
