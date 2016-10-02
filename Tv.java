
/**
 * Write a description of class Tv here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tv extends Appliance
{
    private String type;

    /**
     * Constructor for objects of class Tv
     */
    public Tv(int price, String description, int rewards, int energyRating, String thistype) throws IllegalArgumentException
    {
        super(price, description, rewards, energyRating);
        if(thistype == null) {
            throw new IllegalArgumentException("type of tv cannot be null");

        }else {
            type = thistype;
        }

    }
    
    public String getType(){
        return type;
    }
    
    /**
     * Return the attributes of the Tv
     */
    public String toString()
    {
        return
        super.toString() + " has the type: " + type;
    }
}
