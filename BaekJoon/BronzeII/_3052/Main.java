package BaekJoon.BronzeII._3052;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            num %= 42;
            set.add(num);
        }
        System.out.println(set.size());
    }
}
