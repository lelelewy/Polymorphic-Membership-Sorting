/**
* Assignment: Project 2
* Due date: 10/6/13
* Instructor: Dr. DePasquale 
* Submitted by: Leah Lewy
*/

/**
* The Member class encapsulates the representation of a member object. It implements the
* comparable interface, which means it needs to include a compareTo method.
* It contains a member info object and an address object.
* @author Leah Lewy
*/
public class Member implements Comparable {
	/**This member info object will represent the member information for any member */
	protected MemberInfo memInfo; 
	/**This address object will represent the address information for any member */
	protected Address addr;

	/**
    * This is a constructor. It sets up the ability for a member member object to be instantiated.
    * @param info The MemberInfo object that contains all of the pertinent info for the gold member
    * @param address The Address object that contains all location data for the gold member
    */
	public Member (MemberInfo info, Address address) {
		memInfo = info;
		addr = address;
	}

	/** 
    *Returns a string representation of the object
    *@return string representation
    */
	public String toString () {
		return "" + memInfo + addr;
	}
	/**
	* This is the required comparedTo method. It sets up the ability for the member objects in the array
	* to be sorted. Based on the code, the objects will first be ordered in descending order based on zip code.
	* If those values are equal, then they are to be placed in ascending order based on state abbreviation (although
	* this is redundant because all zipcodes that are the same will also have the same state abbreviation). The next
	* value that is checked in the street address. These are to be placed in descendin
	* @param obj This is the object that will be casted into a Member object so it can be compared to another member
	* object.
	*/
    public int compareTo (Object obj) {
        int memZip = addr.getZipCode();
        int objZip = ((Member)obj).addr.getZipCode();
        String memState = addr.getState();
        String objState = ((Member)obj).addr.getState();
        String memStreet = addr.getStreetAddress();
        String objStreet = ((Member)obj).addr.getStreetAddress();
        String memName = memInfo.getLastName();
        String objName = ((Member)obj).memInfo.getLastName();
        if (memZip < objZip)
			return 1;
		else if (memZip > objZip)
			return -1;
		else {
			if (memState.compareTo(objState) < 0)
				return -1;
			else if (memState.compareTo(objState) >= 1)
				return 1;
			else {
				if (memStreet.compareTo(objStreet)<0)
					return 1;
				else if (memStreet.compareTo(objStreet)>=1)
					return -1;
				else {
					if (memName.compareTo(objName)<0)
						return -1;
					else if (memName.compareTo(objName)>=1)
						return 1;
					else {
						return 0;
					}
				}
			}
		}
    }
}

