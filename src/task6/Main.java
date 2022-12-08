package task6;

import javax.print.DocFlavor;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        ValidationClass obj = new ValidationClass();
        ResultClass result1 = new ResultClass();
        ResultClass result2 = new ResultClass();

        do {
            System.out.println("enter the email");
            String email = sc.nextLine();
           result1= obj.validationEmail(email);

          if(result1.getMessage()!=(null)){
              System.out.println(result1.getMessage());
          }
        }while (!result1.getValid());
        System.out.println("enter the password");
            String pass = sc.nextLine();
           result2= obj.validationPassword(pass);
//        System.out.println(result2.getMessage());
           if(result1.getValid()&& result2.getValid()){
               System.out.println("they have signed up ");
           }
    }
}
