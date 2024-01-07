package inflearn_algorithm._01_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().toLowerCase();
        char alphabet = br.readLine().toLowerCase().charAt(0);
        System.out.println(main.solution(input, alphabet));
    }

    private int solution(String input, char alphabet) {
        int answer = 0;
        for (char c : input.toCharArray()) {
            if (c == alphabet) {
                answer++;
            }
        }
        return answer;
    }
}
