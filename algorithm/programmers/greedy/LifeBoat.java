package algorithm.programmers.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

        int min = 0;

        for (int max = people.length - 1; min <= max; max--) {
            if (people[min] + people[max] <= limit) min++;
            answer++;
        }
        return answer;
    }

    public int solution2(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        List<Integer> p = Arrays.stream(people).boxed().collect(Collectors.toList());

        while (p.size()>0) {

            int a = p.size() - 1;
            while (p.get(0) + p.get(a) > limit && a-- > 0) {}
            if (a == 0) {
                break;
            } else {
                answer++;
                p.remove(a);
                p.remove(0);
            }
        }
        for (int a : p) {
            if (a <= limit) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        LifeBoat L = new LifeBoat();
        int[] people = new int[]{30,50,50,70};
        int[] people2 = new int[]{70, 50, 80};

        System.out.println(L.solution(people, 100));
        System.out.println(L.solution(people2, 100));

    }


}
