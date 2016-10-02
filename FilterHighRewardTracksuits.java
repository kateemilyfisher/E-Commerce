
/**
 * Write a description of class FilterHighRewardTracksuits here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FilterHighRewardTracksuits implements Filter
{

    /**
     * Constructor for objects of class FilterHighRewardTracksuits
     */
    public void FilterHighRewardTracksuits()
    {

    }

    public boolean accept(Product p)
    {
        boolean statement = false; 
        if(p instanceof Tracksuits){
            Tracksuits thisTracksuits = (Tracksuits) p;
            if(thisTracksuits.getRewards() >= 30){
                statement = true;
            }
        }
        return statement;
    }

}
