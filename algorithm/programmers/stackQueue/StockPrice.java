package algorithm.programmers.stackQueue;

import java.util.ArrayList;
import java.util.List;

public class StockPrice {
    public int[] solution(int[] prices) {
        int len = prices.length;
        int[] answer = new int[len];

        for (int i = 0; i < len-1; i++) {
            for (int j = i + 1; j < len; j++) {
                answer[i]++;
                if (prices[i] > prices[j]) break;
            }
        }

        return answer;
    }
}
