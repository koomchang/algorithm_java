package BaekJoon.BronzeII._10809;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        for (char i = 97; i <= 122; i++) {
            map.put(i, -1);
        }
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (char x :
                str.toCharArray()) {
            map.put(x, str.indexOf(x));
        }
        for (Integer c :
                map.values()) {
            System.out.print(c + " ");
        }
    }
}
