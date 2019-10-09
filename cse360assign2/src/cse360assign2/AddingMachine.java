package cse360assign2;

public class AddingMachine {

	private int total;
	private String op = "0"; //Sets the string op to just "0"
	
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () {
		return total; //Returns the current value stored in Total.
	}
	
	public void add (int value) {
		total += value; //Adds the value entered to the total.
		op += " + " + value; //Adds a plus sign and the value entered to the string op
	}
	
	public void subtract (int value) {
		total -= value; //Subtracts the value entered from the total 
		op += " - " + value; //Adds a subtraction sign and the value entered to the string op
	}

	public String toString () {
		return op; //Returns the string op
	}

	public void clear() {
		total = 0; //Sets the total to zero.
	}
}
