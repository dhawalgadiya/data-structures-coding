package org.dhawal.dynamicProgramming;

import java.util.Scanner;
import org.dhawal.utilities.*;

public class SumOfAllSubstrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int x=0; x < t; x++ ) {
			int n = in.nextInt();
		    String str = in.next();
	        char arr[] = str.toCharArray();
            System.out.println("Sum: "+sumOfAllSubstrings(arr,n));
            //System.out.println("Factorial 10 "+factorial(10));
		}
	}

	public static int sumOfAllSubstrings(char[] arr, int n) {
		// TODO Auto-generated method stub
		Utilities.printArray(arr);
		int mat[][] = new int[n][n];
		int sum = 0;
		for(int i=0;i<n; i++) {
			mat[i][i] = arr[i] - '0';
			System.out.print(mat[i][i]+" ");
			sum += mat[i][i];
		}

		for(int i=0;i<n; i++) {
			for(int j=1;j<n; j++) {
				if(i<j) {
					mat[i][j] = mat[i][j-1] * 10 + mat[j][j];
					System.out.print(mat[i][j]+" ");
					sum += mat[i][j];
				}
			}	
		}
		return sum;
	}

}
