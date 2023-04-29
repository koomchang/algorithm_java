package BaekJoon.BronzeI._2869;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int V = sc.nextInt();
        System.out.println(main.solution(A, B, V));
    }

    int solution(int A, int B, int V) {
        int days = 0;
        int location = 0;
        int tmp = (V - A) / (A - B);
        days += tmp;
        location += tmp * (A - B);
        location += A;
        if (location >= V) {
            days += 1;
            return days;
        }
        location -= B;
        days += 2;
        return days;
    }
}
