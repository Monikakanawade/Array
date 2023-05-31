package Array_Programme;

public class Array_1 {

public static void main(String [] args) {
		
	int a[];                   // 1 st way of Declaration of array
	 a = new int[4];    // construction of array(object)
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;       // Initialization
		a[3] = 40;
		
		for(int i=0; i<=3; i++) {
			System.out.println(a[i]);
		}
		
		
	}
}
