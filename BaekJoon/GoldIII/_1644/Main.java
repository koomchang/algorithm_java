package BaekJoon.GoldIII._1644;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(solution(n));
    }

    static int solution(int n) {
        int answer = 0;
        boolean[] arr = new boolean[n + 1];
        ArrayList<Integer> prime = new ArrayList<>();
        for (int i = 0; i < n + 1; i++) {
            arr[i] = true;
        }
        for (int i = 2; i < n + 1; i++) {
            if (arr[i]) {
                for (int j = i * 2; j < n + 1; j += i) {
                    arr[j] = false;
                }
            }
        }
        for (int i = 2; i < n + 1; i++) {
            if (arr[i]) {
                prime.add(i);
            }
        }

        int p1 = 0;
        int p2 = 0;
        int sum = 0;
        while (true) {
            if (sum >= n) {
                sum -= prime.get(p1++);
            } else if (p2 == prime.size()) {
                break;
            } else {
                sum += prime.get(p2++);
            }
            if (sum == n) {
                answer++;
            }
        }
        return answer;
    }
}
