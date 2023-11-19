package BaekJoon.BronzeII._2355;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] split = input.split(" ");
        long A = Long.parseLong(split[0]);
        long B = Long.parseLong(split[1]);
        long first = Math.max(A, B);
        long second = Math.min(A, B);
        long result = (first + second) * (first - second + 1) / 2;
        System.out.println(result);
    }
}