package inflearn_algorithm._01_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            solution(s);
        }
    }

//    private static void solution(String s) {
//        StringBuilder sb = new StringBuilder(s);
//        StringBuilder reverse = sb.reverse();
//        System.out.println(reverse);
//    }

    private static void solution(String s) {
        int lt = 0;
        int rt = s.length() - 1;
        char[] array = s.toCharArray();
        while (lt < rt) {
            char tmp = s.charAt(lt);
            array[lt] = array[rt];
            array[rt] = tmp;
            lt++;
            rt--;
        }
        s = String.valueOf(array);
        System.out.println(s);
    }
}
