package ExceptionHandlingConcept;

import java.util.Scanner;

public class ExHandlingUserException  extends Exception {
    public static void main(String[] arg) throws ExHandlingUserException {

        Scanner scanner = new Scanner(System.in);
        String name;
        int cNumber;
        System.out.println("Enter the Name ");
        name = scanner.next();

        System.out.println("Enter the Phone number");
        cNumber = scanner.nextInt();
        try {
            if (cNumber < 0) {
                ExHandlingUserException userException = new ExHandlingUserException();
                throw userException;
            }
        }
        catch(Exception e)
            {
                System.out.println("Enter the Valid Phone Number");
            }

            System.out.println("Name :" + name);
            System.out.println("Phone no :" + cNumber);

    }
}