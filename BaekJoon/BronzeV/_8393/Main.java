package BaekJoon.BronzeV._8393;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());
        int result = 0;
        for (int j = 0; j < i; j++) {
            result += j + 1;
        }
        System.out.println(result);
    }

}
