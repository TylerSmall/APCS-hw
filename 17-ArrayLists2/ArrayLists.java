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

	for (int i = 0; i < 10; i++) {
	    int CurrentIndex = r.nextInt(a.size());
	    b.add(a.get(CurrentIndex));
	    a.remove(a.get(CurrentIndex));
	}

	System.out.println(b);
    }

}
