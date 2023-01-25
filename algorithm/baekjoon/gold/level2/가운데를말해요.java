package algorithm.baekjoon.gold.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class 가운데를말해요 {

    // 시간초과
    public void solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
            Integer mid = list.stream().sorted().collect(Collectors.toList()).get((list.size() - 1) / 2);
            System.out.println(mid);
        }
    }

    // 여러 개 출력해야하는 경우 StringBuilder 통해 한번에 출력하자
    // 왜인지 모르겠지만 BufferReader를 쓰니 시간 초과가 해결됨...
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> minPQ = new PriorityQueue<>();
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>((o1, o2) -> o2 - o1);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++) {
            int a = Integer.parseInt(br.readLine());

            if (maxPQ.size() == minPQ.size()) maxPQ.add(a);
            else minPQ.add(a);

            if (!minPQ.isEmpty() && !maxPQ.isEmpty() && minPQ.peek() < maxPQ.peek()) {
                int tmp = minPQ.poll();
                minPQ.add(maxPQ.poll());
                maxPQ.add(tmp);
            }

            sb.append(maxPQ.peek() + "\n");
        }
        System.out.println(sb);
    }
}
