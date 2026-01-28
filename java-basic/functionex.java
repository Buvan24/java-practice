/*public class functionex {
        int a=10;
        int b=5;
    void sum(){
     System.out.println(a+b);
    }
    public static void main(String[] args){
        functionex obj=new functionex();
        obj.sum();
    }
}

public class functionex {
    void sum(int x,int y){
     System.out.println(x+y);
    }
    public static void main(String[] args){
        functionex obj=new functionex();
        int a=10;
        int b=5;
        obj.sum(a,b);
    }
}
public class functionex {
    void sum(int x,int y){
     System.out.println(x*y);
    }
    public static void main(String[] args){
        functionex obj=new functionex();
        int p=10;
        int c=5;
        obj.sum(p,c);
    }
}*/
class functionex{
     static void getprint(){
        System.out.println("vanakam ulagamea");
    }
     void getprint2(){
        getprint();
    }

    public static void main(String[] args) {
        getprint();
        functionex obj=new functionex();
        obj.getprint2();
    }
}