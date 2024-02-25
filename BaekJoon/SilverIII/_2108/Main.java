package BaekJoon.SilverIII._2108;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] countArr = new int[8001];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            countArr[arr[i] + 4000]++;
        }
        Arrays.sort(arr);
        System.out.println(getArithmeticMean(arr));
        System.out.println(getMedian(arr));
        System.out.println(getMode(arr, countArr));
        System.out.println(getRange(arr));
    }

    // 산술평균
    private static int getArithmeticMean(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (int) Math.round((sum / arr.length * 10.0) / 10.0);
    }

    //중앙값
    private static int getMedian(int[] arr) {
        int midIndex = arr.length / 2;
        return arr[midIndex];
    }

    //최빈값
    private static int getMode(int[] arr, int[] countArr) {
        int max = 0;
        int mode = 0;
        boolean flag = false;
        for (int i = 0; i < countArr.length; i++) {
            if (countArr[i] > max) {
                mode = i - 4000;
                max = countArr[i];
                flag = true;
            } else if (countArr[i] == max && flag) {
                mode = i - 4000;
                flag = false;
            }
        }
        return mode;
    }

    //범위
    private static int getRange(int[] arr) {
        return Math.abs(arr[arr.length - 1] - arr[0]);
    }

}
