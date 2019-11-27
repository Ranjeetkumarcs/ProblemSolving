package com.logical;

public class StairProblem {
	public static void main(String[] args) {
		int n=4;
		System.out.println("total no of ways =" + sum(n));
		
	}

	private static int sum(int n) {
		if(n==0 || n==1){
			return 1;
		}else{
			return sum(n-2)+sum(n-1);
		}
	}

}
