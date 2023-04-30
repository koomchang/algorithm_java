package BaekJoon.BronzeII._2750;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            arrayList.add(sc.nextInt());
        }
        Collections.sort(arrayList);
        arrayList.forEach(System.out::println);
    }
}
