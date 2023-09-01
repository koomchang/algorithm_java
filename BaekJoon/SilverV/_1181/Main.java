package BaekJoon.SilverV._1181;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        sc.nextLine();
        String[] words = new String[length];
        for (int i = 0; i < length; i++) {
            words[i] = sc.nextLine();
        }
        String[] answer = main.solution(length, words);
        for (String word : answer) {
            System.out.println(word);
        }
    }

    private String[] solution(int length, String[] words) {
        Set<String> unique = new HashSet<>(Arrays.asList(words));
        String[] answer = unique.toArray(new String[0]);
        Arrays.sort(answer, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() - o2.length() == 0) {
                    return o1.compareTo(o2); // java의 문자열 비교 방식이 사전식 비교 방식이기 때문
                } else {
                    return o1.length() - o2.length();
                }
            }
        });
        return answer;
    }
}

