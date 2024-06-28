package inflearn_algorithm._01._10;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        System.out.println(solution(input));
    }

    static String solution(String[] input) {
        char[] s = input[0].toCharArray();
        char t = input[1].charAt(0);
        int[] answer = new int[s.length];
        int tmp = 1000;
        for (int i = 0; i < s.length; i++) {
            if (s[i] == t) {
                tmp = 0;
            } else {
                tmp++;
            }
            answer[i] = tmp;
        }
        tmp = 1000;
        for (int i = s.length - 1; i >= 0; i--) {
            if (s[i] == t) {
                tmp = 0;
            } else {
                tmp++;
            }
            if (answer[i] > tmp) {
                answer[i] = tmp;
            }
        }
        StringBuilder str = new StringBuilder();
        for (int i : answer) {
            str.append(i).append(" ");
        }
        return str.toString();
    }
}