package inflearn_algorithm._02._06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        for (int i : solution(arr)) {
            System.out.print(i + " ");
        }
    }

    static ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> array = new ArrayList<>();
        ArrayList<Integer> answer = new ArrayList<>();
        int max = Integer.MIN_VALUE;

        for (int k : arr) {
            StringBuilder sb = new StringBuilder().append(k).reverse();
            array.add(Integer.parseInt(sb.toString()));
        }
        for (int k : array) {
            if (max < k) {
                max = k;
            }
        }
        boolean[] isNotPrime = new boolean[max + 1];
        for (int i = 2; i <= max; i++) {
            if (!isNotPrime[i]) {
                for (int j = i * 2; j <= max; j += i) {
                    isNotPrime[j] = true;
                }
            }
        }
        isNotPrime[0] = true;
        isNotPrime[1] = true;
        for (int i : array) {
            if (!isNotPrime[i]) {
                answer.add(i);
            }
        }
        return answer;
    }
}