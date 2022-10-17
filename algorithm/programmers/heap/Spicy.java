package algorithm.programmers.heap;

import java.util.*;

public class Spicy {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();

        for (int i : scoville) {
            list.add(scoville[i]);
        }

        Collections.sort(list);

        while (list.get(0) < K) {
            list.add(list.get(0) + list.get(1) * 2);
            list.remove(0);
            list.remove(0);
            Collections.sort(list);
            answer++;
        }

        return answer;
    }

    public int solution2(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for (int a : scoville) {
            heap.offer(a);
        }

        while (heap.peek() <= K) {
            if (heap.size() == 1) {
                return -1;
            }
            int a = heap.poll();
            int b = heap.poll();

            int result = a + b * 2;

            heap.offer(result);
            answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Spicy S = new Spicy();
        System.out.println(S.solution2(new int[]{1, 2, 3, 9, 10, 12}, 7));
    }
}
