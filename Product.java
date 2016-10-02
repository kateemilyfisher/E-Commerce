
/**
 * Abstract class Product - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Product
{
    // Price of product
    private int price;
    // Description of product
    private String description;
    // Product reward points
    private int rewards;

    /**
     * Constructor of objects of class Products 
     * 
     */
    public Product(int thisprice, String thisdescription, int thisrewards) throws IllegalArgumentException
    {
        if(thisprice <=0) {
            throw new IllegalArgumentException("Price is less than 0");
        }

        else if(thisdescription == null) {
            throw new IllegalArgumentException("Description must not be empty");
        }

        else if(thisrewards <=0) {
            throw new IllegalArgumentException("Rewards must be greater than or equal to zero");
        }
        
        else{
            price = thisprice;
            description = thisdescription;
            rewards = thisrewards;
        
        }

    }
    
    public int getPrice(){
        return price;
    }
    
    public String getDescription(){
        return description;
    }
    
    public int getRewards(){
        return rewards;
    }

    /**
     * Return the description, price and rewards of a product.
     */
    public String toString()
    {
        return (description + "of the price: " + price + " rewards: " + rewards);
    }
}

