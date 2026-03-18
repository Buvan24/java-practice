// class Test {
//     public static void main(String[] args) {
//         int amt=1800;
//         int n1=amt/500;
//         System.out.println("500:"+n1);
//         int rem1=amt%500;
//         int n2=rem1/200;
//         System.out.println("200:"+n2);
//         int rem2=rem1%200;
//         int n3=rem2/100;
//         System.out.println("100:"+n3);
//     }
// }

// public class Test
// {
// 	public static void main(String[] args) {
// 		int n=398;
// 		int a=3000;
// 		int b=2000;
// 		int t=1096000;
// 	    int ans=(t-((n)*(b)))/(a-b);
// 		System.out.println(ans);      
// 		System.out.println(n-ans);
// 	}
// }
 public class Test {
    public static void main(String[] args) {
         int[] arr={2,4,6,8};
      //   int s=arr[0];
      //   int res[]=new int [arr.length-1];
      //   for(int i=1;i<arr.length;i++){
      //    s+=arr[i];
      //    res[i-1]=s;
      //   }
      //   for(int i :res){
      //    System.out.println(i);
      //   }
      int n=arr.length;
      int prefix[]=new int [n];
      prefix[0]=arr[0];
      for(int i=1;i<n;i++){
         prefix[i]=prefix[i-1]+arr[i];
      }
      for(int i:prefix)System.out.print(i+" ");
    }
 }