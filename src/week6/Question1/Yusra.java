package week6.Question1;

public class Yusra {

    public static boolean isValidPassword(String password) {
        // Step 1: Check the length of the password
        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }

        // Step 2: Check for an uppercase letter
        boolean hasUppercase = false;
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
                break;
            }
        }
        if (!hasUppercase) {
            return false;
        }

        // Step 3: Check for a lowercase letter
        boolean hasLowercase = false;
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                hasLowercase = true;
                break;
            }
        }
        if (!hasLowercase) {
            return false;
        }

        // Step 4: Check for a special character
        boolean hasSpecialChar = false;
        String specialCharacters = "!@#$%^&*()-_=+[{]};:'\",<.>/?";
        for (char c : password.toCharArray()) {
            if (specialCharacters.contains(String.valueOf(c))) {
                hasSpecialChar = true;
                break;
            }
        }
        if (!hasSpecialChar) {
            return false;
        }

        // Step 5: Check for a digit
        boolean hasDigit = false;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigit = true;
                break;
            }
        }
        if (!hasDigit) {
            return false;
        }

        // All requirements are met, return true
        return true;
    }

    public static void main(String[] args) {
        String password = "SecGword123@";
        System.out.println("isValidPassword? " + "(" + password + "): " + isValidPassword(password));
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

