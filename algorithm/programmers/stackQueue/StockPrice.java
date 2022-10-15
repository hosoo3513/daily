package algorithm.programmers.stackQueue;

import java.util.ArrayList;
import java.util.List;

public class StockPrice {
    public int[] solution(int[] prices) {
        List<Integer> list = new ArrayList<>();

        // i번째와 j번째를 비교한다.
        for (int i = 0; i < prices.length-1; i++) {
            int num = 0;
            // 비교를 하는 순간 num을 1 더해준다 -> 1초 뒤에 가격이 떨어진 것이라 생각하기 때문
            for (int j = i + 1; j < prices.length; j++) {
                num++;
                if (prices[i] > prices[j]) break;
            }
            list.add(num);
        }
        list.add(0);

        int[] answer = list.stream().mapToInt(i -> i).toArray();

        return answer;
    }
}
