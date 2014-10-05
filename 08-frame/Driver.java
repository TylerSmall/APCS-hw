public class Driver {
	public static void main(String[] args) {
		Problems p = new Problems();
		System.out.println(p.frame(5, 4));
		System.out.println(p.frame(3, 3));
		System.out.println(p.frame(2, 2));
		System.out.println(p.stringSplosion("Code"));
		System.out.println(p.stringSplosion("abc"));
		System.out.println(p.stringX("xxHxix"));
		System.out.println(p.stringX("abxxxcd"));
	}
}