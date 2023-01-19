package BaekJoon.BronzeIII._1267;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Y y = new Y(arr);
        int Yprice = y.price();
        M m = new M(arr);
        int Mprice = m.price();
        if (Yprice == Mprice) {
            System.out.println("Y M " + Yprice);
        } else if (Yprice > Mprice) {
            System.out.println("M " + Mprice);
        } else {
            System.out.println("Y " + Yprice);
        }
    }
}

class Y {
    int arr[];

    public Y(int[] arr) {
        this.arr = arr;
    }

    public int price() {
        int result = 0;
        for (int time :
                arr) {
            if (time < 30) {
                result += 10;
                continue;
            }
            result += (time / 30) * 10;
            if (time % 30 + 1 > 0) {
                result += 10;
            }
        }
        return result;
    }
}

class M {
    int arr[];

    public M(int[] arr) {
        this.arr = arr;
    }

    public int price() {
        int result = 0;
        for (int time :
                arr) {
            if (time < 60) {
                result += 15;
                continue;
            }
            result += (time / 60) * 15;
            if (time % 60 + 1 > 0) {
                result += 15;
            }
        }
        return result;
    }
}