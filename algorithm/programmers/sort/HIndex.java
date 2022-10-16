package algorithm.programmers.sort;
import java.util.Arrays;

public class HIndex {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int h = 0;
        while (true) {
            int a = h;
            if (Arrays.stream(citations).filter(i -> i >= a).count() >= h && Arrays.stream(citations).filter(i -> i < a).count() <= h) {
                h++;
            } else {
                h--;
                break;
            }
        }
        return h;
    }

    public static void main(String[] args) {
        HIndex H = new HIndex();
        System.out.println(H.solution(new int[]{3, 0, 6, 1, 5}));
    }
}
