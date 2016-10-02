
/**
 * Write a description of class FilterCheapPlasmaTvs here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FilterCheapPlasmaTvs implements Filter
{

    /**
     * Constructor for objects of class FilterCheapPlasmaTvs
     */
    public void FilterJumpersSize()
    {

    }

    public boolean accept(Product p)
    {
        boolean statement = false; 
        if(p instanceof Tv){
            if(p.getPrice() <= 100){
                Tv thisTv = (Tv) p;
                if(thisTv.getType().toLowerCase().equals("plasma")){
                    statement = true;
                }
            }
        }
        return statement;
    }

}
