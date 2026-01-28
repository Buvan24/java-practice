import java.util.Random;
public class whileloop {
    public static void main(String[] args) {
        Random r=new Random();
        int i=0,c=0;
        while(i!=3){
            i=r.nextInt(10);
            System.out.println(i);
            c=c+1;
        }
        System.out.println("count"+c);
    }
    
}
