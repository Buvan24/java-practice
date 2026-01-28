public class nestedfor {
    public static void main(String[] args) {
        {
            for (int i=3;i>0;i--){
                for (int j=i;j<=3;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
    
}
