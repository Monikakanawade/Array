package Array_Programme;

public class MultiDimensional_Array2 {

	public static void main(String[] args) {

		int a[][] = {{1,2,3},{7,8,9}};      //2 - rows, 3- columns(2*3)...{},{},{}:3-rows & 3-column(3*3)

		for(int i=0; i<a.length; i++) {          //row: for(int i=0; i<2; i++)

			for(int j=0; j<=a.length; j++){      //column: for(int j=0; j<=2; i++)...(2*2): j<=a.length-1/j<a.length
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

}
