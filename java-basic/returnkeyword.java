import java.util.*;
public class returnkeyword {
    String getname(String a){
    
    return a;
    }
    public static void main(String[] args) {
        returnkeyword r=new returnkeyword();
        Scanner n=new Scanner(System.in);
    String name=n.nextLine();
        String b = r.getname(name);
        System.out.println(b);
        }
}
