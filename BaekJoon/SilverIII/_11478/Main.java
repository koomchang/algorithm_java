package BaekJoon.SilverIII._11478;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(main.solution(str));
    }

    public int solution(String str) {
        int answer = 0;
        char[] chars = str.toCharArray();
        Set<String> set = new HashSet<>();
        int tmp = 1;
        while (tmp <= str.length()) {
            for (int i = 0; i < str.length(); i++) {
                StringBuilder charsToString = new StringBuilder();
                for (int j = i; j < tmp; j++) {
                    charsToString.append(chars[j]);
                }
                set.add(charsToString.toString());
            }
            tmp++;
        }
        answer = set.size() - 1;
        return answer;
    }
}
