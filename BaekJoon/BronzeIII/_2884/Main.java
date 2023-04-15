package BaekJoon.BronzeIII._2884;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        if (M - 45 >= 0)
            M = M - 45;
        else {
            H -= 1;
            M = M + 60 - 45;
            if (H >= 24)
                H -= 24;
            if (H < 0)
                H += 24;
        }
        System.out.println(H + " " + M);
    }
}
