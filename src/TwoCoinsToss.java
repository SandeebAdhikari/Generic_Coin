/**
  *The TwoCoinsToss class tosses the two coins 50 times
   and save the head up count using counter
  */
public class TwoCoinsToss  {
	public static void main(String[] args) {
		//creates GenericCoin object 
	   GenericCoin coin1= new GenericCoin();
	   GenericCoin coin2= new GenericCoin();
	   //variables
	   int totalFlip=50;
	   int totalHeadsUp1=0;
	   int totalHeadsUp2=0;
	   int totalHeadsUp=0;
	   //  tosses the one coin 50 times
	   //  and counts the heads up count using for loop counter 
	   for (int i=1; i<=totalFlip; i++) {
		   coin1.toss();
		   // if the coin1 head side is up then totalHeadsUp 
		   // value will increases by 1
		   if(coin1.getSideUp().equals("heads")) 
			   totalHeadsUp1++;
	   }
	   
	   // displays the total heads up count of coin1 on 50 flips
	   System.out.println("Coin 1 got "+totalHeadsUp1+" heads up.");
	   //  tosses the one coin 50 times
	   //  and counts the heads up count using for loop counter 
	   for (int j=1; j<=totalFlip; j++ ) {
		   coin2.toss();
		   // if the coin2 head side is up then totalHeadsUp 
		   // value will increases by 1
		   if(coin2.getSideUp().equals("heads")) 
			   totalHeadsUp2++;
	   }
	   
	   // displays the total heads up count of coin2 on 50 flips
	   System.out.println("Coin 2 got "+totalHeadsUp2+" heads up.");
	   
	   
	   // Compares and displays the most flipped heads
	   // up count between coin1 and coin2.
	   if (totalHeadsUp1 > totalHeadsUp2) {
		   System.out.println("Coin 1 landed heads up most often.");
	   }
	   else {
		   System.out.println("Coin 2 landed headup most often.");
	   }
	   
	   // Adds the total heads up count of coin1 and coin2
	   totalHeadsUp= totalHeadsUp1 + totalHeadsUp2; 
	   //displayes the added heads up count of coin1 and coin2
	   System.out.println("Total heads up = "+ totalHeadsUp);
}
}

/**OUTPUT
	Coin 1 got 23 heads up.
	Coin 2 got 24 heads up.
	Coin 2 landed headup most often.
	Total heads up = 47
*/


