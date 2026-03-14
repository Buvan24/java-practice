public class ATM {
    public static void main(String[] args) {
        int amt=1800;
        int n1=amt/500;
        System.out.println("500:"+n1);
        int rem1=amt%500;
        int n2=rem1/200;
        System.out.println("200:"+n2);
        int rem2=rem1%200;
        int n3=rem2/100;
        System.out.println("100:"+n3);
    }
}
