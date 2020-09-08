package com.example;

public class SelectionSort {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = new int[] {1,4,6,6,7,100,5,6};
		SelectionSort sorting=new SelectionSort();
		int output[]=sorting.selectionSort(nums);
	
		//int output[]=sorting.bubleSort(nums);
		
		for (int i=0;i<output.length;i++) {
			System.out.println(output[i]);
		}
		
	}
	
    public int[] sortArray(int[] nums) {    
        //return selectionSort(nums);       
        return bubleSort(nums);
    }
    public void swap(int nums[],int i,int j){       
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;        
    }
    public int [] bubleSort(int[] nums){
        //loop each item
            for (int i=0; i<nums.length; i++){
                for(int j=nums.length-1;j>i;j--){                   
                    if(nums[j-1] > nums[j]){
                        swap(nums,j,j-1);
                    }
                    
                }
                            
        }
        return nums;
    }
    
    public int [] selectionSort(int [] nums){      
        //looping each item
        for (int i=0; i<nums.length; i++){
            int min=i;
            //finding minium
            for (int j=i+1; j<nums.length;j++){
                if (nums[min] > nums[j]){
                    min=j;
                }                
            }
            //swap
            swap(nums,i,min);            
        }     
      return nums;          
    } 
}