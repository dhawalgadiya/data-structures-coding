package org.dhawal.codechef;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SNSOCIAL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		int max = 0;
		List<int[]> maxList = new ArrayList<int[]>(); 
		int a[][] = new int[m][n];
		for(int i=0 ; i< m; i++) {
			for(int j=0 ; j< n; j++) {
				a[i][j] = in.nextInt();
				if(a[i][j] > max) {
					max = a[i][j];
					maxList.removeAll(maxList);
					int a1[] = new int[2];
					a1[0] = i; a1[1] = j;
					maxList.add(a1);
				} else if(a[i][j] == max){
					int a1[] = new int[2];
					a1[0] = i; a1[1] = j;
					maxList.add(a1);
				}
			}
		}
		if(maxList.size() == m*n) {
			System.out.println("0");
		}
		else {
			int j[] = {0,0,m-1,m-1};
			int k[] = {0,n-1,0,n-1};
			int maxTime = -1;
		for(int x=0;x<m;x++) {
			for(int y=0;y<n;y++) {
				int minDist = m*n;
				for(int[] z : maxList) {
					int d = distance(z[0],z[1],x,y);
					if(d < minDist) {
						minDist = d;
					}
				}
				if(minDist > maxTime) {
					maxTime = minDist;
				}
			}
		}System.out.println(maxTime);
		}
	}

	public static int distance(int a, int b, int c, int d) {
		return Math.max(Math.abs(a-c),Math.abs(b-d));
	}
}
