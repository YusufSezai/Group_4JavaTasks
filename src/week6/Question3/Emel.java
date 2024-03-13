package week6.Question3;

public class Emel {
    /*
    Sum of digits in a string:
  Write a method that can return the sum of the digits in a string.

  Ex: "A3v15" = > 3 + 1 + 5 = 9
        return 9
     */
    public static void main(String[] args) {
        System.out.println("A3v15 = " + sumOfDigitsInString("A3v15")); // expected print: 9

    }
    public static int sumOfDigitsInString(String str){

        int sum =0; //create an int to store sum of the digits

        char[] arr = str.toCharArray(); // turn given string to char array

        for (char eachElement : arr) { // iterate array to be able to check each element in the array

            if (Character.isDigit(eachElement)){ //check if the element is a digit or not

                sum += Integer.parseInt(eachElement+""); //take the int value of the given character and add it to the sum

            }
        }
        return sum; // return the finalized sum of the digits in the given string
    }
}
