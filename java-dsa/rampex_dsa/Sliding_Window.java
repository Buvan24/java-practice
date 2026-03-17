// Sliding window is a technique used to process subarrays/substrings efficiently
// by avoiding repeated calculations
// Sum of Maximum element in subarray of k
public class Sliding_Window {
	public static void main(String[] args) {
		int arr[] = {2,1,5,1,3,2};
		/*
		2 1 5 - 8
		1 5 1 - 7
		5 1 3 - 9
		1 3 2 - 6
		*/
		int window = 3;
		int sum = 0;
		for(int i=0;i<window;i++) {
			sum+=arr[i];
		}
		int max = sum;
		for(int i=window;i<arr.length;i++) {
			sum = sum-arr[i-window]+arr[i];
			max = Math.max(sum,max);
		}
		System.out.println(max);
	}
}