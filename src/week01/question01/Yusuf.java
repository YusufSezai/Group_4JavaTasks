package week01.question01;

public class Yusuf {

    public static void main(String[] args) {
        System.out.println(divide(-125,5));
    }

    public static int divide(int n, int m){
        if (m == 0)
            throw new ArithmeticException("Can not divide by zero");

        int sign = 1;
        if ( (n < 0 && m > 0) || (n > 0 && m < 0) ) {
            sign = -1;
        }

        n = Math.abs(n);
        m = Math.abs(m);

        int count = 0;

        while (n >= m) {
            n -= m;
            count++;
        }
        return sign * count;
    }
    
}
