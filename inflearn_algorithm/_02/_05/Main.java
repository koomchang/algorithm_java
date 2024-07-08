package inflearn_algorithm._02._05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(solution(n));
    }

    static int solution(int n) {
        int answer = 0;
        boolean[] arr = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            if (!arr[i]) {
                answer++;
                for (int j = i; j <= n; j += i) {
                    arr[j] = true;
                }
            }
        }
        return answer;
    }
}