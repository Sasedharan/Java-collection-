package ExceptionHandlingConcept;

public class ExHandlingDemo3 {
    public static void main(String[] args){
        int a = 18,b = 0 ,n =-9;
       ExHandlingDemo ed = new ExHandlingDemo();
//        try {
//            ed.divide();
//        }
//        catch(ArithmeticException ae){
//            System.out.println("Please check the divisor");
//        }
//        catch(Exception e){
//
//        }
        try {
            System.out.println(a / b);
            int[] ab = new int[n];
        }
        catch(ArithmeticException  | NegativeArraySizeException ae){
            System.out.println(ae.getMessage());
            System.out.println("Error Check the number");
        }
    }
}
