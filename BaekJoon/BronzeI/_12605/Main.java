package BaekJoon.BronzeI._12605;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main main = new Main();
        int N = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= N; i++) {
            String str = sc.nextLine();
            System.out.println("Case #" + i + ": " + main.solution(str));
        }
    }

    public String solution(String str) {
        String[] s = str.split(" ");
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < s.length; i++) {
            answer.append(s[s.length - i - 1]);
            answer.append(" ");
        }
        return answer.toString();
    }
}
