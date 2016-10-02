import java.util.*;
/**
 * Write a description of class Inventory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Inventory
{
    public List<Product> allProducts = new ArrayList<Product>();
    
    /**
     * Constructor for objects of class Inventory
     */
    public Inventory()
    {
        
    }

    /**
     * A method that allows any type of product to be added to the inventory
     */
    public void addProduct(Product product)
    {
        allProducts.add((Product) product);
    } 

    /**
     * A Method that lists the full contents of the inventory
     */
    public void inventoryList()
    {
        for (int i = 0; i < allProducts.size(); i++) {
            System.out.println("details of the product is: " + allProducts.get(i).toString());
        }
    }

    /**
     * A Method that allows a search with criteria.
     */
    public Product search(Filter filter)
    {
        Product returnProduct;
        returnProduct = null;
        for(int i = 0; i < allProducts.size(); i++) {
            if(filter.accept((Product) allProducts.get(i)) == true){
                returnProduct = (Product) allProducts.get(i);
            }
        }
        return returnProduct;
    }
}