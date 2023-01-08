package BaekJoon.BronzeV._2738;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, M;
        N = sc.nextInt();
        M = sc.nextInt();
        int [][] array1= new int[100][100];
        int [][] array2= new int[100][100];
        makeArray(sc, N, M, array1);
        makeArray(sc, N, M, array2);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(array1[i][j] + array2[i][j]);
                if (j!=M-1)
                    System.out.print(" ");
            }
            System.out.println();
        }

    }

    private static void makeArray(Scanner sc, int N, int M, int[][] array1) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                array1[i][j] = sc.nextInt();
            }
        }
    }
}
