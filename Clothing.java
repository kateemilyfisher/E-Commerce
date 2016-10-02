
/**
 * Abstract class Clothing - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Clothing extends Product
{
    // Shows the size of the item
    private int itemSize;

    /**
     * Constructor of objects in Clothing class.
     * Throws and unchecked exception when the size is 0 or less.
     */
    public Clothing(int price, String description, int rewards, int thisitemSize) throws IllegalArgumentException
    {
        super(price, description, rewards);
        if(((thisitemSize<0)) ){
            throw new IllegalArgumentException("Size must be greater than zero.");
        } 
        else{
            itemSize = thisitemSize;
        
        }
    }
    
    public int getItemsize(){
        return itemSize;
    }

    /**
     * Method to return item attributes
     */
    public String toString()
    {
        return
        super.toString() + " of the size: " + itemSize;
    }
}

