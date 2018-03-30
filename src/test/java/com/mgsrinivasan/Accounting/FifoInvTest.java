
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

package com.mgsrinivasan;

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
    	float unitCost = 210.00;
   	
    	float expected = 21000.00;
    	sm.setFifoBegInv(units,unitCost); 
    	
        assertEquals("setFifoBegInv not working correctly", expected, sm.getFifoBegInv());
    }

    @Test
    public void setFifoPurchaseTest() {
    	int units = 150; 
    	float unitCost = 280.00;
   	
    	float expected = 42000.00;
    	
    	sm.setFifoPurchase(units,unitCost);
    	
        assertEquals("setFifoPurchase not working correctly", expected, sm.getFifoLayerCost());
    }
    
    @Test
    public void setFifoPurchaseTest() {
    	int units = 50; 
    	float unitCost = 300.00;
   	
    	float expected = 15000.00;
    	
    	sm.setFifoPurchase(units,unitCost);
    	
        assertEquals("setFifoPurchase not working correctly", expected, sm.getFifoLayerCost());
    }
    
    @Test
    public void getFifoCOGSUnitsTest() {
   
    	int expected = 175;
    	    	
        assertEquals("setFifoPurchase not working correctly", expected, sm.getFifoCOGSUnits());
    }

      
}
