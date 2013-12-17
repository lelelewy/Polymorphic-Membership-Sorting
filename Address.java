/**
* Assignment: Project 2
* Due date: 10/6/13
* Instructor: Dr. DePasquale 
* Submitted by: Leah Lewy
*/

import java.text.*;

/**
* The Address class encapsulates the representation of an address object. Each credit card object
* contains a street address, a city, a state and a zip code. 
* @author Leah Lewy
*/
public class Address {
	/**This string object will represent the street address */
	protected String streetAddress;
	/**This string object will represent the city */
	protected String city;
	/**This string object will represent the state */
	protected String state;
	/**This integer object will represent the zip code */
	protected int zipCode;

	/**
    * This is a constructor. It sets up the ability for an address object to be instantiated.
    * @param street The string value of this object's street address
    * @param cit The string value of this object's city
    * @param stat The string value of this object's state
    * @param zip The numerical value of this object's zip code
    */
	public Address (String street, String cit, String stat, int zip) {
		streetAddress = street;
		city = cit;
		state = stat;
		zipCode = zip;
	}

	/** 
    *This is an accessor method that allows an outside class to view the zip code of an address object. 
    *@return the zip code of the object
    */
	public int getZipCode() {
		return zipCode;
	}

	/** 
    *This is an accessor method that allows an outside class to view the street address of an address object. 
    *@return the street of the object
    */
	public String getStreetAddress() {
		return streetAddress;
	}

	/** 
    *This is an accessor method that allows an outside class to view the state of an address object. 
    *@return the state of the object
    */
	public String getState() {
		return state;
	}
	/** 
    *Returns a string representation of the object
    *@return string representation
    */
	public String toString() {
		NumberFormat fmt = new DecimalFormat("00000");
		return streetAddress + "\t" + city + "\t" + state + "\t" + fmt.format(zipCode) + "\t";
	}
}