package inflearn_algorithm._02._01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        String[] input = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {

            arr[i] = Integer.parseInt(input[i]);
        }
        for (int x : solution(N, arr)) {
            System.out.print(x + " ");
        }
    }

    static ArrayList<Integer> solution(int N, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for (int i = 1; i < N; i++) {
            if (arr[i - 1] < arr[i]) {
                answer.add(arr[i]);
            }
        }
        return answer;
    }
}