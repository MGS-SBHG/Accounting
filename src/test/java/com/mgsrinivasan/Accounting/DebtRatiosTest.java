package com.mgsrinivasan.Accounting;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DebtRatiosTest {

	accountingRatios.DebtRatios sm;

    @Before
    public void setup() {
        sm = new accountingRatios.DebtRatios();
    }

    @Test
    public void testDebtToEquityRatio() {
    	float ttlDebtAmt = (float) 500000.00;
    	float ttlEquityAmt = (float) 750000.00;
    	float expected = (float) 0.6666666667;
    	float delta = (float) 0.0;
    	
        assertEquals("DebtToEquityRatio not working correctly", expected, sm.debtToEquityRatio(ttlDebtAmt, ttlEquityAmt), delta);
    }

    @Test
    public void testdebtRatio() {
    	float ttlDebt = (float) 700000.00;
    	float ttlAssets = (float) 1000000.00;
    	float expected = (float) 0.7;
        float delta = (float) 0.0;

        assertEquals("debtRatio not working correctly", expected, sm.debtRatio(ttlDebt, ttlAssets), delta);
    }

    @Test
    public void testdebtServiceCoverageRatio() {
    	float ttlNetAnnualOperIncome = (float) 10000000.00;
    	float ttlAnnualLoanPayments = (float) 50000000.00;
    	float expected = (float) 0.2;
        float delta = (float) 0.0;

        assertEquals("debtServiceCoverageRatio not working correctly", expected, sm.debtServiceCoverageRatio(ttlNetAnnualOperIncome, ttlAnnualLoanPayments),delta);
    }

    @Test
    public void testinterestCoverageRatio() {
    	float EBIT = (float) 1000000000.00;
    	float intExp = (float) 40000.00;
    	float expected = 25000;
        float delta = (float) 0.0;

        assertEquals("interestCoverageRatio not working correctly", expected, sm.interestCoverageRatio(EBIT, intExp), delta);
    }
}
