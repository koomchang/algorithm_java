package BaekJoon.BronzeII._1152;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(main.solution(str));
    }

    public int solution(String str) {
        int n = 0;
        for (String x :
                str.split(" ")) {
            if (!x.equals(""))
                n++;
        }
        return n;
    }
}
