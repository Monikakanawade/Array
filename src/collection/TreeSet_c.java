package collection;

import java.util.TreeSet;

public class TreeSet_c { 
	
	public void kill() {
		
		TreeSet y = new TreeSet();
		
		y.add("u");
		y.add("F");
		y.add("D");
		y.add("k");           //10,20 num not allowed
		y.add("Z");           //used only(" "); not(' ');
		y.add("A");
		System.out.println(y);
		
		System.out.println(y.pollFirst());
		System.out.println(y.pollLast());
		
	}
public static void main(String[] args) {
		TreeSet_c t = new TreeSet_c();
         t.kill();
	}

}
