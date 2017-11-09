package org.dhawal.dynamicProgramming;

import java.util.Scanner;
import org.dhawal.utilities.Utilities;

public class MinimumJumps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
	    for(int x=0; x < t; x++ ) {
		    int n = in.nextInt();
		    int arr[] = new int[n];
		    for(int i=0; i<n; i++ ) {
	            arr[i] = in.nextInt();
		    }
		    System.out.println(minimumNumberOfJumps(n, arr));
		    
	    }
	}
	// Compute min jumps required to reach at each index from start
	// Final result will be the minimum jumps required at last index from start
	static int minimumNumberOfJumps(int n, int arr[]) {
		if(arr[0] == 0) 
			return -1;
		int index = n;
		int min_jump_to_reach_at[] = new int[n];
		int index_from_which_min_jump_happened[] = new int[n];
		
		for(int i=1; i<n; i++) {
			boolean first = true;
			boolean pathFoundFromAtleastOneIndex = false;
			for(int j=0; j<i; j++) {
				int jump_value_j = arr[j];
				// is i reachable from j
				if(i <= j+jump_value_j && min_jump_to_reach_at[j] != -1) {
					// Need to check whether this jump is the minimum jump
					if(first) {
						min_jump_to_reach_at[i] = min_jump_to_reach_at[j] + 1;
						index_from_which_min_jump_happened[i] = j;
						first = false;
					}
					else {
						if(min_jump_to_reach_at[j] + 1 < min_jump_to_reach_at[i] ) {
							min_jump_to_reach_at[i] = min_jump_to_reach_at[j] + 1;
							index_from_which_min_jump_happened[i] = j;
						}
					}
					pathFoundFromAtleastOneIndex = true;
				}
				if(!pathFoundFromAtleastOneIndex) {
					min_jump_to_reach_at[i] = -1;
					index_from_which_min_jump_happened[i] = -1;
				}
			}
		}
		Utilities.printArray(arr);
		Utilities.printArray(min_jump_to_reach_at);
		Utilities.printArray(index_from_which_min_jump_happened);
		return min_jump_to_reach_at[n-1];
	}
}
