package Array_Programme;

import java.util.ArrayList;

public class ArrayListA {
	
	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();    //1.ArrayList object create  2. Import
		
		a.add("pooja");
		a.add("sona");
		a.add("aishu");                //add(""); - method
		a.add("chicku");
	System.out.println(a);
	
	a.add("manu");               //last addition element
	System.out.println(a);
	
	a.add(0,"komal");             //add 0th means first position...indexing always start with 0
	System.out.println(a);        
	
	a.add(4,"nishu");             //4th index position
	System.out.println(a);        
	
	a.remove(5);                  //removed method - chicku
	System.out.println(a);   
	
	a.set(2, "sakshi");           //set method - to replace value
	System.out.println(a);  
	                   
	System.out.println(a.get(1));   //get method - Retrive this data
	
	System.out.println(a.size());   //size method - get size of this arraylist...size count start with 1
	
	System.out.println(a.contains("nishu"));   //contains method - true or false in form
	
	System.out.println(a.contains("shubhi"));
	
	System.out.println(a.isEmpty());       //arrays values available in true or false
	
	a.clear();                       //clear method - clear all ArrayList data
	System.out.println(a);
	
	
	
	}

}
