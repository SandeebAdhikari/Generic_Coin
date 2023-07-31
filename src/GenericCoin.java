import java.util.Random;

/**
 * The GenericCoin class generates a random sides of 
   the coin 'heads' or 'tail' and returns the result 
   which sides up
 
 * @author Sandeeb Adhikari 
 * @version 1.0
 */

public class GenericCoin {
    //data needed to be protected
	private String sideUp;
	
/** 
  * The default constructor for objects of class GenericCoin
  */
	
	public GenericCoin() {
		toss();
	}
	
/**
 *  Tosses the coin.
 *  Assign string value 'heads' or 'tail' 
	to sideUp
 */
	
	public void toss() {
		Random generator = new Random();
		int value= generator.nextInt(2);
		if (value==1) {
			sideUp="tail";
		}else {
			sideUp= "heads";
		}
		
	}
	
/** 
  * Gets the one side up.
  * @return The side up.	 
  */
	
	public String getSideUp() {
		return sideUp;
	}

}
