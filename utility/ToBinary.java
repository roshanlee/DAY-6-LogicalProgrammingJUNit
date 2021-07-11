package main.utility;

public class ToBinary {
	 public static String decToBinary(int n)
	    {
	        
	        int[] binaryNum = new int[32];
	        int i = 0;
	        while (n > 0) {
	            binaryNum[i] = n % 2;
	            n = n / 2;
	            i++;
	        }
	        String rev="";
	        for (int j = i - 1; j >= 0; j--)
	            rev +=String.valueOf(binaryNum[j]);
	     
	        return rev;
	    }
}
