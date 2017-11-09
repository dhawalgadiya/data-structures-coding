package org.dhawal.dynamicProgramming;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		int arr[] = {86,177,115,193,135,186,92,49,21,162,27,90,59,163,126,140,26,172,136,11,168,167,29,182,130,62,123,67,135,129,2,22,58,69,167,193,56,11,42,29,173,21,119,184,137,198,124,115,170,13,126,91,180,156,73,62,170,196,81,105,125,84,127,136,105,46,129,113,57,124,95,182,145,14,167,34,164,43,150,87,8,76,178
};
		//int arr[] = {86,177,115,193,87,8,76,178};
//		int arr[] = {179,177,1,2,3,4};
		int n = arr.length;
		int L[] = new int[n];long a,b,c;
		System.out.println("T1 ="+(a=System.nanoTime()));
//		longestSubsequenceWithoutDP(arr,n);
		System.out.println("Max subsequence = "+max);
		System.out.println("T2 ="+(b=System.nanoTime()));
//		longestSubsequence(arr, L, n, 0);
//		int max = 0;
//		for(int i=0; i<n; i++) {
//			if(L[i] > max) {
//				max = L[i];
//			}
//		}
		System.out.println("Max subsequence with DP= "+longestSubsequenceWithDP(arr,n));
		System.out.println("T3 ="+(c=System.nanoTime()));
		System.out.println("Without DP in ns = "+(b-a));
		System.out.println("With DP in ns = "+(c-b));
	}
	static int max = 0;
	// Returns longest subsequence ending at n
	/**
	 * 
	 * @param arr
	 * @param n
	 * @param n
	 * @return
	 */
	static int longestSubsequenceWithoutDP(int arr[], int n) {
		int max_sequence_here = 1;
		if(n == 1) {
			return 1;
		}
		for(int i=1; i<n; i++) {
			int max_seuence_i = longestSubsequenceWithoutDP(arr, i);
			if(arr[n-1] > arr[i-1] && (1 + max_seuence_i) > max_sequence_here) {
				max_sequence_here = 1 + max_seuence_i;
			}
		}
		// Updating the overall maximum of the list
		if(max_sequence_here > max) {
			max = max_sequence_here;
		}
		return max_sequence_here;
	}
	
	static int longestSubsequence(int arr[], int L[], int n, int index) {
		int max = 1;
		if(index == n-1) {
			L[index] = max;
			return 1;
		}
		for(int i=index+1; i<n; i++) {
			if(arr[i] > arr[index]) {
				int max_seuence_i = 1;
				if(L[i] == 0 ) {
					max_seuence_i = 1 + longestSubsequence(arr, L, n, i);
				}

				if(max_seuence_i > max) {
					max = max_seuence_i;
				}
			}
			else {
				if(L[i] == 0) {
					longestSubsequence(arr, L, n, i);
				}
			}
		}
		L[index] = max;
		return max;
	}	
	
	static int longestSubsequenceWithDP(int arr[], int n) {
		int max = 1;
		if(n == 0 ) {
		    return 0;
		}
		int L[] = new int[n];
		for(int i=0; i<n; i++) {
			L[i] = 1;
		}
		for(int i=1; i<n; i++) {
			for(int j=0; j<i; j++) {
				if(arr[i] > arr[j] && L[i] < L[j] +1) {
					L[i] = L[j] +1;
				}
			}
		}
		for(int i=1; i<n; i++) {
			if(L[i] > max) {
				max = L[i];
			}
		}
		
		return max;
	}
}
