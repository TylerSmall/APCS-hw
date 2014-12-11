import java.util.*;
import java.io.*;

public class Searching {
    // Main
    public static void main(String[] args) {
	Searching s = new Searching(10);
	System.out.println(s.toString);


    }

    // Variables
    Random r = new Random();


    // Constructors
    public Searching() {
	this(100);
    }

    public Searching(int n) {
	int[] a = new int[n];
	for(int i = 0; i < n; i++) {
	    a[i] = r.nextInt(n);
	}
    }


    // Methods
    public String toString() {
	String s = "";
	for(int i = 0; i < a.length; i++) {
	    s += a[i];
	}
	return s;
    }

}
