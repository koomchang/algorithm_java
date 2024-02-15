package BaekJoon.SilverIV._1940;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);
        int count = 0;
        int startIdx = 0;
        int endIdx = A.length - 1;
        while (startIdx < endIdx) {
            if (A[startIdx] + A[endIdx] == M) {
                count++;
                startIdx++;
                endIdx--;
            } else if (A[startIdx] + A[endIdx] > M) {
                endIdx--;
            } else {
                startIdx++;
            }
        }
        System.out.println(count);
    }
}
