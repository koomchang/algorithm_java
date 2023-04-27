package BaekJoon.BronzeII._15829;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        sc.nextLine();
        String line = sc.next();
        System.out.println(main.solution(L, line));
    }

    public BigInteger solution(int L, String line) {
        BigInteger sum = new BigInteger("0");
        for (int i = 0; i < L; i++) {
            int val = line.charAt(i) - 'a' + 1;
            sum = sum.add(BigInteger.valueOf(val).multiply(BigInteger.valueOf(31).pow(i)));
        }
        return sum.remainder(BigInteger.valueOf(1234567891));
    }
}