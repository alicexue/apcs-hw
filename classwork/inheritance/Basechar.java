/* superclass of Warrior and Mage*/
public class Basechar {
    private int health=20;
    // private int manna=0;
    private String name;

    public void attack(Basechar other){
	//System.out.println(this.getName() + " is attacking " + other.getName());
	System.out.println(this+" is attacking "+other);
    }
    
    public int getHealth() {
	return health;
    }
    
    public void setHealth(int i) {
	health = i;
    }
}
