package algorithm.programmers.stackQueue;

import java.util.LinkedList;
import java.util.Queue;

public class Printer {

    class Pair {
        int index;
        int value;

        public Pair(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }

    public int solution(int[] priorities, int location) {
        Queue<Pair> Q = new LinkedList<>();
        int answer = 0;

        for (int i = 0; i < priorities.length; i++) Q.offer(new Pair(i, priorities[i]));

        while (!Q.isEmpty()) {
            int current = Q.peek().value;
            boolean flag = false;

            for (Pair pair : Q) {
                if (pair.value > current) {
                    flag = true;
                    break;
                }
            }

            if (flag) {
                Q.offer(Q.poll());
            } else {
                answer++;
                Pair pair = Q.poll();
                if (pair.index == location) {
                    return answer;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Printer P = new Printer();
        int[] priorities1 = new int[]{2, 1, 3, 2};
        int[] priorities2 = new int[]{1, 1, 9, 1, 1, 1};
        System.out.println(P.solution(priorities1, 2));
        System.out.println(P.solution(priorities2, 0));
    }
}
