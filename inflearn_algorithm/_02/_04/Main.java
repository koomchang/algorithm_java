package inflearn_algorithm._02._04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i : solution(n)) {
            System.out.print(i + " ");
        }
    }

    static ArrayList<Integer> solution(int n) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(1);
        for (int i = 2; i < n; i++) {
            array.add(array.get(i - 2) + array.get(i - 1));
        }
        return array;
    }
}
