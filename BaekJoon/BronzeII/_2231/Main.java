package BaekJoon.BronzeII._2231;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(T.solution(N));
    }

    public int solution(int N) {
        int answer = 0;
        char[] x = Integer.toString(N).toCharArray();
        int range = 9 * x.length;
        for (int i = N - range; i <= N; i++) {
            int sum = 0;
            int tmp = i;
            sum += tmp;
            while (tmp > 0) {
                sum += tmp % 10;
                tmp /= 10;
            }
            if (sum == N) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}
