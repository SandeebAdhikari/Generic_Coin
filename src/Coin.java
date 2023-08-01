/*Sandeeb Adhikari
  02/04/2022 
  Purpose: to make different method for inputs, outputs and bonus points
*/

public class Coin extends GenericCoin{
	    //variables
		double value;
		String type;
		
/**
 * The default constructor for objects 
   of class Coin. Value is 0 and the type 
   is the largest possible integer.
 */
		
    public Coin() {
		value=0;
		type=" ";
    }

/**
 * The alternate constructor for objects of class Coin.
 * The coin value and name are given as a parameter.
 * @param v The coin value(0.05, 0.10, 0.25)
 * @param t The coin name(nickel, dime ,quarter)
 */
    
	public Coin(double v, String t) {
		value =v;
		type=t;
		
	}

/** 
  * Gets the value of the coin
  * @return value the coin value 
  */
	public double getValue() {
		return value;
	}
	
/**
  * Gets the type of the coin 
  * @return type the coin type
  */
	public String getType() {
		return type;
	}
	
	public boolean equals(Object c) {
		boolean result = false;
		if(c instanceof Coin)
		{
			Coin coin= (Coin) c;
			result= value == coin.getValue();
			
		}
		return result;
	}
	
	public String toString()
	{
		return type + ":" +value;
	}
	
}

