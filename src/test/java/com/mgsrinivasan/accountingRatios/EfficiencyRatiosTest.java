package com.mgsrinivasan.accountingRatios;

import com.mgsrinivasan.accountingRatios.EfficiencyRatios;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EfficiencyRatiosTest {

//    @BeforeEach
//    public void setup() {
//        EfficiencyRatios sm = new EfficiencyRatios();
//    }

    @Test
    public void testAccountsReceivableTurnover() {
    	float creditSales = (float) 3000000;
    	float begAR = (float) 400000;
    	float endAR = (float) 450000;

    	float expected = (float) 7.0588236;
        //float delta = (float) 0.0;

        assertEquals(expected, EfficiencyRatios.accountsReceivableTurnover(creditSales,begAR, endAR),"accountsReceivableTurnover not working correctly");
    }

    @Test
    public void testInventoryTurnover() {
        float COGS = (float) 900000;
        float begInv = (float) 120000;
        float endInv = (float) 180000;
        float expected = (float) 6.0;
        //float delta = (float) 0.0;

        assertEquals(expected, EfficiencyRatios.inventoryTurnover(COGS, begInv, endInv),"testinventoryTurnover not working correctly");
    }

    @Test
    public void testAvgDaysSalesInInventory() {
        float inventoryTurnover = (float) 6.0;
        float expected = (float) 60.833332;

        assertEquals(expected, EfficiencyRatios.avgDaysSalesInInventory(inventoryTurnover),"testAvgDaysSalesInInventory not working correctly");
    }

    @Test
    public void testFixedAssetTurnover() {
    	float sales = (float) 250000;
    	float begNetFixedAssets = (float) 25000;
        float endNetFixedAssets = (float) 75000;
    	float expected = (float) 5; // generate 5xs more saales than the net book value of his assets
        // float delta = (float) 0.0;

        assertEquals(expected, EfficiencyRatios.fixedAssetTurnover(sales, begNetFixedAssets, endNetFixedAssets),"fixedAssetTurnover not working correctly");
    }

    @Test
    public void testAccumDepToFixedAssets() {
        float accumDep = 800000;
        // 3,200,000 total fixed assets
        // - 400,000 valuee of land factory is on
        float totalFixedAasset = 2800000;
        float expected = (float) 0.2857143; // 28.6% ; company's fixed assets only worth approx 70% of original value

        assertEquals(expected, EfficiencyRatios.accumDepToFixedAssets(accumDep,totalFixedAasset)," testAccumDepToFixedAssets not working correctly");

    }

}
