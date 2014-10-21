import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args){

    
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String n = sc.nextLine();	       

	Scanner sc2 = new Scanner(System.in);
	String c = "";
	while (!(c.toLowerCase().equals("warrior") || c.toLowerCase().equals("mage"))){
	    System.out.println("Are you a Warrior or a Mage?");
	    c = sc2.nextLine();
	    }
	

	System.out.println("Greetings, "+ n + " the " + c.substring(0,1).toUpperCase() + c.substring(1).toLowerCase());

	String w = "";
	c = c.toLowerCase();
        if (c.equals("warrior")){
	    w = "sword";
	} else {
	    w = "staff";
	}
		

	try{
	    Thread.sleep(1000);
	} catch (Exception e) {}
	System.out.println("You wake up");
	try{
	    Thread.sleep(1000);
	} catch (Exception e) {}
	System.out.println("The darkness is overwhelming, but you grab a nearby branch and bring yourself to your feet");
	try{
	    Thread.sleep(3000);
	} catch (Exception e) {}
	System.out.println("You try to recall your name, but it won't come");
	try{
	    Thread.sleep(3000);
	} catch (Exception e) {}
	System.out.println("Deep gutteral growls come from all sides");
	try{
	    Thread.sleep(3000);
	} catch (Exception e) {}
	System.out.println("You find a " + w + " laying beside you");
	try{
	    Thread.sleep(3000);
	} catch (Exception e) {}
	System.out.println("Survival is the only option...");

	if (c.equals("warrior")){
	    Warrior p = new Warrior();
	}
	    /*	} else {
	    Mage p = new Mage();
	}
	    */
    }
}
