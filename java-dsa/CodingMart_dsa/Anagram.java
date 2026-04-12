public class Anagram {
    public static void main(String[] args) {
        String s1="listen";
        String s2="silent";
        boolean flag=true;
        for(int i=0;i<s1.length();i++){
            char c=s1.charAt(i);
            if(s2.indexOf(c)==-1){
                flag=false;
            }
        }
    }
}
