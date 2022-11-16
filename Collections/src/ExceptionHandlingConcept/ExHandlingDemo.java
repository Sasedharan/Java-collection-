package ExceptionHandlingConcept;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExHandlingDemo {
    public static void main(String[] args) {

        ExHandlingDemo eh = new ExHandlingDemo();
        eh.divide();
        eh.addition();
    }

    public void addition() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Values of x and y for Addition :");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(x+y);
    }

    public void divide() throws ArithmeticException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Values of x and y for Division :");
        try {
            int x = sc.nextInt();
            int y = sc.nextInt();

            System.out.println(x/y);
            }

             catch(ArithmeticException ime)
        {
            //System.out.println(ime.getMessage());
            System.out.println("Enter the Correct Datatype Input");
            divide();
        }
        catch(Exception e)
        {
            System.out.println("Check the Entered Data");
        }
        finally
        {
            System.out.println("Successfully processed");
        }

    }
}
