package in.blogspot.abjava.start;

import java.util.Scanner;

/**
 * @author dbs
 *
 */
public class ScannerForever {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String input = (String) scanner.next();
			System.out.println("input : "+input);
		}
		scanner.close();
	}
}
