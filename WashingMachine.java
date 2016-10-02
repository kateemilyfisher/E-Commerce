
/**
 * Write a description of class WashingMachine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WashingMachine extends Appliance
{
    // States the model of the WashingMachine
    private int spinSpeed;

    /**
     * Constructor for objects of class WashingMachine
     */
    public WashingMachine(int price, String description, int rewards, int energyRating, int thisspinSpeed) throws IllegalArgumentException
    {
        super(price, description, rewards, energyRating);
        if(!(thisspinSpeed < 1400 && thisspinSpeed > 0)) {
            throw new IllegalArgumentException("Spin speed cannot be greater than 1400rpm");

        }else {
            spinSpeed = thisspinSpeed;
        }

    }
    
    public int getSpinSpeed(){
        return spinSpeed;
    }
    
    /**
     * Return the attributes of the WashingMachine
     */
    public String toString()
    {
        return
        super.toString() + " has the spin speed: " + spinSpeed;
    }
}
