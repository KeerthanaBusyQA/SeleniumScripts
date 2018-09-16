package mypackage;

public class MyArrays {
	public static void main(String args[]) {
		
		//Type of array declarations
		int[] arr;   
		int []array;  
		int arrayy[];
		int[] s =new int[10];
		
		//Finding number of days in a month
		 int month_days[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };     
		 System.out.println("April has " + month_days[3] + " days."); 
		 
		 //CA Find average of a double array
		 
		 //Enhanced for loop in Java
		 int primes[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
		 
		    for (int t: primes) {
		      System.out.println(t); 
		    }

		 
		//Type of array declarations
			int[][] arr1;   
			int [][]array1;  
			int arrayy1[][];
			int[][] s1 =new int[2][2];
			
			 int twoD[][]= new int[4][5];     
			 int i, j, k = 10; 
			 
			    for(i=0; i<4; i++)       
			    	for(j=0; j<i; j++) {         
			    		twoD[i][j] = k;         
			    		k++;       
			    		} 
			 
			    for(i=0; i<4; i++) {       
			    	for(j=0; j<i; j++)         
			    		System.out.print(twoD[i][j] + " ");       
			    	System.out.println();     
			    	}
	 
	}
	
}
