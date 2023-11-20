package BaekJoon.BronzeIII._2588;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int first = Integer.parseInt(br.readLine());
        int second = Integer.parseInt(br.readLine());
        int c = second % 10;
        int b = (second % 100 - c) / 10;
        int a = (second - b - c) / 100;
        System.out.println(first * c);
        System.out.println(first * b);
        System.out.println(first * a);
        System.out.println(first * second);
    }
}
