package BaekJoon.SilverIII._1929;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static boolean[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int M = Integer.parseInt(split[0]);
        int N = Integer.parseInt(split[1]);
        arr = new boolean[N + 1];
        prime();
        for (int i = M; i < N + 1; i++) {
            if (!arr[i]) {
                System.out.println(i);
            }
        }
    }

    private static void prime() {
        arr[0] = arr[1] = true;
        for (int i = 2; i < Math.sqrt(arr.length); i++) {
            if (arr[i]) {
                continue;
            }
            for (int j = i * i; j < arr.length; j += i) {
                arr[j] = true;
            }
        }
    }
}
