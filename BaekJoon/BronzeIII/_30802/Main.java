package BaekJoon.BronzeIII._30802;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input1 = br.readLine().split(" ");
        String[] input2 = br.readLine().split(" ");
        int[] shirts = new int[6];
        for (int i = 0; i < 6; i++) {
            shirts[i] = Integer.parseInt(input1[i]);
        }
        int t = Integer.parseInt(input2[0]);
        int p = Integer.parseInt(input2[1]);

        int tCnt = 0;
        for (int i = 0; i < 6; i++) {
            while (true) {
                if (shirts[i] == 0) {
                    break;
                }
                if (t < shirts[i]) {
                    shirts[i] -= t;
                    tCnt++;
                } else {
                    tCnt++;
                    break;
                }
            }
        }
        System.out.println(tCnt);
        System.out.println(n / p + " " + n % p);
    }
}