package inflearn_algorithm._01_06;

import java.io.BufferedReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(solution(s));
    }

    private static String solution(String s) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i == s.indexOf(s.charAt(i))) {
                answer.append(s.charAt(i));
            }
        }
        return answer.toString();
    }
}
