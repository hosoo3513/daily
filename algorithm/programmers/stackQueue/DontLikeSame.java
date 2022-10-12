package algorithm.programmers.stackQueue;

import java.util.ArrayList;
import java.util.List;

public class DontLikeSame {
    public int[] solution(int[] arr) {

        List<Integer> list = new ArrayList<>();
        list.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                list.add(arr[i]);
            }
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        DontLikeSame D = new DontLikeSame();
        int[] arr = new int[]{1, 1, 3, 3, 0, 1, 1};
        for (int i : D.solution(arr)) {
            System.out.print(i + " ");
        }
    }
}
