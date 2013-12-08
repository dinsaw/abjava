/**
 * 
 */
package in.blogspot.abjava;

import java.text.DecimalFormat;

/**
 * @author dbs
 *
 */
public class NumbersInJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Max = "+Long.MAX_VALUE+" Min = "+Long.MIN_VALUE);
		System.out.println("Max = "+Integer.MAX_VALUE+" Min = "+Integer.MIN_VALUE);
		System.out.println("Max = "+Short.MAX_VALUE+" Min = "+Short.MIN_VALUE);
		System.out.println("Max = "+Byte.MAX_VALUE+" Min = "+Byte.MIN_VALUE);
		System.out.println("Max = "+Float.MAX_VALUE+" Min = "+Float.MIN_VALUE);
		System.out.println("Max = "+Double.MAX_VALUE+" Min = "+Double.MIN_VALUE);
		
		
		customFormat("###,###.###", 123456.789);
	    customFormat("###.##", 123456.789);
	    customFormat("000000.000", 123.78);
	    customFormat("$###,###.###", 12345.67);
	}
	static public void customFormat(String pattern, double value ) {
	      DecimalFormat myFormatter = new DecimalFormat(pattern);
	      String output = myFormatter.format(value);
	      System.out.println(value + "  " + pattern + "  " + output);
	}

}
