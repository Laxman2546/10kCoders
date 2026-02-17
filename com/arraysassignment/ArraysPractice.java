package com.arraysassignment;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractice {
	public static int sumArr(int[] nums) {
		int sum = 0;	
		for(int num : nums) {
			sum+=num;
		}
		return sum;
	}
	public static void countEvenOdd(int[] nums) {
		int evenCount = 0;
		int oddCount = 0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i] % 2 == 0) {
				evenCount++;
			}else {				
				oddCount++;
			}
		}
		System.out.println("EvenCount: " + evenCount);
		System.out.println("OddCount: " + oddCount);
	}
	public static void reverseArry(int[] nums) {
		int[] reversed = new int[nums.length];
		
		for(int i=nums.length-1;i>=0;i--) {
			reversed[nums.length-1 - i] = nums[i];
		}
		System.out.println("Reversed Array"+" "+Arrays.toString(reversed));
		for(int i=nums.length-1;i>=0;i--) {
			reversed[i] = nums[i];
		}
		System.out.println("Copied Array"+" "+Arrays.toString(reversed));
	}
	public static void searchElement(int ele,int[] nums) {
		for(int i=0;i<nums.length;i++) {
			if(nums[i] == ele) {				
				System.out.println("Number found at"+" "+ i +"th position");
				return;
			}
		}
		System.out.println("Number not found");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[5];
		for(int i=0;i<nums.length;i++) {
			System.out.print("Enter"+" " + (i+1)+ " " +"number : ");
			nums[i] = sc.nextInt();
		}
		System.out.println("sum of array: "  +" "+ sumArr(nums));
		countEvenOdd(nums);
		reverseArry(nums);
		searchElement(12,nums);
		sc.close();
	}

}
