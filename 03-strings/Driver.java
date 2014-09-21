public class Driver {
    public static void main(String[] args){
	
	String s = "tyler small";
	int a = s.indexOf(" ");
	
	String first = s.substring(0, a);
	String last = s.substring(a + 1);
	
	System.out.println(first);
	System.out.println(last);
	
	}
}