package org.dhawal.trees;
import org.dhawal.utilities.*;
public class MinHeap {
	static int heap_size; 
	public static void main(String args[]) {
		int arr[] = {6,3,4,1,8,9,10,7,2,0};
		heap_size = arr.length;
		createMinHeap(arr);
		int number_of_elements = heap_size;
//		for(int i=0; i<number_of_elements; i++) {
//			System.out.println("Min element: "+deleteFromMinHeap(arr));
//		}
		arr[heap_size] = 5;
		heap_size++;
		//heapify
	}
	
	static void createMinHeap(int arr[]) {
		int n = heap_size;
		for(int i=n/2; i>=0; i--) {
			heapify(arr, i);
			Utilities.printArray(arr);
		}
	}
	// Find the smallest of the ith element and its children
	// and then exchanging the smallest one with i
	static void heapify(int arr[], int i) {
		int n = heap_size;
		int l = 2*i+1;
		int r = 2*i+2;
		int smallest = i;
		if(l<n && arr[l] < arr[i]) {
			smallest = l;
		}
		if(r<n && arr[r] < arr[smallest]) {
			smallest = r;
		}
		if(smallest != i) {
			int temp = arr[i];
			arr[i] = arr[smallest];
			arr[smallest] = temp;
			// heapifying the children as well
			heapify(arr, smallest);
		}
	}
	
	static int deleteFromMinHeap(int arr[] ) {
		if(heap_size == 0) {
			return -1;
		}
		int x = arr[0];
		arr[0] = arr[heap_size - 1];
		heap_size--;
		
		heapify(arr, 0);
		
		return x;
	}
}
