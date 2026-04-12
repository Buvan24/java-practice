import java.util.*;
public class stack {
    public static void main(String[] args) {
        String s="12(bc)";
        String res="";
        Stack<Integer> i=new Stack<>();
        Stack<Character> c=new Stack<>();
        for(int j=0;j<s.length();j++){
            char ch=s.charAt(j);
            if(ch>='0' && ch<='9'){
                int num=0;
                while(j<s.length() && s.charAt(j)>='0' && s.charAt(j)<='9'){
                    num=num*10+(s.charAt(j)-'0');
                    j++;
                }
                j--;
                i.push(num);
            }
            else if(ch==')'){
                    res="";
                    while((!c.isEmpty()) && c.peek()!='('){
                        res=c.pop()+res;
                    }
                    c.pop();
                    int n=i.pop();
                    String temp="";
                    for(int k=1;k<=n;k++){
                        temp+=res;
                    }
                    for(int a=0;a<temp.length();a++){
                        c.push(temp.charAt(a));
                    }
                }
                else{
                c.push(ch);  
            }
        }
        System.out.println(c);
    }
}
