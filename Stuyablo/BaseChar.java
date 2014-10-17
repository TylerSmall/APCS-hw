import java.util.*;
import java.io.*;

public class BaseChar {
    private int Health = 100;
    private int Mana = 10;
    private int Attack = 20;
    private int Dexterity = 20;
    public void toName(){
	Scanner sc = new Scanner(System.in);
	System.out.println("What is your name?");
	String name = sc.nextLine();
	System.out.println("Your name is " + name);
    }
}
