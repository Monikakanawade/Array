package Array_Programme;

public class LengthOfArray_use {
	public static void main(String[] args) {
		
		int a[] = new int[4];      //Declaration & construction of array
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		
	//	System.out.println(a[2]);
		
		for(int i=0; i<a.length; i++) {        //a.length - property of an array
			System.out.println(a[i]);
		}
	
	/*	for(int i=0; i<=3; i++) {
			System.out.println(a[i]);
	*/	}
		
	}


