public class Driver {
	public static void main(String[] args) {
		StringStuff s = new StringStuff();
	    System.out.println(s.nonStart("Hello", "There") + " Expecting: ellohere" ); 
	    System.out.println(s.nonStart("java", "code") + " Expecting: avaode");
	    System.out.println(s.nonStart("shotl", "java") + " Expecting: hotlava");  
	    System.out.println(s.makeAbba("Hi", "Bye") + " Expecting: HiByeByeHi"); 
	    System.out.println(s.makeAbba("Yo", "Alice") + " Expecting: YoAliceAliceYo"); 
	    System.out.println(s.makeAbba("What", "Up") + " Expecting: WhatUpUpWhat");
	    System.out.println(s.diff21(19) + " Expecting: 2"); 
	    System.out.println(s.diff21(10) + " Expecting: 11"); 
	    System.out.println(s.diff21(21) + " Expecting: 0"); 
	}
	
}