/* subclass of Basechar */
public class Warrior extends Basechar {
    private int healthboost=5;
    private int health=12345;
    
    public int getHealth() {
	return health + super.getHealth();
    }

    /*
    public void somethingwithhealth() {
	int i = getHealth();
    }
    */
}
