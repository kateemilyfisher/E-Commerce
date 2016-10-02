
/**
 * Write a description of class Jumpers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jumpers extends Clothing
{
    // Colour of the jumper
    private String colour;

    /**
     * Constructor for objects of class Jumpers
     */
    public Jumpers(int price, String description, int rewards, int itemSize, String thiscolour)
    {
        super(price, description, rewards, itemSize);
        if(thiscolour.isEmpty()) {
            throw new IllegalArgumentException("Colour cannot be empty");

        }else{
            colour = thiscolour;
        }

    }
    
    public String getColour(){
        return colour;
    }

    /**
     * Return the attributes of the Jumper
     */
    public String toString()
    {
        return
        super.toString() + " has the colour: " + colour;
    }
}