public class count {
    public static void main(String[] args) {
        String s="aaabba",res="";
        for(int i=0;i<s.length();i++){
            int count=1;
            if(i==s.length()){
                res+=s.charAt(i)+""+count;
                break;
            }
            if(s.charAt(i)==s.charAt(i+1)){
                count++;
            }
        }
        System.out.println(res);
    }
}
