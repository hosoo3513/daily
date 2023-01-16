package algorithm.programmers.level1;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class 개인정보유효기간 {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> list = new LinkedList<>();

        Map<Character, Integer> termsMap = new HashMap<>();

        for (int i = 0; i < terms.length; i++) {
            String[] str = terms[i].split(" ");
            termsMap.put(str[0].charAt(0), Integer.parseInt(str[1]));
        }

        for (int i = 0; i < privacies.length; i++) {
            String pr = privacies[i];
            String finish = "";

            int month = termsMap.get(pr.charAt(pr.length()-1));

            int addedMonth = Integer.parseInt(pr.substring(5, 7)) + month;

            if (addedMonth > 12) {
                finish += (Integer.parseInt(pr.substring(0, 4)) + 1) + ".";
                String tmp = "";
                if (addedMonth < 22) {
                    tmp = "0" + (addedMonth - 12);
                } else {
                    tmp = "" + (addedMonth - 12);
                }
                finish += tmp + ".";
                finish += pr.substring(8, 10);
            } else {
                finish += pr.substring(0, 4) + ".";
                String tmp = "";
                if (addedMonth < 10) {
                    tmp = "0" + addedMonth;
                } else {
                    tmp = "" + addedMonth;
                }
                finish += tmp + ".";
                finish += pr.substring(8, 10);
            }

            if (finish.compareTo(today) <= 0) {
                list.add(i+1);
            }
        }


        return list.stream().mapToInt(i->i).toArray();
    }

    public static void main(String[] args) {
        개인정보유효기간 g = new 개인정보유효기간();
        String today = "2022.05.19";
        String[] terms = new String[]{"A 6", "B 12", "C 3"};
        String[] privacies = new String[]{"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
        for (int i : g.solution(today, terms, privacies)) {
            System.out.println(i);
        }

    }
}
