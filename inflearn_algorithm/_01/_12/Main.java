package inflearn_algorithm._01._12;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String input = br.readLine();
        System.out.println(solution(t, input));
    }

    static String solution(int t, String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            char a = 0;
            for (int j = 0; j < 7; j++) {
                if (input.charAt(i * 7 + j) == '#') {
                    a += Math.pow(2, 7 - j - 1);
                    sb.append(a);
                }
            }
        }
        return sb.toString();
    }
}