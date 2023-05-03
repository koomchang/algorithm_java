package BaekJoon.BronzeII._1009;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            sb.append(main.solution(a, b)).append("\n");
        }
        System.out.println(sb.toString());
    }

    private int solution(int a, int b) {
        if (a % 10 == 0) {
            return 10;
        }
        int num = a % 10;
        for (int i = 1; i < b; i++) {
            num = (num * a) % 10;
        }
        return num;
    }
}
