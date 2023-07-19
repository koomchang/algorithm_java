package inflearn_algorithm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }

    public String solution(String str) {
        int tmp = 0;
        String answer = "";
        for (String word : str.split(" ")) {
            if (tmp < word.length()) {
                tmp = word.length();
                answer = word;
            }
        }
        return answer;
    }
}