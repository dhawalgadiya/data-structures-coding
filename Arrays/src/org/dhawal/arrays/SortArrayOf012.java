package org.dhawal.arrays;
import org.dhawal.utilities.*;

// http://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s/0
public class SortArrayOf012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[] = {2,1,0,2,1,0,1,1,0,2};
		int arr[] = {0,1,0};//,2,1,0,1,1,0,2};
		Utilities.printArray(arr);
		sortArray(arr);
		Utilities.printArray(arr);
	}

	static void sortArray(int arr[]) {
		int n = arr.length;
		int low=0,mid=0,high = n-1;
		
		while(mid<=high) {
			int temp = arr[mid];
			if(temp == 0) {
				arr[mid] = arr[low]; 
				arr[low] = temp;
				low++;
				mid++;
			}
			else if(temp == 1) {
				mid++;
			}
			else {
				arr[mid] = arr[high]; 
				arr[high] = temp;
				high--;
			}
			Utilities.printArray(arr);
			System.out.println("Low="+low+" Mid="+mid+" High="+high);
		}
	}
}
