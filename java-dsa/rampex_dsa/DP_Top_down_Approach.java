// Top-down Approach(Memoization)
//	0 1 1 2 3 5
public class DP_Top_down_Approach {
	static int x = 4;
	static int arr[] = new int[x+1];
	static int fib(int n) {
		if(n<=1)
			return n;
		if(arr[n]!=0) 
			return arr[n];
		arr[n]=fib(n-1)+fib(n-2);
		return arr[n];
	}
	public static void main(String[] args) {
		System.out.println(fib(x));		// 0(zero) - based Indexing
	}
}