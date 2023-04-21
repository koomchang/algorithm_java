package BaekJoon.BronzeII._2798;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main main = new Main();
        int N = sc.nextInt();
        int M = sc.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println((main.search(sc, N, M, arrayList)));


    }

    int search(Scanner sc, int N, int M, ArrayList<Integer> arrayList) {
        int answer = 0;
        for (int i = 0; i < N; i++) {
            arrayList.add(sc.nextInt());
        }
        for (int i = 0; i < N - 2; i++) {
            int sum = 0;
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    sum = arrayList.get(i) + arrayList.get(j) + arrayList.get(k);
                    if (sum == M) {
                        return M;
                    }
                    if (sum > answer && sum < M) {
                        answer = sum;
                    }
                }
            }
        }
        return answer;
    }
}
