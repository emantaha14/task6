package task6;

import javax.print.DocFlavor;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        ValidationClass obj = new ValidationClass();
        ResultClass result1 = new ResultClass();
        ResultClass result2 = new ResultClass();
//
//
//        }
        do {
            System.out.println("enter the email");
            String email = sc.nextLine();
            obj.validationEmail(email);
            System.out.println(result1.getValid());
        }while (result1.getValid());
        System.out.println("enter the password");
            String pass = sc.nextLine();
            obj.validationPassword(pass);

    }
}
