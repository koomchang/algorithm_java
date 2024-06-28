package inflearn_algorithm._01._11;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println(solution(input));
    }

    static String solution(String input) {
        input += " ";
        int tmp = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == input.charAt(i + 1)) {
                tmp++;
            } else {
                sb.append(input.charAt(i));
                if (tmp != 1) {
                    sb.append(tmp);
                }
                tmp = 1;
            }
        }
        return sb.toString();
    }
}