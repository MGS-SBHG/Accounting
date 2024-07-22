package com.mgsrinivasan.accountingRatios;

// Updated to Maven and JUnit 5

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class DebtRatiosTest {




    @BeforeEach
    public void setup() {
        DebtRatios sm = new DebtRatios();
    }

    @Test
    public void testDebtToEquityRatio() {
    	float ttlDebtAmt = (float) 500000.00;
    	float ttlEquityAmt = (float) 750000.00;
    	float expected = (float) 0.6666666667;
    	float delta = (float) 0.0;
    	
        assertEquals(expected, DebtRatios.debtToEquityRatio(ttlDebtAmt, ttlEquityAmt), "DebtToEquityRatio not working correctly");
    }

    @Test
    public void testdebtRatio() {
    	float ttlDebt = (float) 700000.00;
    	float ttlAssets = (float) 1000000.00;
    	float expected = (float) 0.7;
        float delta = (float) 0.0;

        assertEquals(expected, DebtRatios.debtRatio(ttlDebt, ttlAssets), "debtRatio not working correctly");
    }

    @Test
    public void testdebtServiceCoverageRatio() {
    	float ttlNetAnnualOperIncome = (float) 10000000.00;
    	float ttlAnnualLoanPayments = (float) 50000000.00;
    	float expected = (float) 0.2;
        float delta = (float) 0.0;

        assertEquals(expected, DebtRatios.debtServiceCoverageRatio(ttlNetAnnualOperIncome, ttlAnnualLoanPayments),"debtServiceCoverageRatio not working correctly");
    }

    @Test
    public void testinterestCoverageRatio() {
    	float EBIT = (float) 1000000000.00;
    	float intExp = (float) 40000.00;
    	float expected = 25000;
        float delta = (float) 0.0;

        assertEquals(expected, DebtRatios.interestCoverageRatio(EBIT, intExp), "interestCoverageRatio not working correctly");
    }

}

