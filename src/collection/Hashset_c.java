package collection;

import java.util.HashSet;

public class Hashset_c {
	
	public void pop() {
		
		HashSet h = new HashSet();
		h.add("pooja");
		h.add(50);
		h.add('D');
		h.add(45.5);
		h.add(50);
		h.add(null);
		h.add(null);
		
		System.out.println(h);
		System.out.println(h.size());
		System.out.println(h.contains(50));
		h.remove(null);
		System.out.println(h);
		System.out.println(h.isEmpty());
		h.clear();
		System.out.println(h);
	}
public static void main(String[] args) {
	Hashset_c u = new Hashset_c();
	u.pop();
}
}
