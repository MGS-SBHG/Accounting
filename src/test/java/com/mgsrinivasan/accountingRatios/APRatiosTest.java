package com.mgsrinivasan.accountingRatios;

// Updated to Java 12, Maven, JUnit 5

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class APRatiosTest {

    @BeforeEach
    public void setup() { APRatios apRatio = new APRatios();
    }
    
    @Test
    public void testPayablesTurnover() {
    	float totalSupplierPurchases = (float) 1000000.00;
    	float begAccountsPayable = (float) 50000.00;
    	float endAccountsPayable = (float) 250000.00;
    	float expectedValue = (float) 6.6666666667;
        float delta = (float) 0.0;

        assertEquals(expectedValue, APRatios.payablesTurnover(totalSupplierPurchases,begAccountsPayable,endAccountsPayable), "expectedValue should equal 6.6666666667");

    }

    @Test
    public void testPctgQualifyingDiscountsTaken() {
    	
    	float discountsTaken = (float) 15000.00;
    	float discountsCouldHaveBeenTaken = (float) 25000.00;
    	float expectedValue = (float) 0.6;

        float delta = (float) 0.0;

        assertEquals(expectedValue, APRatios.pctgQualifyingDiscountsTaken(discountsTaken,discountsCouldHaveBeenTaken), "expectedValue should equal 0.6");

        // assertEquals("Error in PctgQualifyingDiscountsTaken()", expectedValue, apRatio.pctgQualifyingDiscountsTaken(discountsTaken, discountsCouldHaveBeenTaken), delta);
    }

    @Test
    public void testpctgDuplicatePaymentsProcessed() {
    	
    	float aggregDuplicateInvoicesPaid = (float) 2000000.00;
    	float totalAmountSupplierPayments = (float) 100000000.00;
    	
    	float expectedValue = (float) 0.02;
        float delta = (float) 0.0;

        assertEquals(expectedValue, APRatios.pctgDuplicatePaymentsProcessed(aggregDuplicateInvoicesPaid, totalAmountSupplierPayments), "expectedValue should equal 0.02");

        // assertEquals("Error in pctgDuplicatePaymentsProcessed()", expectedValue, apRatio.pctgDuplicatePaymentsProcessed(aggregDuplicateInvoicesPaid, totalAmountSupplierPayments), delta);
    }

}
