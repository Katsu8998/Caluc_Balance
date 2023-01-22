package test;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import main.Balance;

public class balance_test {
	@Test
	public void paymentCancelTest1() {
		int expected = 1000;
		int result = Balance.paymentCancel(100, 900);
		assertEquals(result, expected);
	}

	@Test
	public void paymentCancelTest2() {
		int expected = 900;
		int result = Balance.paymentCancel(0, 900);
		assertEquals(result, expected);
	}
	@Test
	public void paymentCancelTest3() {
		int expected = 900;
		int result = Balance.calcu(1000, 100);
		assertEquals(result, expected);
	}


}
