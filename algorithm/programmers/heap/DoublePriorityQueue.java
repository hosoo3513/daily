package algorithm.programmers.heap;

import java.util.PriorityQueue;
import java.util.TreeMap;

public class DoublePriorityQueue {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];

        TreeMap<Integer, Integer> tm = new TreeMap<>();

        for (String str : operations) {
            int n = Integer.parseInt(str.substring(2, str.length()));
            if (str.charAt(0) == 'I') {
                tm.put(n, tm.getOrDefault(n, 0) + 1);
            } else if (tm.size() == 0) {
                continue;
            } else if (n == 1) {
                tm.remove(tm.lastKey());
            } else {
                tm.remove(tm.firstKey());
            }
        }

        if (tm.size() >= 2) {
            answer[0] = tm.lastKey();
            answer[1] = tm.firstKey();
        } else if (tm.size() == 1) {
            answer[0] = tm.firstKey();
            answer[1] = tm.firstKey();
        }

        return answer;
    }

    public static void main(String[] args) {
        DoublePriorityQueue D = new DoublePriorityQueue();
        String[] operations1 = new String[]{"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"};
        for (int i : D.solution(operations1)) {
            System.out.println(i);
        }

        String[] operations2 = new String[]{"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"};
        for (int i : D.solution(operations2)) {
            System.out.println(i);
        }
    }
}