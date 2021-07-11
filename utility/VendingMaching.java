package main.utility;

import java.util.ArrayList;

public class VendingMaching {
	static int count=0;
	static ArrayList<Integer> al = new ArrayList<>();
	static int arr[]={1,2,5,10,50,100,500,1000};
	public static int  vendingMachine(int num){
		
		while(num!=0){
			
		int notes=binarySearch(arr,num);
		
		al.add(notes);
		count+=num/notes;
		num=num%notes;
		}
		 for (int i = 0; i < al.size(); i++)
	            System.out.print(al.get(i) + " ");
	    
		return count;
	}
	   static int binarySearch(int arr[], int x)
	    {
	        int l = 0, r = arr.length - 1;
	        while (l <= r) {
	            int m = l + (r - l) / 2;
	            
	            if (arr[m] == x)
	                return arr[m]; 
	            if (arr[m] < x)
	                l = m + 1;
	            else
	                r = m - 1;
	        }
	        return arr[r];
	    }
}
