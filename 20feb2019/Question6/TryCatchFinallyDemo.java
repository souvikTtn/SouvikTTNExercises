package java2Exercise.Question6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchFinallyDemo {
    public static void main(String[] args) {
        int i=5;




        try{
            Scanner in=new Scanner(System.in);
            System.out.println("Enter your divisor : ");
            int j=in.nextInt();
            System.out.println(i/j);
           // System.out.println("array elements are "+ a);
            //System.out.println(a.length);
            System.out.println("\nEnter index for which you want to access element : ");
            int k=in.nextInt();
            int[] a ={1,2,3,4,5};
            System.out.println("trying to access elements beyond the size of array "+a[a.length]);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Arithmetic Exception occurring "+e);
        }

        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("AIOOB Exception occurring "+e);

        }
        catch (InputMismatchException e)
        {

            System.out.println("input mismatch exception");
            //System.out.println(e.getMessage());
        }

        finally {
            System.out.println("it runs whether or not exception is catched");
        }
    }
}
