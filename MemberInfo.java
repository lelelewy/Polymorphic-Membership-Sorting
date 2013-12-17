/**
* Assignment: Project 2
* Due date: 10/6/13
* Instructor: Dr. DePasquale 
* Submitted by: Leah Lewy
*/

/**
* The MemberInfo class encapsulates the representation of all the information that any member of this gym
* will have on file. It contains a first name, middle initial, last name, gender, email address, national ID,
* phone number and birthday.
* @author Leah Lewy
*/
public class MemberInfo {
	/**This string object will represent the first name */
	protected String givenName;
	/**This string object will represent the middle initial */
	protected String middleInitial;
	/**This string object will represent the last name */
	protected String surname;
	/**This string object will represent the gender */
	protected String gender;
	/**This string object will represent the email address */
	protected String emailAddress;
	/**This string object will represent the national ID */
	protected String nationalID;
	/**This string object will represent the phone number */
	protected String telephoneNumber;
	/**This string object will represent the birthday */
	protected String birthday;

	/**
    * This is a constructor. It sets up the ability for a member info object to be instantiated.
    * @param first The string value of this object's first name
    * @param middle The string value of this object's middle initial
    * @param last The string value of this object's last name
    * @param sex The string value of this object's gender
    * @param email The string value of this object's email address
    * @param id The string value of this object's national ID
    * @param phone The string value of this object's phone number
    * @param bday The string value of this object's birthday
    */
	public MemberInfo (String first, String middle, String last, String sex, String email, String id, String phone, String bday) {
		givenName = first;
		middleInitial = middle;
		surname = last;
		gender = sex;
		emailAddress = email;
		nationalID = id;
		telephoneNumber = phone;
		birthday = bday;
	}

	/** 
    *This is an accessor method that allows an outside class to view the last name of a member object. This can
    * be done because a member info object is included in each member object.
    *@return the last name of the object
    */
	public String getLastName() {
		return surname;
	}

	/** 
    *Returns a string representation of the object
    *@return string representation
    */
	public String toString() {
		return gender + "\t" + givenName + "\t" + middleInitial + "\t" + surname + "\t" + emailAddress + "\t" + nationalID + "\t" + telephoneNumber + "\t" + birthday + "\t";
	}


}