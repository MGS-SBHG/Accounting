package com.mgsrinivasan.Accounting;

// Updated to Maven and JUnit 5

import com.mgsrinivasan.accountingInventory.FifoInv;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
                total cost $     total units     average cost
1/1 Balance         300             200             1.50

                    480     =       300 units x     1.60
1/5 purchase        780     /        500      =     1.56

sold                               <400>
1/15 sale           156             100             1.56

                    330     =       200 units  x    1.65
1/18 purchase       486     /       300        =    1.62

                    534     =       300       x     1.78
1/27 purchase       1020    /       600       =     1.70

ending inventory    1,020   =       600       x     1.70

FIFO:
good sold in chronological order purchased
EI consist of Last purchases made during accounting period

FIFO periodic 600 units
1/27    300 x 1.78  =   534
1/18    200 x 1.65  =   330
1/5     100 x 1.60  =   160
Ending Inventory        $1,024

FIFO perpetual
1/1     200 x 1.50  =   300
1/5     300 x 1.60  =   480

Sold 400 COGS
1/1     200 x 1.50  =   300
1/5     200 x 1.60  =   320
        400
balance left
1/5     100 x 1.60  =   160
1/18    200 x 1.65  =   330
1/27    300 x 1.78  =   534
Ending inventory    =   $1,024

*/

public class FifoInvTest {

	FifoInv sm = new FifoInv();
    	float[] sales;
    	float[] purchases;

    @Test
    public void setFifoBegInvTest() {
    	int units = 100; 
    	float unitCost = (float) 210.00;
   	
    	float expected = (float) 21000.00;
    	sm.setFifoBegInv(units,unitCost);

        // float delta = (float) 0.0;

        assertEquals(expected, sm.getFifoBegInv(), "setFifoBegInv not working correctly");
    }

    @Test
    public void setFifoPurchaseTest() {
    	int units = 150; 
    	float unitCost = (float) 280.00;
   	
    	float expected = (float) 42000.00;
    	
    	sm.setFifoPurchase(units,unitCost);

        // float delta = (float) 0.0;

        assertEquals(expected, sm.getFifoLayerCost(), "setFifoPurchase not working correctly");
    }
    
    @Test
    public void setFifoPurchaseTest2() {
    	int units = 50; 
    	float unitCost = (float) 300.00;
   	
    	float expected = (float) 15000.00;
    	
    	sm.setFifoPurchase(units,unitCost);

        float delta = (float) 0.0;

        assertEquals(expected, sm.getFifoLayerCost(), "setFifoPurchase not working correctly");
    }
    
    @Test
    public void getFifoCOGSUnitsTest() {
   
    	int expected = 175;

        //float delta = (float) 0.0;

        assertEquals(expected, sm.getFifoCOGSUnits(), "getFifoCOGSUnits not working correctly");
    }

}
