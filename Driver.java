/**
* Assignment: Project 2
* Due date: 10/6/13
* Instructor: Dr. DePasquale 
* Submitted by: Leah Lewy
*/

import java.util.*;
import java.net.*;
import java.io.*;

/**
* The Driver class acts as a container for the main method. There is not a
* specific inherent purpose for the class.
* @author Leah Lewy
*/
public class Driver {
	/**
	* All functionality of the Driver application exists within 
	* main method. The method uses two Scanner objects, one to scan the 
	* contents of the file, and the other to scan the contents of each separate 
	* line of text. The first 14 tokens are stored in their associated variables. An if statement is then
	* used which essentially checks to see if there is more information to process. This is done by checking
	* to see if the value for ccType is an empty string. If it is, then there is no more data and therefore
	* the line is a member object. From there, a MemberInfo object and an Address object are created, and then
	* a Member object is created. Then the array position is incrememented by one. If there is more information
	* to process, the data is stored in their associated variables and the same process is followed as before,
	* except an additional credit card object is created. After the array is filled, it is sorted. 
	* A for loop is then used to iterate through the array and print each item to an output file. 
	* @param args Permits functionality of the command line	
	* @throws IOException This exception might be thrown if there are issues in locating the input file.
	*/
	public static void main (String[] args) throws IOException {

		String givenName;
		String middleInitial;
		String surname;
		String gender;
		String emailAddress;
		String nationalID;
		String telephoneNumber;
		String birthday;
		String streetAddress;
		String city;
		String state;
		int zipCode;
		String ccType;
		long ccNumber = 0;
		int cvv2;
		String ccExpires;
		String trackingCode;
		final int lineCount = 40000;

		URL myURL = new URL ("https://s3.amazonaws.com/depasquale/datasets/personalData.txt");
		Scanner fileScan, lineScan;
		fileScan = new Scanner(myURL.openStream());

		FileWriter fw = new FileWriter("sortedData.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter outFile = new PrintWriter(bw);

		Member[] memberList = new Member[lineCount];

		int position = 0;

		fileScan.nextLine();

		while (position < lineCount) {
			String line = fileScan.nextLine();
			lineScan = new Scanner (line);
			lineScan.useDelimiter("\t");

			lineScan.nextInt();
			gender = lineScan.next();
			givenName = lineScan.next();
			middleInitial = lineScan.next();
			surname = lineScan.next();
			streetAddress = lineScan.next();
			city = lineScan.next();
			state = lineScan.next();
			zipCode = lineScan.nextInt();
			emailAddress = lineScan.next();
			telephoneNumber = lineScan.next();
			nationalID = lineScan.next();
			birthday = lineScan.next();
			ccType = lineScan.next();

		if (!ccType.equals("")) {
			ccNumber = lineScan.nextLong();
			cvv2 = lineScan.nextInt();
			ccExpires = lineScan.next();
			trackingCode = lineScan.next();

			MemberInfo mi1 = new MemberInfo (givenName, middleInitial, surname, gender, emailAddress, nationalID, telephoneNumber, birthday);
			Address a1 = new Address (streetAddress, city, state, zipCode);
			CreditCard c1 = new CreditCard (ccType, ccNumber, cvv2, ccExpires);
			GoldMember gm1 = new GoldMember (mi1, a1, c1, trackingCode);

			memberList[position] = gm1;
		}

		else {
			MemberInfo mi1 = new MemberInfo (givenName, middleInitial, surname, gender, emailAddress, nationalID, telephoneNumber, birthday);
			Address a1 = new Address (streetAddress, city, state, zipCode);	
			Member m1 = new Member (mi1, a1);

			memberList[position] = m1;
		}
			position++;
		}

		Arrays.sort(memberList);

		for (Member item: memberList) {
			outFile.print(item + "\n");
		}

		outFile.close();
	}
}