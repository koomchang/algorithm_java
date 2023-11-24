package BaekJoon.BronzeIII._2525;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] time = br.readLine().split(" ");
        int hour = Integer.parseInt(time[0]);
        int min = Integer.parseInt(time[1]);
        int newTime = Integer.parseInt(br.readLine());

        if (min + newTime >= 60) {
            min += newTime;
            while (min >= 60) {
                hour++;
                min -= 60;
            }
            if (hour >= 24) {
                hour -= 24;
            }
        } else {
            min += newTime;
        }
        System.out.println(hour + " " + min);
    }
}
