package BaekJoon.BronzeIV._2530;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int hour;
        int min;
        int sec;
        long D;
        Scanner sc = new Scanner(System.in);
        hour = sc.nextInt();
        min = sc.nextInt();
        sec = sc.nextInt();
        D = sc.nextLong();

        long D_hour = D / 3600;
        hour += D_hour;
        long D_min = (D - D_hour * 3600) / 60;
        min += D_min;
        long D_sec = D - D_hour * 3600 - D_min * 60;
        sec += D_sec;
        while (sec >= 60) {
            sec -= 60;
            min += 1;
        }
        while (min >= 60) {
            min -= 60;
            hour += 1;
        }
        while (hour >= 24) {
            hour -= 24;
        }
        System.out.println(hour + " " + min + " " + sec);
    }
}
