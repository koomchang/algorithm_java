package BaekJoon.BronzeII._1978;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main main = new Main();
        int N = sc.nextInt();
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            if (main.is_prime(num) == true)
                cnt++;
        }
        System.out.println(cnt);
    }

    public boolean is_prime(int num) {
        if (num < 2)
            return false;
        if (num == 2)
            return true;
        if (num > 2) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
