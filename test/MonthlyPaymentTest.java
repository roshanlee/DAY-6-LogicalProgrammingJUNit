package main.test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.utility.UtilityMonthlyPatment;

public class MonthlyPaymentTest {

	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		double output=UtilityMonthlyPatment.monthlyPayment(100, 2, 2);
		 assertEquals(4.254026336847923,output);
	}

}
