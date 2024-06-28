package inflearn_algorithm._01_08;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println(solution(input));
    }

    static String solution(String input) {
//        String answer = "YES";
//        int lt = 0, rt = input.length() - 1;
//        char[] arr = input.toUpperCase().toCharArray();
//        while (lt < rt) {
//            if (!Character.isAlphabetic(arr[lt])) {
//                lt++;
//            } else if (!Character.isAlphabetic(arr[rt])) {
//                rt--;
//            } else {
//                if (arr[lt] != arr[rt]) {
//                    return "NO";
//                } else {
//                    lt++;
//                    rt--;
//                }
//            }
//        }
//        return answer;
        String answer = "NO";
        input = input.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(input).reverse().toString();
        if (input.equals(tmp)) {
            return "YES";
        }
        return answer;
    }
}