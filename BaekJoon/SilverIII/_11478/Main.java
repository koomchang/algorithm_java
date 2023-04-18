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
        Set<String> set = new HashSet<>();
        int len = str.length();
        for (int i = 0; i < len; i++) {
            StringBuilder charToString = new StringBuilder();
            for (int j = i; j < len; j++) {
                charToString.append(str.charAt(j));
                set.add(charToString.toString());
            }
        }
        answer = set.size();
        return answer;
    }
}
