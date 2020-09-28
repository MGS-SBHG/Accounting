package com.mgsrinivasan.Accounting;

import com.mgsrinivasan.accountingDepreciation.Depreciation;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DepreciationRatiosTest {

	Depreciation sm;

    @Before
    public void setup() {
        sm = new Depreciation();
    }

    
    @Test
    public void testStraightLineDep() {
    	float assetCost = (float) 0.0;
    	float expectedSalvageCost = (float) 0.0;
    	int estUsefulLife = (int) 0.0;
    	
    	float expected = (float) 0.0;
        float delta = (float) 0.0;

        assertEquals("straightLineDep Not working correctly", expected, sm.straightLineDep(assetCost, expectedSalvageCost, estUsefulLife), delta);
    }

    @Test
    public void testSumOfYrsDigitsDep() {
  
    	float assetCost = (float) 0.0;
    	float expectedSalvageCost = (float) 0.0;
    	int estUsefulLife = (int) 0.0;
    	
    	float expected = (float) 0.0;
        float delta = (float) 0.0;

        assertEquals("sumOfYrsDigitsDep not working correctly", expected, sm.sumOfYrsDigitsDep(assetCost, expectedSalvageCost, estUsefulLife), delta);
    }

    @Test
    public void testDblDeclBalDep(){
    	int usefulLife = (int) 0.0;
    	float strgtLineRate = (float) 0.0;
    	float assetCost = (float) 0.0;
    	float accumDep = (float) 0.0;
    	float expected = (float) 0.0;
        float delta = (float) 0.0;

        assertEquals("dblDeclBalDep not working correctly", expected, sm.dblDeclBalDep(usefulLife, strgtLineRate, assetCost, accumDep), delta);
    }

    @Test
    public void testOneHdrdFiftyPctDeclBalDep(){
        int usefulLife = 0;
    	float strgtLineRate = (float) 0.0;
    	float assetCost = (float) 0.0;
    	float accumDep = (float) 0.0;
    	
    	float expected = (float) 0.0;
        float delta = (float) 0.0;

        assertEquals("oneHdrdFiftyPctDeclBalDep not working correctly", expected, sm.oneHdrdFiftyPctDeclBalDep( usefulLife, strgtLineRate, assetCost, accumDep),delta);
    }

}
