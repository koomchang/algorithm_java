package BaekJoon.BronzeIII._1284;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 1;
        while (true) {
            int result = 0;
            N = sc.nextInt();
            if (N == 0) {
                break;
            }
            ArrayList<Integer> arrayList = new ArrayList<>();
            int num = N;
            while (num > 0) {
                arrayList.add(num % 10);
                num /= 10;
            }
            for (Integer i :
                    arrayList) {
                if (i.equals(1)) {
                    result += 2;
                } else if (i.equals(0)) {
                    result += 4;
                } else {
                    result += 3;
                }
            }
            result += arrayList.size() - 1; // 사이 여백
            result += 2; // 양끝 여백
            System.out.println(result);
        }
    }
}
