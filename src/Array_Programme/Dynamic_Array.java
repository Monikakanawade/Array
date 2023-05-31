package Array_Programme;

import java.util.Scanner;

public class Dynamic_Array {
	
	public static void main(String[] args) {
		
		int size, i;
		
	Scanner r = new Scanner(System.in);         //take input from user
	System.out.print("Enter Size Of an Array");
	size = r.nextInt();
	
	int k[] = new int[size];     //declare & constructing an array
	
	for(i=0; i<size; i++) {
		k[i] = r.nextInt();
	}
	System.out.println("Printed Array Element");
	for(i=0; i<size;i++) {
		System.out.println(k[i] + "  ");
	}
	}

}
