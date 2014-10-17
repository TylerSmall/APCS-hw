import java.util.*;
import java.io.*;

public class BaseChar {
    private int Health = 100;
    private int Mana = 10;
    private int Attack = 20;
    private int Dexterity = 20;
    public void toCreate(){
        String n = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        n += sc.nextLine();
	String c = "";
	Scanner sc2 = new Scanner (System.in);
	while !(line.equals("warrior") || line.equals("mage")){
		System.out.println("Are you a Warrior or a Mage?");
	String line = sc2.nxtLine().toLowerCase;
	c += sc.nextLine();
	System.out.println("You are " + n + " the " + c);
    }
}
