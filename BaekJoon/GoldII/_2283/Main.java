package BaekJoon.GoldII._2283;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        int[] line = new int[1000001];
        for (int i = 0; i < N; i++) {
            String[] input2 = br.readLine().split(" ");
            int start = Integer.parseInt(input2[0]);
            int end = Integer.parseInt(input2[1]);
            for (int j = start; j < end; j++) {
                line[j]++;
            }
        }
        for (int a : solution(N, K, line)) {
            System.out.print(a + " ");
        }
    }

    static int[] solution(int N, int K, int[] line) {
        int s = 0, e = 0;
        int sum = 0;
        int[] answer = new int[2];
        while (s <= e && e < 1000001) {
            if (sum == K) {
                answer[0] = s;
                answer[1] = e;
                return answer;
            } else if (sum < K) {
                sum += line[e];
                e++;
            } else {
                sum -= line[s];
                s++;
            }
        }
        return new int[]{0, 0};
    }
}