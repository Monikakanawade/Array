package collection;

import java.util.LinkedHashSet;

public class LinkedHashSet_c {
	
	public void poo() {
	LinkedHashSet m = new LinkedHashSet();
	
	m.add("Pooja");
	m.add(150);
	m.add('k');
	m.add(90.8);
	m.add(null);
	m.add(null);
	m.add(170);
	
	System.out.println(m);
	}
public static void main(String[] args){
		LinkedHashSet_c  b = new LinkedHashSet_c ();
		b.poo();
	}
	
}