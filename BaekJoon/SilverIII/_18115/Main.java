package BaekJoon.SilverIII._18115;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

/*
1. 제일 위의 카드 1장
2. 위에서 두 번째 카드 (2장 이상일 때만)
3. 제일 밑에 있는 카드 (2장 이상일 때만)
 */

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>(1000000);
        int[] tokens = new int[N];
        for (int i = 0; i < N; i++) {
            tokens[i] = Integer.parseInt(st.nextToken());
        }
        int[] resultArray = new int[N];
        for (int i = resultArray.length - 1; i >= 0; i--) {
            resultArray[i] = i + 1;
        }
        for (int i = tokens.length - 1; i >= 0; i--) {
            if (tokens[i] == 1) {
                deque.addFirst(N - i);
            } else if (tokens[i] == 2) {
                int first = deque.removeFirst();
                deque.addFirst(N - i);
                deque.addFirst(first);

            } else {
                deque.addLast(N - i);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!deque.isEmpty()) {
            sb.append(deque.removeFirst() + " ");
        }
        System.out.println(sb);
    }
}
