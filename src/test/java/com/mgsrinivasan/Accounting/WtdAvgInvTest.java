package com.mgsrinivasan.Accounting;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class APRatiosTest {

	

    @Before
    public void setup() {
    	// Set Beg Inv 150 units; $220 unit cost
    	WtdAvgInv wtd-avg-inv = new WtdAvgInv(150, 220);
    	
    }
    
    @Test
    public void nameTest() {
    	
    	float expectedValue = 0;
    	
        assertEquals("Error in , expectedValue, x.method());
    }

    
}
