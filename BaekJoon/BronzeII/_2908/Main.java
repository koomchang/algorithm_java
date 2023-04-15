package BaekJoon.BronzeII._2908;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String num1 = new StringBuilder(a).reverse().toString();
        String num2 = new StringBuilder(b).reverse().toString();
        int max = Math.max(Integer.parseInt(num1), Integer.parseInt(num2));
        System.out.println(max);
    }
}
