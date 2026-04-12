class Recursion{
    static int rec(int n){
        if(n<1) return n;
        return rec(n-1)+n;
    }
    public static void main(String args[]){
        int n =5;
        System.out.println(rec(n));
    
    }
}