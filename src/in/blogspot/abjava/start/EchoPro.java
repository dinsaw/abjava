package in.blogspot.abjava.start;

public class EchoPro {

	/**
	 * @param args stores Command Line Arguments
	 */
	public static void main(String[] args) {
		System.out.println("args.length : " + args.length);
		for (int i = 0; i < args.length; i++) {
			System.out.println("args["+i+"] : " + args[i]);
		}
	}

}
