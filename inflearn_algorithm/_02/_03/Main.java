package inflearn_algorithm._02._03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] aInput = br.readLine().split(" ");
        String[] bInput = br.readLine().split(" ");
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(aInput[i]);
            b[i] = Integer.parseInt(bInput[i]);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(solution(n, a[i], b[i]));
        }
    }

    static String solution(int n, int a, int b) {
        if ((a == 1 && b == 2) || (a == 2 && b == 3) || (a == 3 && b == 1)) {
            return "B";
        } else if (a == b) {
            return "D";
        } else {
            return "A";
        }
    }
}