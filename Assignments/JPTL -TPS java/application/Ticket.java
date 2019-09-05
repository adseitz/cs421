/*
------------------------------------------------------------
-            File Name: Ticket.java                	    	-
-            Written By: Adam D. Seitz          		 	-
-            Written On: 9/4/2019                         	-
------------------------------------------------------------
- File Purpose:                                            	-
-                                                          	-
- This file contains the Ticket class                      	-
------------------------------------------------------------
- Program Purpose:                                         	-
-                                                          	-
- This program takes customer information as				-
- input from an employee and will                          	-
- print a receipt when the form is completely filled out.	-
------------------------------------------------------------
- Local Variable Dictionary (alphabetically):             	-
-                                                          	-
- adultPrice - Price of adult tickets                   	-
- adultQty - Quantity of adult tickets               		-
- childPrice - Price of child tickets      				-
- childQty - Quantity of child tickets               		-
- name - Name of ticket category		                  -
------------------------------------------------------------
*/

package application;

public class Ticket {

	//Class variables
	public String name;
	
	public int adultQty;
	public int childQty;
	public double adultPrice;
	public double childPrice;
	
	//Constructor with all variables inputed
	public Ticket(String name, int adultQty, int childQty, double adultPrice, double childPrice) {
		this.name = name;
		this.adultQty = adultQty;
		this.childQty = childQty;
		this.adultPrice = adultPrice;
		this.childPrice = childPrice;		
	}
	
	//Constructor with 'essentials'
	public Ticket(String name, double adultPrice, double childPrice) {
		this.name = name;
		this.adultQty = 0;
		this.childQty = 0;
		this.adultPrice = adultPrice;
		this.childPrice = childPrice;		
	}
	
	//Empty constructor
	public Ticket() {
		this.name = "temp";
		this.adultQty = 0;
		this.childQty = 0;
		this.adultPrice = 0;
		this.childPrice = 0;		
	}
	
	//Calculate the ticket(s) price based on price per ticket and bundle
	public double calcPrice() {
		return (this.adultQty*this.adultPrice) + (this.childQty*this.childPrice);
	}
	
	//String output of Ticket object values
	public String toString() {
		String output = "Ticket Type: " + this.name + "\n";
		output += ("Adult Price: " + this.adultPrice + "\t Adult Quantity: " + this.adultQty + "\n");
		output += ("Child Price: " + this.childPrice + "\t Child Quantity: " + this.childQty + "\n");
		output += ("Ticket(s) Price = $" + this.calcPrice());
		
		return output;
	}
}
