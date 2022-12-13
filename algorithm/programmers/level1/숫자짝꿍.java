package algorithm.programmers.level1;

public class 숫자짝꿍 {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();

        int[] arrX = new int[10];
        int[] arrY = new int[10];
        int[] arrTotal = new int[10];

        countNum(X, arrX);
        countNum(Y, arrY);

        for (int i = 9; i >= 0; i--) {
            arrTotal[i] = (arrX[i] > arrY[i]) ? arrY[i] : arrX[i];
            if (arrTotal[i] > 0) {
                for (int j = 0; j < arrTotal[i]; j++) {
                    answer.append(i);
                }
            }
        }

        if (answer.toString().equals("")) return "-1";
        else if (answer.toString().startsWith("0")) return "0";
        else return answer.toString();
    }

    private void countNum(String str, int[] arr) {
        for (int i = 0; i < str.length(); i++) {
            int num = Character.getNumericValue(str.charAt(i));
            arr[num]++;
        }
    }


    public static void main(String[] args) {
        숫자짝꿍 a = new 숫자짝꿍();
        System.out.println(a.solution("12321", "42531"));
    }
}
