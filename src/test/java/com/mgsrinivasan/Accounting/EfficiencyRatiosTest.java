package com.mgsrinivasan.Accounting;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class EfficiencyRatiosTest {

	accountingRatios.EfficiencyRatios sm;

    @Before
    public void setup() {
        sm = new accountingRatios.EfficiencyRatios();
    }

    @Test
    public void testaccountsReceivableTurnover() {
    	float creditSales = (float) 0.0;
    	float begAR = (float) 0.0;
    	float endAR = (float) 0.0;
    	
    	float expected = (float) 0.0;
        float delta = (float) 0.0;

        assertEquals("accountsReceivableTurnover not working correctly", expected, sm.accountsReceivableTurnover(creditSales,begAR, endAR),delta);
    }

    @Test
    public void testinventoryTurnover() {
    	float COGS = (float) 0.0;
    	float begInv = (float) 0.0;
    	float endInv = (float) 0.0;
        float expected = (float) 0.0;
        float delta = (float) 0.0;

        assertEquals("testinventoryTurnover not working correctly", expected, sm.inventoryTurnover(COGS, begInv, endInv),delta);
    }

    @Test
    public void testfixedAssetTurnover() {
    	float sales = (float) 0.0;
    	float begFixedAssets = (float) 0.0;
        float endFixedAssets = (float) 0.0;
    	float expected = (float) 0.0;
        float delta = (float) 0.0;

        assertEquals("fixedAssetTurnover not working correctly", expected, sm.fixedAssetTurnover(sales, begFixedAssets, endFixedAssets),delta);
    }

    @Test
    public void acctsPayableTurnover() {
    	float ttlPurchasesFromSuppliers = (float) 0.0;
    	float begPayables = (float) 0.0;
        float endPayables = (float) 0.0;
        float expected = (float) 0.0;
        float delta = (float) 0.0;

        assertEquals("acctsPayableTurnover not working correctly", expected, sm.acctsPayableTurnover(ttlPurchasesFromSuppliers, begPayables, endPayables),delta);
    }
}
