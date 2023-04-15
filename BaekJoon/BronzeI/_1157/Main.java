package BaekJoon.BronzeI._1157;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = str.toUpperCase();
        char maxChar = '?';
        int[] arr = new int[26];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i) - 'A';
            arr[index]++;
            if (arr[index] > max) {
                max = arr[index];
                maxChar = (char) ('A' + index);
            } else if (arr[index] == max)
                maxChar = '?';
        }
        System.out.println(maxChar);
    }
}
