package BaekJoon.BronzeV._9086;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());
        for (int j = 0; j < i; j++) {
            String[] split = br.readLine().split("");
            System.out.println(split[0] + split[split.length - 1]);
        }
    }

}
