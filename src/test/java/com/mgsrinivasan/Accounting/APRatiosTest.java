package com.mgsrinivasan.Accounting;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class APRatiosTest {

    APRatios apratio;

    @Before
    public void setup() {
    	apratio = new APRatios();
    }
    
    @Test
    public void testPayablesTurnover() {
    	float totalSupplierPurchases = 1000000.00;
    	float begAccountsPayable = 50000.00;
    	float endAccountsPayable)= 250000.00;
    	float expectedValue = 6.6666666667;
    	
        assertEquals("Error in payablesTurnover()", expectedValue, payablesTurnover(totalSupplierPurchases, begAccountsPayable, endAccountsPayable));
    }

    @Test
    public void testPctgQualifyingDiscountsTaken() {
    	
    	float discountsTaken = 15000.00;
    	float discountsCouldHaveBeenTaken = 25000.00;
    	float expectedValue = 0.6;
    	
        assertEquals("Error in PctgQualifyingDiscountsTaken()", expectedValue, apratio.pctgQualifyingDiscountsTaken(discountsTaken, discountsCouldHaveBeenTaken));
    }

    @Test
    public void testpctgDuplicatePaymentsProcessed() {
    	
    	float aggregDuplicateInvoicesPaid = 2000000.00;
    	float totalAmountSupplierPayments = 100000000.00;
    	
    	float expectedValue = 0.02;
	    	
        assertEquals("Error in pctgDuplicatePaymentsProcessed()", expectedValue, apratio.pctgDuplicatePaymentsProcessed(discountsTaken, discountsCouldHaveBeenTaken, expectedValue));
    }
    
}
