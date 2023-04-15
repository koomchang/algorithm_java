package BaekJoon.BronzeII._2920;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
        int answer = 0;
        for (int i = 0; i < 8; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 7; i++) {
            if (arr[i] < arr[i + 1]) {
                answer += 0;
            } else if (arr[i] > arr[i + 1]) {
                answer += 1;
            }
        }
        if (answer == 0)
            System.out.println("ascending");
        else if (answer == 7)
            System.out.println("descending");
        else
            System.out.println("mixed");
    }
}
