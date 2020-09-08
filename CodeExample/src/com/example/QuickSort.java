package com.example;

public class QuickSort {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] nums = new int[] {1,4,6,6,7,100,5,6};
		QuickSort quickSort=new QuickSort();

		int output[]=quickSort.quickSort(nums,1,nums.length);
		
		for (int i=0;i<output.length;i++) {
			System.out.println(output[i]);
		}
	

	}
	
	public int [] quickSort(int[] nums,int start, int end) {
		
		//create temporary array
		int [] tempArray = new int [end-start+1];
		int leftIndex=0;
		int rightIndex=end-start+1;

		// pick pivot. Assuming first 
		int pivot = nums[start];
		
		for (int i=start+1;i<=end;i++) {
			if(nums[i]<pivot) {
				tempArray[leftIndex]=nums[i];
				leftIndex++;
			}
			else {
				tempArray[rightIndex]=nums[i];
				rightIndex++;
			}
		}
		tempArray[leftIndex]=pivot;
		
		//copy tempArray to orignal array
		
		tempArray=nums;
		
		//call quick sort recursively
		
		quickSort(nums,start,start+leftIndex-1);
		quickSort(nums,start+leftIndex+1,end);
		
		return nums;
	}
	
}
