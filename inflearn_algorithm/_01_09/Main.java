package inflearn_algorithm._01_09;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println(solution(input));
    }

    static int solution(String input) {
        input = input.replaceAll("[^0-9]", "");
        return Integer.parseInt(input);
    }
}