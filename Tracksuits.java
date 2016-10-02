
/**
 * Write a description of class Tracksuits here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tracksuits extends Clothing
{
    private String brand;

    /**
     * Constructor for objects of class Tracksuits
     */
    public Tracksuits(int price, String description, int rewards, int itemSize, String thisbrand)
    {
        super(price, description, rewards, itemSize);
        if(thisbrand.isEmpty()) {
            throw new IllegalArgumentException("Brand cannot be empty");

        }else{
            brand = thisbrand;
        }

    }
    
    public String getBrand(){
        return brand;
    }

    /**
     * Return the attributes of the Tracksuits
     */
    public String toString()
    {
        return
        super.toString() + " has the brand: " + brand;
    }
}