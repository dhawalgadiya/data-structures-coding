package org.dhawal.dynamicProgramming;

import java.util.Scanner;

public class UniquePaths {
	
	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int x=0; x < t; x++ ) {
		    int m = in.nextInt();
	        int n = in.nextInt();
            System.out.println(numberofUniquePaths(m,n));
            //System.out.println("Factorial 10 "+factorial(10));
            System.out.println(numberofUniquePaths2(m,n));
		}
	}
	
	static long numberofUniquePaths(int m, int n) {
	    if(m ==1 || n == 1)
	        return 1;
	    if(m >= n)
	    	return ( (factorial(m + n - 2) / factorial(m - 1)) / factorial(n - 1));
	    else return ( (factorial(m + n - 2) / factorial(n - 1)) / factorial(m - 1));
	}
	
	static long factorial(int n) {
	    if(n == 0) {
	        return 1;
	    }
	    return (long) (n * factorial(n-1));
	}
	static long numberofUniquePaths2(int m, int n) {
	    if(m ==1 || n == 1)
	        return 1;
    	int num = m + n - 2;
    	int diff, deno;

    	if(m >= n) {
			diff = num - (m-1);
	    	deno = n-1;
	    }
	    else {
	    	diff = num - (n-1);
	    	deno = m-1;
	    }
    	long totalNum = 1;
    	while(diff != 0) {
    		totalNum = (long) totalNum * num;
    		num--;
    		diff--;
    	}
    	System.out.println("Total Numerator"+totalNum);
    	return (totalNum / factorial(deno));
  	}
}
