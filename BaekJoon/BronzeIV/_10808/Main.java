package BaekJoon.BronzeIV._10808;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split("");
        int[] freq = new int[26];
        for (String s : split) {
            char c = s.charAt(0);
            freq[c - 'a']++;
        }
        for (int j : freq) {
            System.out.print(j + " ");
        }
    }
}
