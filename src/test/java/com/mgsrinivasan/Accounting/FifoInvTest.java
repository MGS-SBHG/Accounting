package com.mgsrinivasan.Accounting;

import com.mgsrinivasan.accountingInventory.FifoInv;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FifoInvTest {

	FifoInv sm;
	
    @Before
    public void setup() {
        sm = new FifoInv();
    	float[] sales;
    	float[] purchases;
        
    }

    @Test
    public void setFifoBegInvTest() {
    	int units = 100; 
    	float unitCost = (float) 210.00;
   	
    	float expected = (float) 21000.00;
    	sm.setFifoBegInv(units,unitCost);

        float delta = (float) 0.0;

        assertEquals("setFifoBegInv not working correctly", expected, sm.getFifoBegInv(), delta);
    }

    @Test
    public void setFifoPurchaseTest() {
    	int units = 150; 
    	float unitCost = (float) 280.00;
   	
    	float expected = (float) 42000.00;
    	
    	sm.setFifoPurchase(units,unitCost);

        float delta = (float) 0.0;

        assertEquals("setFifoPurchase not working correctly", expected, sm.getFifoLayerCost(), delta);
    }
    
    @Test
    public void setFifoPurchaseTest2() {
    	int units = 50; 
    	float unitCost = (float) 300.00;
   	
    	float expected = (float) 15000.00;
    	
    	sm.setFifoPurchase(units,unitCost);

        float delta = (float) 0.0;

        assertEquals("setFifoPurchase not working correctly", expected, sm.getFifoLayerCost(), delta);
    }
    
    @Test
    public void getFifoCOGSUnitsTest() {
   
    	int expected = 175;

        float delta = (float) 0.0;

        assertEquals("setFifoPurchase not working correctly", expected, sm.getFifoCOGSUnits(), delta);
    }

      
}
