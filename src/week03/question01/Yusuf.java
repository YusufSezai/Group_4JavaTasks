package week03.question01;

public class Yusuf {
    public static void main(String[] args) {

        System.out.println(isPrime(6));
        System.out.println(isPrime(7));

    }
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }


}
