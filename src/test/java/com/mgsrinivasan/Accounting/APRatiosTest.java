package com.mgsrinivasan.Accounting;

import com.mgsrinivasan.accountingRatios.APRatios;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class APRatiosTest {

    APRatios apRatio;

    @Before
    public void setup() {
    	apRatio = new APRatios();
    }
    
    @Test
    public void testPayablesTurnover() {
    	float totalSupplierPurchases = (float) 1000000.00;
    	float begAccountsPayable = (float) 50000.00;
    	float endAccountsPayable = (float) 250000.00;
    	float expectedValue = (float) 6.6666666667;
        float delta = (float) 0.0;

        assertEquals("Error in payablesTurnover()", expectedValue, APRatios.payablesTurnover(totalSupplierPurchases, begAccountsPayable, endAccountsPayable), delta);
    }

    @Test
    public void testPctgQualifyingDiscountsTaken() {
    	
    	float discountsTaken = (float) 15000.00;
    	float discountsCouldHaveBeenTaken = (float) 25000.00;
    	float expectedValue = (float) 0.6;

        float delta = (float) 0.0;

        assertEquals("Error in PctgQualifyingDiscountsTaken()", expectedValue, apRatio.pctgQualifyingDiscountsTaken(discountsTaken, discountsCouldHaveBeenTaken), delta);
    }

    @Test
    public void testpctgDuplicatePaymentsProcessed() {
    	
    	float aggregDuplicateInvoicesPaid = (float) 2000000.00;
    	float totalAmountSupplierPayments = (float) 100000000.00;
    	
    	float expectedValue = (float) 0.02;
        float delta = (float) 0.0;

        assertEquals("Error in pctgDuplicatePaymentsProcessed()", expectedValue, apRatio.pctgDuplicatePaymentsProcessed(aggregDuplicateInvoicesPaid, totalAmountSupplierPayments), delta);
    }
    
}
