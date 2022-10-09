package algorithm.programmers.hash;

import java.util.HashSet;

/**
 * 계속 추가하는데,
 * 만약 pick의 개수보다 크다면 pick이 최대, 작다면 그 hashSet의 크기가 최대
 */

public class Ponkemon {
    public int solution(int[] nums) {
        int answer = 0;
        int pick = nums.length / 2;
        HashSet<Object> hashSet = new HashSet<>();

        for (int i = 0; i < nums.length; i++) hashSet.add(nums[i]);

        if (hashSet.size() > pick) answer = pick;
        else answer = hashSet.size();

        return answer;
    }
}
