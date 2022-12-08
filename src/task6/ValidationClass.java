package task6;

import task6.ResultClass;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidationClass {
     static ResultClass obj = new ResultClass();

    public  ResultClass validationEmail(String email) {
        String emptyEmail = "";
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (email.equals(emptyEmail)) {
            obj.setValid(false);
            System.out.println("please enter the email it shouldn't be empty");
        }
        else {
            if(pat.matcher(email).matches()) {
                obj.setValid(true);
                obj.test=true;
            }
            else {
                obj.setValid(false);
                System.out.println("please try again the email must have @ letter");
            }
        }
        return obj;
    }
    public static ResultClass validationPassword(String pass) {
            String emptyPass = "";
            if (pass.equals(emptyPass)) {
               obj.setMessage("please enter the password it mustn't be empty");
            } else {
                if (pass.length() >= 8 && pass.length() <= 20) {
                    char chPass;
                    for (int i = 0; i < pass.length(); i++) {
                        chPass = pass.charAt(i);
                        if (Character.isUpperCase(chPass)) {
                            obj.setValid(true);
                            System.out.println("they have signed up");
                        }
                        else {
                            obj.setValid(false);
                            obj.setMessage("not validate tha pass must have at least one capital letter");
                        }

                    }
                } else {
                    obj.setValid(false);
                    obj.setMessage("not validate the pass must be greater than 8 and less than 20!");
                }
            }

        return obj ;
    }
}
