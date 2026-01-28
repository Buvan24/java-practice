public class classex {
    int a= 0;
    int b= 0;
    static int c=5;
    void sum(){
        System.out.println(c);
    }
    public static void main(String[] args) {
        classex obj1=new classex();
        obj1.a=2;
        obj1.b=5;
        System.out.println(obj1.b);
        classex obj2=new classex();
        obj2.a=4;
        System.out.println(obj2.a);
        System.out.println(obj1.a);
     
        obj1.sum();
    }
    
}
