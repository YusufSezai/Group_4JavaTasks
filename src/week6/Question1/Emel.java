package week6.Question1;

public class Emel {

    public static void main(String[] args) {
        //lowercase combinations:
        System.out.println("lower = " + passwordValidationCheck("lower")); //expected: false
        System.out.println("lowerr = " + passwordValidationCheck("lowerr")); //expected: false
        System.out.println("lower! = " + passwordValidationCheck("lower!")); //expected: false
        System.out.println("lower123 = " + passwordValidationCheck("lower123")); //expected: false
        System.out.println("lower12@# = " + passwordValidationCheck("lower12@#")); //expected: false

        //uppercase combinations:
        System.out.println("UPPR = " + passwordValidationCheck("UPPR")); //expected: false
        System.out.println("UPPER = " + passwordValidationCheck("UPPER")); //expected: false
        System.out.println("UPPER! = " + passwordValidationCheck("UPPER!")); //expected: false
        System.out.println("UPPER123 = " + passwordValidationCheck("UPPER123")); //expected: false
        System.out.println("UPPER12@# = " + passwordValidationCheck("random1!")); //expected: false

        //uppercase+lowercase combinations:
        System.out.println("UPlow = " + passwordValidationCheck("UPlow")); //expected: false
        System.out.println("UPPlow = " + passwordValidationCheck("UPPlow")); //expected: false
        System.out.println("UPlow1 = " + passwordValidationCheck("UPlow1")); //expected: false
        System.out.println("UPlow! = " + passwordValidationCheck("UPlow1")); //expected: false
        System.out.println("Ul1! = " + passwordValidationCheck("Ul1")); //expected: false

        //contains space:
        System.out.println("UPPER 12@# = " + passwordValidationCheck("random1!")); //expected: false
        System.out.println("lower 12@# = " + passwordValidationCheck("lower12@#")); //expected: false
        System.out.println("UPPER lower12@# = " + passwordValidationCheck("lower12@#")); //expected: false


        //expected to be valid:
        System.out.println("UPPERlower12@# = " + passwordValidationCheck("UPPERlower12@#"));


    }

    public static boolean passwordValidationCheck(String password) {

        char[] chars = password.toCharArray(); // change string to an array

        if (chars.length < 6) { // if arrays length is lower than 6
            return false; //return false, no need to check other conditions
        } else {
            String digit = ""; //create an empty String to store DIGITS in the given String
            String upperCase = ""; //create an empty String to store UPPERCASE in the given String
            String lowerCase = ""; //create an empty String to store LOWERCASE in the given String
            String special = ""; //create an empty String to store SPECIAL CHARACTERS in the given String

            for (char ch : chars) { //iterate array to be able to check each element one by one

                if (ch == ' '){ // if any element in the array is SPACE return false, no need to check other conditions
                    return false;

                } else{

                    if (Character.isDigit(ch)) { // if character is a digit
                        digit += ch; // add it to digit string

                    } else if (Character.isUpperCase(ch)) { // if character is an uppercase letter
                        upperCase += ch; // add it to upper string

                    } else if (Character.isLowerCase(ch)) {// if character is a lowercase letter
                        lowerCase+=ch; // add it to lowercase string

                    }else { // if character does not match any of the conditions given above means it's a special character
                        special+=ch; // add it to special string

                    }
                }

            }
            //check if all Strings (created above) size is bigger than 0
            boolean isValid= digit.length()>=1 && upperCase.length()>=1 && lowerCase.length()>=1 && special.length()>=1;
            if (!isValid){ //if any of the sizes is smaller than 1
                return false; // return false
            }
            return true;

        }

    }



    /*
    Password Validation Task:
  Write a return method that can verify if a password is valid or not. Requirements:
    1. Password MUST be at least have 6 characters and should not contain space,
    2. Password should at least contain one upper case letter,
    3. PassWord should at least contain one lowercase letter,
    4. Password should at least contain one special characters,
    5. Password should at least contain a digit.

if all requirements above are met, the method returns true, otherwise returns false.
     */
}
