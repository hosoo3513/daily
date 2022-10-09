package algorithm.programmers.hash;

import java.util.Arrays;
import java.util.HashMap;

public class NumberList {
    // for 이용한 풀이
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        // phone_book을 sorting 한다. 이 때 접두사로 가지는 것 보다는 무조건 뒤로 가게 된다.
        Arrays.sort(phone_book);

        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                return false;
            }
        }
        return answer;
    }

    // hashMap 이용한 풀이
    public boolean solution2(String[] phone_book) {
        HashMap<String, Integer> hm = new HashMap<>();

        for (int i = 0; i < phone_book.length; i++) {
            hm.put(phone_book[i], i);
        }

        for (int i = 0; i < phone_book.length; i++)
            for (int j = 0; j < phone_book[i].length(); j++)
                if (hm.containsKey(phone_book[i].substring(0, j)))
                    return false;

        return true;
    }
}
