package test;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import main.Invoice;

public class Invoice_test {
	@Test
	public void purchaseTest() {
		int expected = 1320;
		int result = Invoice.purchase(1.1, 1200);
		assertEquals(result, expected);
	}
}
