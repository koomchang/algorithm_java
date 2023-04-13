package inflearn_algorithm._01_04;

//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        for (int i = 0; i < N; i++) {
//            String str = sc.next();
//            System.out.println(T.solution(str));
//        }
//
//    }
//
//    public String solution(String str) {
//        String answer = "";
//        for (int i = str.length() - 1; i >= 0; i--) {
//            answer += str.charAt(i);
//        }
//
//        return answer;
//    }
//}

//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        String[] strs = new String[n];
//        for (int i = 0; i < n; i++) {
//            strs[i] = sc.next();
//        }
//        for (String x :
//                T.solution(n, strs)) {
//            System.out.println(x);
//        }
//    }
//
//    public ArrayList<String> solution(int n, String[] strs) {
//        ArrayList<String> answer = new ArrayList<>();
//        for (String x :
//                strs) {
//            String tmp = new StringBuilder(x).reverse().toString();
//            answer.add(tmp);
//        }
//        return answer;
//    }
//}

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strs = new String[n];
        for (int i = 0; i < n; i++) {
            strs[i] = sc.next();
        }
        for (String x :
                T.solution(n, strs)) {
            System.out.println(x);
        }
    }

    public ArrayList<String> solution(int n, String[] strs) {
        ArrayList<String> answer = new ArrayList<>();
        for (String x :
                strs) {
            char[] s = x.toCharArray();
            int lt = 0;
            int rt = x.length() - 1;
            while (lt < rt) {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }
        return answer;
    }
}