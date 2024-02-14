package week03.question01;

public class Yusra {
    public static void main(String[] args) {

        System.out.println(isPrime(45));
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;

    }
}
