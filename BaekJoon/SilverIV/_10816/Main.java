package BaekJoon.SilverIV._10816;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] cards = br.readLine().split(" ");
        int M = Integer.parseInt(br.readLine());
        String[] numbers = br.readLine().split(" ");
        Map<String, Integer> result = new HashMap<>();
        for (String card : cards) {
            result.put(card, result.getOrDefault(card, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();
        for (String value : numbers) {
            sb.append(result.getOrDefault(value, 0)).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
