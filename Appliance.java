
/**
 * Abstract class Appliance - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Appliance extends Product
{
    // Product energy rating
    private int energyRating;

    /**
    Constructor of objects in Appliance class.
    Throws an unchecked exception when an invalid value is entered.
     */
    public Appliance(int price, String description, int rewards,int thisenergyRating) throws IllegalArgumentException
    {
        super(price, description, rewards);
        if(!((thisenergyRating>1 && thisenergyRating<5)) ){
            throw new IllegalArgumentException("Energy Rating must be between 1-5");
        }else{
            energyRating = thisenergyRating;
        }

    }
    
    public int getEnergyRating(){
        return energyRating;
    }

    /**
     * Method that returns attributes of an appliance
     */
    public String toString()
    {
        return
        super.toString() + " has the energy rating: " + energyRating;
    }
}

