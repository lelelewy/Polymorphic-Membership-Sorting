/**
* Assignment: Project 2
* Due date: 10/6/13
* Instructor: Dr. DePasquale 
* Submitted by: Leah Lewy
*/

import java.text.*;

/**
* The CreditCard class encapsulates the representation of a credit card object. Each credit card object
* contains a credit card type, a credit card number, a card verification value and an expiration date. 
* @author Leah Lewy
*/
public class CreditCard {
	/**This string object will represent the credit card type */
	protected String ccType;
	/**This string object will represent the credit card number */
	protected long ccNumber;
	/**This integer will represent the card verification value */
	protected int cvv2;
	/**This string object will represent the expiration date */
	protected String ccExpires;
	
	/**
    * This is a constructor. It sets up the ability for a credit card object to be instantiated.
    * @param type The string value of this object's credit card type
    * @param number The string value of this object's credit card number
    * @param verValue The numerical value of this object's verification value
    * @param expire The string value of this object's expiration date
    */
	public CreditCard (String type, long number, int verValue, String expire) {
		ccType = type;
		ccNumber = number;
		cvv2 = verValue;
		ccExpires = expire;
	}
	/** 
    *Returns a string representation of the object
    *@return string representation
    */
	public String toString () { 
		NumberFormat fmt = new DecimalFormat("000");
		NumberFormat fmt1 = new DecimalFormat("0000000000000000");
		return ccType + "\t" + fmt1.format(ccNumber) + "\t" + fmt.format(cvv2) + ccExpires + "\t";
	}
}