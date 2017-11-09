package org.dhawal.dynamicProgramming;


// https://www.youtube.com/watch?v=8LusJS5-AGo
// http://www.geeksforgeeks.org/dynamic-programming-set-10-0-1-knapsack-problem/
public class KnapSack {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val[] = new int[]{6, 10, 12};
        int wt[] = new int[]{1, 2, 3};
        int  W = 5;
        int n = val.length;
        System.out.println("Recursive Solution:"+recursiveSolution(n, W, val, wt));
        System.out.println("DynamicSolution - Matrix:");
        System.out.println("Dynamic Solution Result: "+dynamicSolution(n, W, val, wt));	
	}
	
	public static int recursiveSolution(int n, int W, int val[], int weights[]) {
		if(n == 0 || W == 0) {
			return 0;
		}
		
		if(weights[n-1] > W) {
			return recursiveSolution(n-1, W, val, weights);
		}
		else {
			return Math.max(recursiveSolution(n-1, W, val, weights),
					val[n-1] + recursiveSolution(n-1, W-weights[n-1], val, weights));
		}
	}
	
	static int dynamicSolution(int n, int W, int val[], int weights[]) {
		int K[][] = new int[n+1][W+1];
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=W; j++) {
				if(i==0 || j==0) {
					K[i][j] = 0;
				}
				// If Weight of item is greater than the current capacity, we can' take the item 
				// get the max profit from previous item.  
				else if(weights[i-1] > j) {
					K[i][j] = K[i-1][j];
				}
				else {
					K[i][j] = Math.max(K[i-1][j], (val[i-1] + K[i-1][j-weights[i-1]]) );
					//System.out.println("K["+i+"]["+j+"] = "+K[i][j]+" weights["+(i-1)+"] = "+weights[i-1]);
				}
			}
		}
		printArray(K, W+1, n+1);
		return K[n][W];
	}
	
	static void printArray(int [][]X, int weight, int value) {
		System.out.print("  ");
		for(int i=1; i <weight; i++ ) {
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i=1; i <value; i++ ) {
			System.out.print(i+" ");
			for(int j=1; j <weight; j++ ) {
				System.out.print(X[i][j]+" ");
			}
			System.out.println();
		}
	}

}
