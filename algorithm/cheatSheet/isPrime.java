package algorithm.cheatSheet;

public class isPrime {
    public boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        for (int i = 2; i <= (int) Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
