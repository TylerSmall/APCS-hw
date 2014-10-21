public class Warrior extends BaseChar {
private int healthboost = 5;


public int getHealth() {
return healthboost + super.getHealth();
}
public int getMana() {
return healthboost + super.getMana();
}
public int getAttack() {
return healthboost + super.getAttack();
}
public int getDexterity() {
return healthboost + super.getDexterity();
}
public void attack(BaseChar other){
System.out.println(this+" is SUPERattacking "+other);
}
}
