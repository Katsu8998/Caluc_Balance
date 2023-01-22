package main;

public class Invoice {
	String name;
	int totalAmount;

	public static int purchase(double tax, int amount) {
		double totalAmount = amount * tax;
		return (int) Math.round(totalAmount);
	}

}