package in.blogspot.javacodebit.concept;

import java.awt.Point;

/**
 * @author dbs
 * This is a demo for pass by value in java
 */
public class PassByValueDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x = 10;		// test int variable
		System.out.println("In main before change x = " + x);
		change(x);
		System.out.println("In main after change x = " + x);
		
		Point point = new Point(10, 10);	// object of point class
		System.out.println("In main before change point = "+ point.toString());
		change(point);	// here we are passing copy of reference to change method
		Point point2 = point;
		point2.setLocation(1, 1);
		System.out.println("In main after change point = "+ point.toString());
		
		//test for array. remember array is also object
		int arrayOfInt[] = {1,2,3,4};		//array of int
		System.out.println("In main before change arrayOfInt[0] = "+ arrayOfInt[0]);
		change(arrayOfInt);
		System.out.println("In main after change arrayOfInt[0] = "+ arrayOfInt[0]);		
	}

	private static void change(int[] arrayOfInt) {
		arrayOfInt[0] = 5;
		System.out.println("In change arrayOfInt[0] = "+ arrayOfInt[0]);
	}

	private static void change(Point point) {
		point.setLocation(5, 5);
		System.out.println("In change point = "+ point.toString());
	}

	private static void change(int x) {
		x = 5;
		System.out.println("In change x = " + x);
	}
}
