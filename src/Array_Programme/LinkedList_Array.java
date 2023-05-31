package Array_Programme;

import java.util.LinkedList;

public class LinkedList_Array {
 
	public void linkedl() {
		
		LinkedList a = new LinkedList();
		a.add("pooja");
		a.add("sona");
		a.add("aishu");                //add(""); - method
		a.add("chicku");
		a.add(null);                   //adding null values
		a.add(null);
		a.add(null);
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
	
	//a.clear();                       //clear method - clear all ArrayList data
	//System.out.println(a);
	
	a.add("K");
	System.out.println(a);
	
	a.add("K");                        //Duplicate addition same value/name
	System.out.println(a);
	
	
	}
public static void main(String[] args) {
	LinkedList_Array t = new LinkedList_Array();
	t.linkedl();
}
	}

