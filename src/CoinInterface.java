/** An interface for method that toss
    the coin and return 'heads' or 'tails'
    sides up.
 */

public interface CoinInterface {
	/**
	 *  Tosses the coin.
	 *  Assign string value 'heads' or 'tail' 
	    to sideUp.*/
	public void toss();
	
	/** Gets the one side up.
	 * @return The side up.	 */
	
	public String getSideUp();
	
}
