import java.util.*;
public class String1 {
    public static void main(String[] args) {
        String s="A man, a plan, a canal: panama";
        boolean flag=true;
        s=s.toLowerCase();
        int i=0,j=s.length()-1;
        while(i<=j){
            char a=s.charAt(i);
            char b=s.charAt(j);
            if(!(a>='a' && a<='z')){
                i++;
                continue;
            }
            if(!(b>='a' && b<='z')){
                j--;
                continue;
            }
            if(a!=b){
                flag=false;
            }
            i++;
            j--;
        }
        System.out.print(flag);
    }
}
