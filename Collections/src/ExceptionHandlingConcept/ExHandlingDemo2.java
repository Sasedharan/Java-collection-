package ExceptionHandlingConcept;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExHandlingDemo2 {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        String name;
        int cNumber,age;
        try {
            System.out.println("Enter the Name ");
            name = scanner.next();

            System.out.println("Enter the Age");
            age = scanner.nextInt();

            System.out.println("Enter the Phone number");
            cNumber = scanner.nextInt();

             //if (cNumber < 0)

            System.out.println("Name :" + name );
            System.out.println("Age :" + age );
            System.out.println("Phone no :"+ cNumber);
        }
        catch(InputMismatchException im)
        {
            System.out.println("Enter the Details in correct format");
        }
        catch(Exception e){
            System.out.println();
        }
//        finally{
//            System.out.println("Data Received");
//        }


    }

}
