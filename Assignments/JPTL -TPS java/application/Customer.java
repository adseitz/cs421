/*
------------------------------------------------------------
-            File Name: Customer.java                	   	-
-            Written By: Adam D. Seitz          		 	-
-            Written On: 9/4/2019                         	-
------------------------------------------------------------
- File Purpose:                                            	-
-                                                          	-
- This file contains the Customer class               		-
------------------------------------------------------------
- Program Purpose:                                         	-
-                                                          	-
- This program takes customer information as				-
- input from an employee and will                          	-
- print a receipt when the form is completely filled out.	-
------------------------------------------------------------
- Local Variable Dictionary (alphabetically):             	-
-                                                          	-
- cardNum - Card number for purchasing                   	-
- city - City of the customer                   			-
- expDate - Expiration date of purchasing card        		-
- firstName - First name of the customer         			-
- lastName - Last name of the customer         			-
- middleInitial - Middle initial of the customer    	 	-
- phone - Phone number of the customer                   	-
- state - State of the customer                   		-
- streetAdd - Street address of the customer             	-
- zip - Zip code of the customer                  		-
------------------------------------------------------------
*/

package application;

public class Customer {

	//Customer info variables
	public String firstName;
	public String middleInitial;
	public String lastName;
	public String streetAdd;
	public String city;
	public String state;
	public int zip;
	public String phone;
	public int cardNum;
	public String expDate;
	
	//Constructor with all variables entered
	public Customer(String firstName, String middleInitial, String lastName, String streetAdd, String city, String state, int zip, String phone, int cardNum, String expDate){
		this.firstName = firstName;
		this.middleInitial = middleInitial;
		this.lastName = lastName;
		this.streetAdd = streetAdd;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phone = phone;
		this.cardNum = cardNum;
		this.expDate = expDate;
	}
	
	//Empty Constructor
	public Customer() {
			this.firstName = "temp";
			this.middleInitial = "temp";
			this.lastName = "temp";
			this.streetAdd = "temp";
			this.city = "temp";
			this.state = "temp";
			this.zip = 0;
			this.phone = "temp";
			this.cardNum = 0;
			this.expDate = "temp";
		}			
	
	//String output of Customer object values
	public String toString() {
		String output = "Name: " + this.firstName + " " + this.middleInitial + ". " + this.lastName  + "\n";
		output += ("Address: " + this.streetAdd + ", " + this.city + ", " + this.state + ", " + this.zip + "\n");
		output += ("Phone: " + this.phone) + "\n";
		output += ("Card Info: " + this.cardNum + " Experation Date: (" + this.expDate + ")");
		
		return output;
	}
}