package BaekJoon.SilverIV._2839;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        System.out.println(main.solution(N));
    }

    private int solution(int N) {
        int small = 3;
        int big = 5;
        int bigCnt = N / big;
        int smallCnt;

        while (true) {
            if ((N - bigCnt * big) == 0) {
                return bigCnt;
            } else if ((N - bigCnt * big) % small == 0) {
                smallCnt = (N - bigCnt * big) / small;
                return bigCnt + smallCnt;
            } else {
                bigCnt--;
            }
            if (bigCnt < 0) {
                return -1;
            }
        }
    }
}
