package com.mgsrinivasan.Accounting;

import com.mgsrinivasan.accountingInventory.WtdAvgInv;
import org.junit.Before;
import org.junit.Test;

public class WtdAvgInvTest {

    @Before
    public void setup() {
    	// Set Beg Inv 150 units; $220 unit cost
    	WtdAvgInv wtd_avg_inv = new WtdAvgInv(150, 220);
    }
    
    @Test
    public void nameTest() {

        float expectedValue = 0;
    	
    //  assertEquals("Error in , expectedValue, x.method());
    }
}
