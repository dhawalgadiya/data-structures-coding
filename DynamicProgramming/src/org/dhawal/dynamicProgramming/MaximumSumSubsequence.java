package org.dhawal.dynamicProgramming;
import java.util.Scanner;

class MaximumSumSubsequence {
	public static void main (String[] args) {
		//code
		Scanner in = new Scanner(System.in);
	    int t = in.nextInt();
		for(int j=0; j < t; j++ ){
			int n = in.nextInt();
			int arr[] = new int[n];
			for(int i=0; i <n; i++ ){
				arr[i] = in.nextInt();
			}
			System.out.println(maxSum(n,arr));
		}
	}
	public static int maxSum(int n, int arr[]) {
	    int dp[] = new int[n];
	    
	    if(n == 0) {
	        return 0;
	    }
	    int currentSum = arr[0];
	    int maxSum = currentSum;
	    dp[0] = currentSum;
		for(int i=1; i <n; i++ ) {
		    
		    if(dp[i-1] < 0) {
		        dp[i] = arr[i];
		    }
		    else dp[i] = arr[i] + dp[i-1];
		    if(dp[i] > maxSum) {
		        maxSum = dp[i];
		    }
		}
		return maxSum;
	}
}
