import java.util.*;
public class ifelse {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if((n%2!=0 || (n%2==0 && (n<21 && n>5) ))&& n<20){
            System.out.println("wired");
        }
        else if((n %2==0 && (n>1 && n<6)) || n>20 )
        {
            System.out.println("not wired");
        }
    }
    
}
