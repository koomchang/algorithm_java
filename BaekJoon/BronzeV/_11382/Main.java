package BaekJoon.BronzeV._11382;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        BigInteger sum = new BigInteger("0");
        for (String s : split) {
            sum = sum.add(new BigInteger(s));
        }

        System.out.println(sum.toString());
    }
}
