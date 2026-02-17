package com.problems;

public class Automorphic {
	public static boolean checkAutomorphic(int n) {
		 int square = n*n;
		 int lastDigit = square % 10;
		 if(n == lastDigit) {
			 return true;
		 }
		 return false;
	}
	 public static void main(String[] args) {
		 int n = 7;
		boolean result = checkAutomorphic(n);
		System.out.println(result);
		int[] numsarr = new int[4];
	 }
}
