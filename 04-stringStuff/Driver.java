public class Driver {
	public static void main(String[] args) {
		System.out.println(mixStart("mix snacks") + " Expecting: true");
		System.out.println(mixStart("pix snacks") + " Expecting: true");
		System.out.println(mixStart("piz snacks") + " Expecting: false");
		System.out.println(makeOutWord("<<>>", "Yay") + " Expecting: <<Yay>>");
		System.out.println(makeOutWord("<<>>", "WooHoo") + " Expecting: <<WooHoo>>");
		System.out.println(makeOutWord("[[]]", "word") + " Expecting: [[word]]");
		System.out.println(firstHalf("WooHoo") + " Expecting: Woo");
		System.out.println(firstHalf("HelloThere") + " Expecting: Hello");
		System.out.println(firstHalf("abcdef") + " Expecting: abc");
	}
	
	public static boolean mixStart(String s) {
		return s.substring(1, 3).equals("ix");
	}
	
	public static String makeOutWord(String out, String word) {
		return out.substring(0, 2) + word + out.substring(2);
	}
	
	public static String firstHalf(String str) {
		int len = str.length();
		return str.substring(0, (len / 2));
	}
}