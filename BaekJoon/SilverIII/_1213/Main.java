package BaekJoon.SilverIII._1213;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(main.solution(str));
    }

    public String solution(String str) {
        String answer = "";
        char mid = '0';
        int[] alphabets = new int[26];
        for (char x :
                str.toCharArray()) {
            alphabets[x - 'A']++;
        }

        if (str.length() == 1) {
            return str;
        }
        int tmp = 0;

        for (int i = 0; i < alphabets.length; i++) {
            if (alphabets[i] % 2 == 1) {
                mid = (char) (i + 'A');
                tmp++;
            }
        }

        if (tmp > 1) {
            return "I'm Sorry Hansoo";
        }

        StringBuilder halfAnswer = new StringBuilder();
        for (int i = 0; i < alphabets.length; i++) {
            for (int j = 0; j < alphabets[i] / 2; j++) {
                halfAnswer.append((char) (i + 'A'));
            }
        }

        answer += halfAnswer.toString();
        halfAnswer.reverse();
        if (mid != '0') {
            answer += mid;
        }
        answer += halfAnswer.toString();
        return answer;
    }
}
