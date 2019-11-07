
package bicycle;

/**
 *
 * @author Sara Yosephina
 */
public class MountainBike extends Bicycle{
    /*MountainBike subclass has one field*/
    public int setHeight;
    
    /*MountainBike subclass has one construktor*/
    public MountainBike(int startHeight, int startCadence, 
                        int startSpeed, int startGear){
        super(startCadence, startSpeed, startGear);
        setHeight = startHeight;   
    }
    
    /*MountainBike subclass has one method*/
    public void setHeight(int newValue){
        setHeight = newValue;
    }
    

    
}
