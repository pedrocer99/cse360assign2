package cse360assign2;

public class AddingMachine {

	private int total;
	private String op = "0"; //Sets the string op to just "0"
	static AddingMachine myCalculator = new AddingMachine(); //Creates an object myCalculator that can be used for testing
	
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


	public static void main(String args[]) {
		myCalculator.add(3);
		myCalculator.add(7);
		myCalculator.subtract(6);
		System.out.println(myCalculator.toString());
		System.out.println(myCalculator.getTotal());
		myCalculator.clear();
		System.out.println(myCalculator.getTotal());
		// This main method is for testing the program
	}

}
