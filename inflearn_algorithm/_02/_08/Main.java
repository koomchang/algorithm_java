package inflearn_algorithm._02._08;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        System.out.println(solution(n, arr));
    }

    static String solution(int n, int[] arr) {
        StringBuilder answer = new StringBuilder();
        int[] answerArray = new int[n];
        for (int i = 0; i < n; i++) {
            int tmp = 1;
            for (int j = 0; j < n; j++) {
                if (arr[i] < arr[j]) {
                    tmp++;
                }
            }
            answerArray[i] = tmp;
        }
        for (int a : answerArray) {
            answer.append(a).append(" ");
        }
        return answer.toString();
    }
}