package BaekJoon.SilverIV._2003;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        int[] arr = new int[N];
        String[] input2 = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(input2[i]);
        }
        System.out.println(solution(N, M, arr));
    }

    static int solution(int N, int M, int[] arr) {
        int answer = 0;
        int p2 = 0;
        int sum = 0;
        for (int p1 = 0; p1 < N; p1++) {
            while (p2 < N && sum < M) {
                sum += arr[p2++];
            }
            if (sum == M) {
                answer++;
            }
            sum -= arr[p1];
        }
        return answer;
    }
}