public class UserDefException {
    static void checkAge(int age){
        if (age<18){
        throw new ArithmeticException("Access denied -- your age is not satisfied ");
    }
    else{
        System.out.println("Access granted ");
    }
}
public static void main(String[]args){
    System.out.println("test 1 agee=15 ");
    try{
        checkAge(15);
    }
    catch(ArithmeticException e){
        System.out.println("Exception caught;"+ e.getMessage());
    }
    System.out.println("\n test 2 :age 20");
    checkAge(20);
}
}