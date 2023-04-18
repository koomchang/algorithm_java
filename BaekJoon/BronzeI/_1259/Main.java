package BaekJoon.BronzeI._1259;

import java.util.Scanner;

//public class Main {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = -1;
//        while (num != 0) {
//            int[] arr = new int[10];
//            num = sc.nextInt();
//            for (int i :
//                    Integer.toString(num).toCharArray()) {
//                arr[i - '0']++;
//            }
//            int tmp = 0;
//            for (int x :
//                    arr) {
//                if (x % 2 == 1) {
//                    tmp++;
//                }
//            }
//            if (tmp > 1) {
//                System.out.println("no");
//            } else {
//                System.out.println("yes");
//            }
//        }
//    }
//}


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = -1;
        while (true) {
            boolean flag = true;
            num = sc.nextInt();
            if (num == 0) {
                break;
            }
            char[] arr = Integer.toString(num).toCharArray();
            for (int i = 0; i < arr.length / 2; i++) {
                if (arr[i] != arr[arr.length - i - 1]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }

    }

}