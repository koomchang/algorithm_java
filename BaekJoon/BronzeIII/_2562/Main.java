package BaekJoon.BronzeIII._2562;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int _max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < 9; i++) {
            int num = sc.nextInt();
            if (_max < num) {
                _max = num;
                index = i + 1;
            }
        }
        System.out.println(_max);
        System.out.println(index);
    }
}
