package com.Arraysproblem;

public class Problems {

	public static void findMaxandMin() {
		int arr[] = {2,4,3,1,5,6,7,3};
		int minEle = Integer.MAX_VALUE;
		int maxEle = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > maxEle) {
				maxEle = arr[i];
			} 
			else if(arr[i] < minEle) {
				minEle = arr[i];
			}
		}
		System.out.println("Maximum Element:"+(maxEle));
		System.out.println("Minimum Element:"+(minEle));
		System.out.println("---------------------------");
	}
	public static void frequency() {
		int arr[] =  {1,1,1,2,2,2,2,2,3,4,4,5,5,6};
		int count = 0;
		int num = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(num == arr[i]){
				count++;
			}else if(num != arr[i]) {
				System.out.println(num +" "+"occurs" +" "+ count +" "+ (count > 1 ?"times" : "time"));
				count = 1;
				num = arr[i];
			}
		}
		System.out.println(num +" "+"occurs" +" "+ count +" "+ (count > 1 ?"times" : "time"));
		System.out.println("---------------------------");
	}
	public static void secondLargest() {
		int arr[] = {1,2,3,4,5,9,12,15};
		int first = arr[0];
		int second = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > first) {
				first = first ^ second;
				second =first ^ second;
				first = arr[i];
			} 
			
		}
		System.out.println("Second Largest Element:"+(second));
	}
	public static void main(String[] args) {
		findMaxandMin();
		frequency();
		secondLargest();
	}

}
