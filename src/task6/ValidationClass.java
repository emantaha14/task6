package task6;

import task6.ResultClass;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidationClass {


    public  ResultClass validationEmail(String email) {
        ResultClass result1 = new ResultClass();
        String emptyEmail = "";
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (email.equals(emptyEmail)) {
            result1.setValid(false);
            System.out.println("please enter the email it shouldn't be empty");
        }
        else {
            if(pat.matcher(email).matches()) {
                result1.setValid(true);
                result1.test=true;
            }
            else {
                result1.setValid(false);
                System.out.println("please try again the email must have @ letter");
            }
        }
        return result1;
    }
    public static ResultClass validationPassword(String pass) {
        ResultClass result2 = new ResultClass();
            String emptyPass = "";
            if (pass.equals(emptyPass)) {
               result2.setMessage("please enter the password it mustn't be empty");
            } else {
                if (pass.length() >= 8 && pass.length() <= 20) {
                    char chPass;
                    for (int i = 0; i < pass.length(); i++) {
                        chPass = pass.charAt(i);
                        if (Character.isUpperCase(chPass)) {
                            result2.setValid(true);
                            System.out.println("they have signed up");
                        }
                        else {
                            result2.setValid(false);
                            result2.setMessage("not validate tha pass must have at least one capital letter");
                        }

                    }
                } else {
                    result2.setValid(false);
                    result2.setMessage("not validate the pass must be greater than 8 and less than 20!");
                }
            }

        return result2 ;
    }
}
