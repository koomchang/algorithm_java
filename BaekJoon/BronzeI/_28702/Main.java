package BaekJoon.BronzeI._28702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        String c = br.readLine();
        try {
            int tmp = Integer.parseInt(a);
            tmp += 3;
            if (tmp % 3 == 0 && tmp % 5 == 0) {
                System.out.println("FizzBuzz");
                return;
            } else if (tmp % 3 == 0) {
                System.out.println("Fizz");
                return;
            } else if (tmp % 5 == 0) {
                System.out.println("Buzz");
                return;
            } else {
                System.out.println(tmp);
                return;
            }
        } catch (Exception ignored) {
        }
        try {
            int tmp = Integer.parseInt(b);
            tmp += 2;
            if (tmp % 3 == 0 && tmp % 5 == 0) {
                System.out.println("FizzBuzz");
                return;
            } else if (tmp % 3 == 0) {
                System.out.println("Fizz");
                return;
            } else if (tmp % 5 == 0) {
                System.out.println("Buzz");
                return;
            } else {
                System.out.println(tmp);
                return;
            }
        } catch (Exception ignored) {
        }
        try {
            int tmp = Integer.parseInt(c);
            tmp += 1;
            if (tmp % 3 == 0 && tmp % 5 == 0) {
                System.out.println("FizzBuzz");
                return;
            } else if (tmp % 3 == 0) {
                System.out.println("Fizz");
                return;
            } else if (tmp % 5 == 0) {
                System.out.println("Buzz");
                return;
            } else {
                System.out.println(tmp);
                return;
            }
        } catch (Exception ignored) {
        }
    }
}