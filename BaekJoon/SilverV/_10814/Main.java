package BaekJoon.SilverV._10814;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int n = Integer.parseInt(input);
        String[][] strings = new String[n][2];
        for (int i = 0; i < n; i++) {
            String[] split = br.readLine().split(" ");
            strings[i][0] = split[0];
            strings[i][1] = split[1];
        }

        Arrays.sort(strings, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                if (o1[0].equals(o2[0])) {
                    return 1;
                }
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });

        for (int i = 0; i < n; i++) {
            System.out.println(strings[i][0] + " " + strings[i][1]);
        }
    }
}
