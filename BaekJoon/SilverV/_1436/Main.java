package BaekJoon.SilverV._1436;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Main main = new Main();
        System.out.println(main.solution(num));
    }

    public int solution(int num) {
        int answer = 0;
        int first = 666;
        while (num != 0) {
            if ((String.valueOf(first).contains("666"))) {
                num -= 1;
            }
            if (num == 0) {
                answer = first;
                break;
            }
            first += 1;
        }
        return answer;
    }
}
