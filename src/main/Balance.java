package main;

public class Balance {
	String name;
	int balance;
	int cancel;

	public static int paymentCancel(int cancel, int currentBalance) {
		if (cancel != 0) {
			return currentBalance + cancel;
		} else {
			//なにもしない
			return currentBalance;
		}

	}

	public static int calcu(int currentBalance, int totalAmount) {
		return currentBalance - totalAmount;

	}
}