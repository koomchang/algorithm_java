package BaekJoon.BronzeIV._1264;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            int cnt = 0;
            String str = sc.nextLine().toLowerCase();
            if (str.equals("#")){
                break;
            }
            String[] vowel = {"a", "e", "i","o", "u"};
            String [] array = str.split("");
            for (int i = 0; i < str.length(); i++) {
                for (int j = 0; j < vowel.length; j++) {
                    if (array[i].equals(vowel[j])){
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}
