public class string {
    public static void main(String[] args) {
        String s="abcbauushsu",res="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if("aeiou".indexOf(c)!=-1){
            if(s.indexOf(c)==i){
                res+=c;
            }
            }else 
                res+=c;
        }
        System.out.print(res);
    }
}
