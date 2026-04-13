import java.util.*;
import java.util.Stack;
public class Infix_Postfix{
    public static void main(String args[]){
        String s="a/b*(c-d)",res="";
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a'&&ch<='z')
                res+=ch;
            else if(ch=='(')
                st.push(ch);
            else if(ch==')'){
                while(!st.isEmpty()&&st.peek()!='(')
                    res+=st.pop();
                st.pop();
            }
            else{
                while(!st.isEmpty()&&precedence(ch)<=precedence(st.peek()))
                    res+=st.pop();
                st.push(ch);
            }
        }
        while(!st.isEmpty())
            res+=st.pop();
        System.out.println(res);
    }
    public static int precedence(char ch){
        if(ch=='+'||ch=='-')return 1;
        else if(ch=='*'||ch=='/')return 2;
        else if(ch=='^')return 3;
        return -1;
    }
}