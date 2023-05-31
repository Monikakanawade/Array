package Array_Programme;

public class MultiDimensional_Array {
	
	public static void main(String[] args) {
		
		int a[] [] = new int[2][2];     //Declaration & Construction of array
		
		a[0] [0] = 10;
		a[0] [1] = 11;
		a[1] [0] = 20;
		a[1] [1] = 21;
		
		//  System.out.print(a[1] [0]);
		
		for(int i=0; i<a.length; i++) {    //i - row
			
		  for(int j=0; j<a.length; j++) {   //j - column
			  
			 System.out.print(a[i] [j] + " "); 
		  }	
		  System.out.println();
		  
		}
	}
}
