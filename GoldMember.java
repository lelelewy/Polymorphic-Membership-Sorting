/**
* Assignment: Project 2
* Due date: 10/6/13
* Instructor: Dr. DePasquale 
* Submitted by: Leah Lewy
*/

/**
* The GoldMember class encapsulates the representation of a gold member object. Each gold member object inherits  
* all of the data that is included in the member class. It also contains a credit card object and a tracking code.
* @author Leah Lewy
*/
public class GoldMember extends Member {
	
	/**This credit card object will represent the credit card information for a gold member */
	protected CreditCard card;
	/**This string object will represent the UPS tracking code */
	protected String trackingCode;

	/**
    * This is a constructor. It sets up the ability for a gold member object to be instantiated.
    * It uses the super reference to piggyback off of the constructor set up in the member class.
    * @param info The MemberInfo object that contains all of the pertinent info for the gold member
    * @param address The Address object that contains all location data for the gold member 
    * @param credit The CreditCard object that contains all credit card information for the gold member
    * @param tracking The string value of this gold member's UPS tracking code
    */
	public GoldMember (MemberInfo info, Address address, CreditCard credit, String tracking) {
		super(info, address);
		card = credit;
		trackingCode = tracking;
	}

	/** 
    *Returns a string representation of the object that calls the member class's to string and adds to it
    *@return string representation
    */
	public String toString () {
		return super.toString() + card + trackingCode;
	}
}