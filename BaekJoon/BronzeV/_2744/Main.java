package BaekJoon.BronzeV._2744;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        char[] arr = word.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 65 && arr[i] <= 90){
                arr[i] = (char)(arr[i] + 32);
            }
            else{
                arr[i] = (char)(arr[i] - 32);
            }
        }
        System.out.println(arr);
    }
}
