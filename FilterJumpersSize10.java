
/**
 * Write a description of class FilterJumpersSize here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FilterJumpersSize10 implements Filter
{

    /**
     * Constructor for objects of class FilterJumpersSize
     */
    public void FilterJumpersSize()
    {

    }

    public boolean accept(Product p)
    {
        boolean statement = false; 
        if(p instanceof Jumpers){
            Jumpers thisJumpers = (Jumpers) p;
            if(thisJumpers.getItemsize() == 10){
                statement = true;
            }
        }
        return statement;
    }

}
