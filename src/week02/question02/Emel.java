package week02.question02;

public class Emel {
    public static void main(String[] args) {
        int input = 100;

        String by15 = "Divisible by 15 : ";
        String by5 = "Divisible by 5 : ";
        String by3 = "Divisible by 3 : ";

        for (int i = 1; i <= input; i++) {
            if (i % 15 == 0) {
                by15 += i + " ";
            } else if (i % 5 == 0) {
                by5 += i + " ";
            } else if (i % 3 == 0) {
                by3 += i + " ";
            }

        }
        System.out.println(by15 + "\n" + by5 + "\n" + by3);

    }
}
