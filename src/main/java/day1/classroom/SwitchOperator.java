package day1.classroom;

public class SwitchOperator {

	/*
	 * Goal: Perform calculation based on the user input operations
	 * 
	 * inputs: 2,3 and "add"
	 * output: added value: 5
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a Switch case: type 'switch', followed by: ctrl + space + down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1)
	 * 2)
	 * 3) 
	 * 
	 */	
	
	public static void main(String[] args) {
		
		// Declare 2 integer numbers
		int a=4,b=5,c=3;
		int add=0, sub=0, mul=0;
		

		// Declare a String variable with input as operations (Tip:
		

		// Initiate switch case for operations
		switch (c) {
		case 0:
			add=a+b;
			System.out.println("Additon of 2 nums:" +add);
			break;
		case 1:
			sub=a-b;
			System.out.println("subtraction of 2 nums: " +sub);
			break;
		case 2:
			mul=a*b;
			System.out.println("Multiply of 2 nums:" +mul);
			break;
		default:
			System.out.println("No operation performed");
			break;
		}
		
		
			// Within switch, include as case for add operation
			// Within switch, include as case for sub operation
		
		
			// Within switch, include as case for mul operation
		
		
			// Within switch, include as case for div operation
		
		
			// Within switch, include 'default' to handle other operations
		
		
		//end of switch case
		
	}

}
