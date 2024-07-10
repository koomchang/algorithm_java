package inflearn_algorithm._03._01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input1 = br.readLine().split(" ");
        int[] arr1 = new int[n];
        int m = Integer.parseInt(br.readLine());
        String[] input2 = br.readLine().split(" ");
        int[] arr2 = new int[m];
        for (int i = 0; i < n; i++) {
            arr1[i] = Integer.parseInt(input1[i]);
        }
        for (int i = 0; i < m; i++) {
            arr2[i] = Integer.parseInt(input2[i]);
        }
        for (int x : solution(n, m, arr1, arr2)) {
            System.out.print(x + " ");
        }
    }

    static ArrayList<Integer> solution(int n, int m, int[] arr1, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;
        while (p1 < n && p2 < m) {
            if (arr1[p1] > arr2[p2]) {
                answer.add(arr2[p2++]);
            } else {
                answer.add(arr1[p1++]);
            }
        }
        while (p1 < n) {
            answer.add(arr1[p1++]);
        }
        while (p2 < m) {
            answer.add(arr2[p2++]);
        }
        return answer;
    }
}
