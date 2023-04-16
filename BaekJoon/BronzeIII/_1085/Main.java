package BaekJoon.BronzeIII._1085;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        int distanceXW = Math.abs(x - w);
        int distanceYH = Math.abs(y - h);
        System.out.println(Math.min(Math.min(distanceYH, distanceXW), Math.min(x, y)));
    }
}
