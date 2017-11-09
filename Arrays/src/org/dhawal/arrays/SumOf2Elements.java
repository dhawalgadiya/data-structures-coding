package org.dhawal.arrays;

import java.util.HashMap;
import java.util.Map;

import org.dhawal.utilities.Utilities;

public class SumOf2Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,2,5,9,12,16,7,5,5};
		Utilities.printArray(arr);
		sortArray(arr, 10);
	}
	// Using hashMaps
	private static void sortArray(int[] arr, int X) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> map = new HashMap();
		int n = arr.length;
		for(int i=0; i<n; i++) {
			int temp = X- arr[i];
			if(map.containsKey(temp)) {
				System.out.println("Indexes "+map.get(temp)+" and "+i+" forms the sum "+X);
				return;
			}
			else {
				map.put(arr[i], i);
			}
		}
		
	}

}
