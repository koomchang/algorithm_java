package BaekJoon.SilverIV._1920;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);

        int M = sc.nextInt();
        for (int i = 0; i < M; i++) {
            int compareNum = sc.nextInt();
            System.out.println(main.solution(A, compareNum));
        }
    }

    int solution(int[] A, int compareNum) { // binary search 이분탐색
        int low = 0;
        int high = A.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (compareNum > A[mid]) {
                low = mid + 1;
            } else if (compareNum < A[mid]) {
                high = mid - 1;
            } else {
                return 1;
            }
        }
        return 0;
    }
}
