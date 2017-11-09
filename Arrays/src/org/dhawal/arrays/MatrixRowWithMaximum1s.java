package org.dhawal.arrays;

public class MatrixRowWithMaximum1s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix[][] = {{0, 0, 0, 1, 1, 1, 1},
						  {0, 0, 0, 0, 1, 1, 1},
						  {0, 0, 1, 1, 1, 1, 1},
						  {0, 0, 0, 0, 0, 1, 1},
						  {0, 1, 1, 1, 1, 1, 1},
						  {0, 0, 0, 0, 0, 0, 1}};
		
		RowWithMaximum1(matrix, 6, 7);
	}
	
	public static void RowWithMaximum1(int matrix[][], int row, int col) {
		int j=col-1, max = -1;
		for(int i=0;i<row;i++) {
			while(j>=0 && matrix[i][j] == 1) {
				j--; max=i;
			}
		}
		
		System.out.println("Row with max 1 is "+(max+1));
		System.out.println("Number of 1s = "+(col-1-j));
		
	}
}
