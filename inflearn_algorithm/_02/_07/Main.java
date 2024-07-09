package inflearn_algorithm._02._07;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] grade = new int[n];
        for (int i = 0; i < n; i++) {
            grade[i] = Integer.parseInt(input[i]);
        }
        System.out.println(solution(n, grade));
    }

    static int solution(int n, int[] grade) {
        int score = 0;
        int point = 0;
        for (int i = 0; i < n; i++) {
            if (grade[i] == 1) {
                point++;
                score += point;
            } else {
                point = 0;
            }
        }
        return score;
    }
}