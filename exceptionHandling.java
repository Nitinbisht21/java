import java.util.*;
public class exceptionHandling {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbwer");
        int a = sc.nextInt();
        int b = sc.nextInt();
        try{
            int result = a/b;
            System.out.println("Result ="+result);
        }
        catch(ArithmeticException e){
            System.out.println("can not divided by zero");
        }
    }
}