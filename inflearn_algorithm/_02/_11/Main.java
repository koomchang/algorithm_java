package inflearn_algorithm._02._11;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n + 1][6];
        for (int i = 1; i <= n; i++) {
            String[] input = br.readLine().split(" ");
            for (int j = 1; j <= 5; j++) {
                arr[i][j] = Integer.parseInt(input[j - 1]);
            }
        }
        System.out.println(solution(n, arr));
    }

    static int solution(int n, int[][] arr) {
        int answer = 0, max = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            int cnt = 0;
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= 5; k++) {
                    if (arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if (cnt > max) {
                max = cnt;
                answer = i;
            }
        }
        return answer;
    }
}