/**
 * 
 */
package org.dhawal.codechef;

import java.util.Scanner;

/**
 * @author dhawalgadiya
 *
 */
// https://www.codechef.com/JUNE17/submit/GOODSET

class GoodSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int j=0; j<t; j++ ) {
			int n = in.nextInt();
			for(int i=500; i >500-n; i-- )
				System.out.print(i+" ");			
			System.out.println();
		}
		
	}

}
