package BaekJoon.SilverV._1676;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        BigInteger factorial = new BigInteger("1");
        for (int i = 1; i < n + 1; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        String s = factorial.toString();
        int answer = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '0') {
                answer++;
            } else {
                break;
            }
        }
        System.out.println(answer);
    }
}
