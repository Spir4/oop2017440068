package hw2;

public class TwentyThree {

	public static void main(String[] args) {
		// ***** *
		// *** ***
		// * *****
		int i, j;
		
		for(i=1; i<=3; i++) {
			for(j=0; j<7-i*2; j++ )
				System.out.print("*");
			System.out.print(" ");
			j++;
			for( ; j<7; j++)
				System.out.print("*");
			System.out.println();
				
		}

	}

}
