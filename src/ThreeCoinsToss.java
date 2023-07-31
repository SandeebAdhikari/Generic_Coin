/**
  * The class ThreeCoinsToss tosses the three coin
  * nickel, dime and quarter until the total heads up count of 
  * each coin becomes dollar.
 *
 */
public class ThreeCoinsToss {
	public static void main(String[] args) {
    //variable
	double totalValue=0;
	
	//creates Coin object
	Coin nickel = new Coin(0.05, "Nickel");
	Coin dime = new Coin(0.10, "Dime");
	Coin quarter = new Coin(0.25, "Quarter");
	 
	/** 
	 * If either of the coin is heads up the value of coin
	 *  is added and displays coin name until the total value
	 *  becomes dollar.
	 */
	
    
	do {
		//coins tossed before calling them 
		nickel.toss();
		dime.toss();
		quarter.toss();
		
		// if the nickel  head side is up then totalValue 
		// is added with 0.05
		if(nickel.getSideUp().equals("heads")) {
			totalValue +=  nickel.getValue();
			// displays the coin name if it is heads up
		    System.out.printf(nickel.getType()+ " HEADS UP!! The new total with added 0.05 value is %.2f \n", totalValue );
		}
		
		// if the dime head side is up then totalValue 
	    // is added with 0.10
		else if(dime.getSideUp().equals("heads")) {
			 totalValue +=  dime.getValue();
			// displays the coin name if it is heads up
			System.out.printf(dime.getType() + " HEADS UP!! The new total with added 0.10 value is %.2f \n", totalValue);
		}
	    
		// if the quarter head side is up then totalValue 
		// is added with 0.25 
		else if(quarter.getSideUp().equals("heads")) {
			totalValue += quarter.getValue();
			// displays the coin name if it is heads up 
		    System.out.printf(quarter.getType() + " HEADS UP!! The new total with added 0.25 value is %.2f \n",totalValue);
	    }
	     
	} while(totalValue<=1); //do while loop until the total value is dollar
	
	// displays the total value 
	System.out.printf("The total value is: %.2f ",totalValue);
	}
}

/** OUTPUT
	Dime HEADS UP!! The new total with added 0.10 value is 0.10 
	Dime HEADS UP!! The new total with added 0.10 value is 0.20 
	Nickel HEADS UP!! The new total with added 0.05 value is 0.25 
	Nickel HEADS UP!! The new total with added 0.05 value is 0.30 
	Dime HEADS UP!! The new total with added 0.10 value is 0.40 
	Nickel HEADS UP!! The new total with added 0.05 value is 0.45 
	Quarter HEADS UP!! The new total with added 0.25 value is 0.70 
	Nickel HEADS UP!! The new total with added 0.05 value is 0.75 
	Dime HEADS UP!! The new total with added 0.10 value is 0.85 
	Nickel HEADS UP!! The new total with added 0.05 value is 0.90 
	Dime HEADS UP!! The new total with added 0.10 value is 1.00 
	Quarter HEADS UP!! The new total with added 0.25 value is 1.25 
	The total value is: 1.25 
*/