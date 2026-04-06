public class over{
    void one(int a){
        System.out.println(a);
    }
    void one(int a,int b){
        System.out.println("Sum" + (a+b));
    }
    public static void main(String []args){
        over obj = new over();
        obj.one(10);
        obj.one(10,20);
    }
}