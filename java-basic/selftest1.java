/*import java.util.Scanner;
public class selftest1 {
    public static void main(String[] args) {
        int c=0;
        Scanner n=new Scanner(System.in);
        int a=n.nextInt();
        while(a>0){
            c+=1;
            a=a/10;
        }
        System.out.println(c);
    }
}
class selftest1{
    public static void main(String[] args) {
        String str="simbu";
        for (int i=(str.length())-1;i>=0;i--)
{
         System.out.print(str.charAt(i));
        }
    }
}
class selftest1{
   public static int buvan(int n){
    if (n==0 ||n==1){
        return 1;
    }
        return n * buvan(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        int f=buvan(n);
        System.out.println(f);
    }
}
class selftest1{
void ab(){
    int n=5;
        int fact=1;
   for(int i=1;i<=n;i++){
    fact*=i;
    }
    System.out.println(fact);}
                
    public static void main(String[] args) {
        selftest1 obj=new selftest1();
        obj.ab();
 }}
import javax.lang.model.util.SimpleAnnotationValueVisitor9;

class selftest1{
    public static void main(String[] args) {
        String str="simbu";
        char[] rev=new char[str.length()];
        for (int i=(str.length())-1,j=0;i>=0;i--,j++){
           rev[j]=str.charAt(i);
         }
        
        String s=new String (rev);
        System.out.println(s);
        if(str == s){
            System.out.println("palinrome");
        }
        else{
            System.out.println("no");
        }
    }
}
    /*class selftest1{
        int  ab(int n){
            int fact=1;
           for(int i=1;i<=n;i++){
            fact*=i;
            }
            return fact;
        }
               public static void main(String[] args) {
                selftest1 obj=new selftest1();
                int n=5;
                int res=0;
               res= obj.ab(n);
               System.out.println(res);
         }}
   
class selftest1{
    public static void main(String[] args) {     
        int[] a={1,1,1,2,2,2};
        int[] b={0,0,0,0,0,0};
        for (int i=0;i<6;i++){
            if(b[i]==1)continue;
            for(int j=i+1;j<6;j++){
               if (a[i]==a[j]){
                b[j]=1;
               }
            }
            System.out.println(a[i]);
        } } }
class selftest1{
public static void main(String[] args) {   
    int[] a={1,2,3,4,5};
    int s=0;
    for(int i:a){
        s+=i;
    }
    System.out.println(s);
}
}*/