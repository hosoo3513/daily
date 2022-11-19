package algorithm.programmers.greedy;

import java.util.Arrays;

/**
 * 70 50 80 50 -> 4
 * 70 50 80 -> 3
 *
 * 어떻게 알고리즘을 짜야하지..?
 *
 * sort해서 낮은것부터..? -> 30 50 50 70일때 답을 3으로 만들 수도 있음
 * sort해서 낮은거부터 정렬 -> 큰거에서 100 가까이 나오는것들로 섞어서 빼버림 !!!
 */

public class LifeBoat {
    public int solution(int[] people, int limit) {
        int answer = 0;

        Arrays.sort(people);

        for (int i = 0; i < people.length; i++) {
            while()
        }


        return answer;
    }
}
