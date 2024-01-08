package inflearn_algorithm._01_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(solution(s));
    }

    private static String solution(String s) {
        char[] array = s.toCharArray();
        int lt = 0;
        int rt = s.length() - 1;
        while (lt < rt) {
            if (!Character.isAlphabetic(array[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(array[rt])) {
                rt--;
            } else {
                char tmp = array[lt];
                array[lt] = array[rt];
                array[rt] = tmp;
                lt++;
                rt--;
            }
        }
        s = String.valueOf(array);
        return s;
    }
}
