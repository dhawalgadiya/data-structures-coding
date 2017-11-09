package org.dhawal.dynamicProgramming;

import java.util.Scanner;

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
	    int t = in.nextInt();
		for(int j=0; j < t; j++ ){
			int x = in.nextInt();
			int y = in.nextInt();
			String m = in.next();
			String n = in.next();
			char A[] = m.toCharArray();
			char B[] = n.toCharArray();

			System.out.println(m);
			System.out.println(n);
			
			// Logic
			System.out.println("LCS = "+ recursiveSolution(A, B, A.length, B.length));
			System.out.println("LCS Dynamic Solution= "+dynamicSolution(A,B,A.length,B.length));
		} 
	}

	static int recursiveSolution(char A[], char B[], int x, int y) {
		
		if(x == 0 || y==0) {
			return 0;
		}
		if(A[x-1] == B[y-1]) {
			return 1 + recursiveSolution(A,B,x-1,y-1);
		}
		else {
			return Math.max(recursiveSolution(A,B,x-1,y), recursiveSolution(A,B,x,y-1));
		}
	}
	
	static int dynamicSolution(char A[], char B[], int x, int y) {
		int dp[][] = new int[x+1][y+1];
		
		if(x == 0 || y==0) {
			return 0;
		}
		
		for(int i=1; i <=x; i++ ) {
			for(int j=1; j <=y; j++ ){
				if(A[i-1] == B[j-1]) {
					dp[i][j] = 1 + dp[i-1][j-1];
				}
				else dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
			}
		}
		return dp[x][y];
	}
}
