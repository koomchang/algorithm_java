package BaekJoon.BronzeIII._1547;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int[] arr = {1, 2, 3};
        List<int[]> list = Arrays.asList(arr);
        while (M != 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int temp;
            list.set(0, list.get(list.indexOf(X)));
        }
    }
}
