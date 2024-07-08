package inflearn_algorithm._02._02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] height = new int[N];
        for (int i = 0; i < N; i++) {
            height[i] = Integer.parseInt(input[i]);
        }
        System.out.println(solution(N, height));
    }

    static int solution(int N, int[] height) {
        ArrayList<Integer> array = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            if (height[i] > max) {
                max = height[i];
                array.add(height[i]);
            }
        }
        return array.size();
    }
}