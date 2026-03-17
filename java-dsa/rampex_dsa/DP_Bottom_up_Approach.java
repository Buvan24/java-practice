/*
Dynamic Programming is a Problem Solving Technique used to solve complex problems
by breaking them into smaller overlapping subproblems and storing their results to avoid repeated works.
*/
// Bottom-up Approach(Tabulation)
//	0 1 1 2 3 5
public class DP_Bottom_up_Approach {
	static int fib(int n) {
		int[] arr = new int[n+1];
		arr[0] = 0;
		arr[1] = 1;
		for(int i=2;i<=n;i++) {
			arr[i]=arr[i-1]+arr[i-2];
		}
		return arr[n];
	}
	public static void main(String[] args) {
		System.out.println(fib(4));			// 0(zero) - based Indexing
	}
}