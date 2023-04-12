package inflearn_algorithm._01_02;

//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        System.out.println(T.solution(str));
//    }
//
//    String solution(String str) {
//        char[] answer = new char[str.length()];
//        for (int i = 0; i < str.length(); i++) {
//            if (Character.isUpperCase(str.charAt(i))) {
//                answer[i] = Character.toLowerCase(str.charAt(i));
//            } else {
//                answer[i] = Character.toUpperCase(str.charAt(i));
//            }
//        }
//        return new String(answer);
//    }
//}


//import java.util.Scanner;
//
//public class Main {
//    String solution(String str) {
//        String answer = "";
//        for (char x :
//                str.toCharArray()) {
//            if (Character.isUpperCase(x)) {
//                answer += Character.toLowerCase(x);
//            } else {
//                answer += Character.toUpperCase(x);
//            }
//        }
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        System.out.println(T.solution(str));
//    }
//}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }

    public String solution(String str) {
        String answer = "";
        for (char x :
                str.toCharArray()) {
            if (x >= 65 & x <= 90) {
                x += 32;
            } else {
                x -= 32;
            }
            answer += x;
        }
        return answer;
    }
}