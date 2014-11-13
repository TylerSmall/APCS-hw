import java.util.*;

public class ArrayLists {
    public static void main(String[] args) {
	ArrayList<Integer> a = new ArrayList<Integer>();
	Random r = new Random();

	for (int i = 0; i < 10; i++) {
	    a.add(i);
	}

	System.out.println(a);

	ArrayList<Integer> b = new ArrayList<Integer>();

	for (int i = 0; i < a.size(); i++) {
	    int currentInt = r.nextInt(a.size() - 1);
	    if  (b.indexOf(currentInt) == -1) {
		b.add(a.get(currentInt));
	    } 
		
	}

	System.out.println(b);
    }

}
