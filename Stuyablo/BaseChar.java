import java.util.*;
import java.io.*;

public class BaseChar {
    private int Health = 100;
    private int Mana = 10;
    private int Attack = 20;
    private int Dexterity = 20;
    public void toName(){
	Scanner sc = new Scanner(System.in);
	String name = sc.nextString();
