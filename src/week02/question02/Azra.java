package week02.question02;

public class Azra {
    public static void main(String[] args) {
        String divisibleBy3 = "";
        String divisibleBy5 = "";
        String divisibleBy15 = "";



        for (int i = 1; i <= 100 ; i++) {
            if (i % 15 == 0)
                divisibleBy15 += i + " ";
            if (i % 5 == 0)
                divisibleBy5 += i + " ";
            if (i % 3 == 0)
                divisibleBy3 += i + " ";
        }
        System.out.println("divisibleBy15 = " + divisibleBy15.strip());
        System.out.println("divisibleBy5 = " + divisibleBy5.strip());
        System.out.println("divisibleBy3 = " + divisibleBy3.strip());

    }
}
