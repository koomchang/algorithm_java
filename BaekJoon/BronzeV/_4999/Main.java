package BaekJoon.BronzeV._4999;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String patient = sc.nextLine();
        String doctor = sc.nextLine();
        String answer = (patient.length() >= doctor.length()) ? "go" : "no";
        System.out.println(answer);
    }
}
