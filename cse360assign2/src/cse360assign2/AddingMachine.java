package cse360assign2;

public class AddingMachine {

	private int total;
	private String op = "0 ";
	
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () {
		return total;
	}
	
	public void add (int value) {
		total += value; //Adds the value entered to the total.
		op = System.out.print(" + " + value);
	}
	
	public void subtract (int value) {
		total -= value; //Subtracts the value entered from the total 
		op = System.out.print(" - " + value);
	}

	public String toString () {
		return op;
	}

	public void clear() {
		total = 0; //Sets the total to zero.
	}
}
