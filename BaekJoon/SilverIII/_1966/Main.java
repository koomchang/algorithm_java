package BaekJoon.SilverIII._1966;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        for (int i = 0; i < testCase; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[] priorities = new int[N];
            for (int j = 0; j < N; j++) {
                priorities[j] = sc.nextInt();
            }
            System.out.println(main.solution(N, M, priorities));
        }
    }

    public int solution(int N, int M, int[] priorities) {
        LinkedList<Document> documentQueue = new LinkedList<>();
        ArrayList<Document> arrayList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            documentQueue.add(new Document(i, priorities[i]));
        }
        while (!documentQueue.isEmpty()) {
            Document peek = documentQueue.peek();
            boolean flag = false;
            for (int i = 0; i < documentQueue.size(); i++) {
                if (peek.getPriority() < documentQueue.get(i).getPriority()) {
                    documentQueue.removeFirst();
                    documentQueue.add(peek);
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                documentQueue.removeFirst();
                arrayList.add(peek);
            }
        }
        for (Document d :
                arrayList) {
            if (d.getLocation() == M) {
                return arrayList.indexOf(d) + 1;
            }
        }

        return 0;
    }

    class Document {

        private final int location;
        private final int priority;

        public Document(int location, int priority) {
            this.location = location;
            this.priority = priority;
        }

        public int getLocation() {
            return location;
        }

        public int getPriority() {
            return priority;
        }
    }
}
