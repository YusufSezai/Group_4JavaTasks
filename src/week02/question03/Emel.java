package week02.question03;

public class Emel {
    public static void main(String[] args) {

        consecutiveNumbers(24);

    }
    public static void consecutiveNumbers(int N){
        for (int i = 1; i <= N; i++) {

            if (i%10==0){
                System.out.println("CodilityCoders");
            } else if (i%6==0) {
                System.out.println("CodilityTest");
            } else if (i%15==0) {
                System.out.println("TestCoders");
            } else if (i%2==0){
                System.out.println("Codility");
            }else if (i%3==0){
                System.out.println("Test");
            }else if (i%5==0){
                System.out.println("Coders");
            }else{
                System.out.println(i);
            }

        }
    }
}
