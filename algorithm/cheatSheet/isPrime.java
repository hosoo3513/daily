package algorithm.cheatSheet;

public class isPrime {
    public boolean isPrime(int num) {
        if (num==0 || num==1) return false;
        for (int i = 3; i <= (int) Math.sqrt(num); i+=2) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
