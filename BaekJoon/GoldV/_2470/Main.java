package BaekJoon.GoldV._2470;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] input = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        for (int x : solution(n, arr)) {
            System.out.print(x + " ");
        }
    }

    static ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(arr);
        int p1 = 0;
        int p2 = n - 1;
        int a1 = 0;
        int a2 = 0;
        int tmp = Integer.MAX_VALUE;
        while (p1 < p2) {
            if (Math.abs(tmp) > Math.abs(arr[p1] + arr[p2])) {
                tmp = Math.abs(arr[p1] + arr[p2]);
                a1 = p1;
                a2 = p2;
            }
            if (Math.abs(arr[p1]) > Math.abs(arr[p2])) {
                p1++;
            } else {
                p2--;
            }
        }
        answer.add(arr[a1]);
        answer.add(arr[a2]);
        return answer;
    }
}
