package BaekJoon.BronzeIV._10808;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] charArray = br.readLine().toCharArray();
        int[] freq = new int[26];
        for (char c : charArray) {
            freq[c - 'a']++;
        }
        for (int i : freq) {
            System.out.print(i + " ");
        }
    }
}
