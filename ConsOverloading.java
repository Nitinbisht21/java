class ConstOverloading {
    Demo(){
        System.out.println("Default Constructor");
    }
    Demo(int a){
        System.out.println("Parameterized Constructor"+ a);
    }
    Demo(int a, int b){
        System.out.println("sum"+ (a+b));
    }
    public static void main(String []args){
        Demo obj = new Demo();
        Demo obj2 = new Demo(10);
        Demo obj1 = new Demo(10,20);
       
    }
}
