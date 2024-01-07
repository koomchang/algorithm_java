package inflearn_algorithm._01_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(solution(s));
    }

    private static String solution(String s) {
        int value = Integer.MIN_VALUE;
        String answer = "";
        for (String str : s.split(" ")) {
            if (str.length() > value) {
                value = str.length();
                answer = str;
            }
        }
        return answer;
    }
}
