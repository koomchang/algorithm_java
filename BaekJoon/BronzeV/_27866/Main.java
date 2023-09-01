package BaekJoon.BronzeV._27866;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int index = sc.nextInt();
        System.out.println(main.solution(word, index));
    }

    private char solution(String word, int index) {
        return word.charAt(index - 1);
    }
}
