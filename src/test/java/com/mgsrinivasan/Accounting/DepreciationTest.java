package com.mgsrinivasan.Accounting;

import com.mgsrinivasan.accountingDepreciation.Depreciation;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class DepreciationTest {

	Depreciation dt;

    @Before
    public void setup() {
        dt = new Depreciation();
    }

    
    @Test
    public void testStraightLineDep() {
    	/*
    	float assetCost = 60000 
    	float expectedSalvageCost = 10000 
    	int estUsefulLife = 5;
    	
    	float expected = 10000
    	*/
    	
    	System.out.println("expected: 10000");
    	System.out.println("computed: " + dt.straightLineDep(60000, 10000, 5));
        assertTrue("straightLineDep Not working correctly", 10000 == dt.straightLineDep(60000,10000,5));
    }

    @Test
    public void testSumOfYrsDigitsDep(){
    	/*
		asset cost – machine		100000
		expected salvage cost		10000
		*/
    	
    	/*
		remaining est useful life = 5
    	expected = 30000
    	*/
    	assertTrue("sumOfYrsDigitsDep not working correctly", 30000 == dt.sumOfYrsDigitsDep(100000, 10000, 5));

    	/*
		remaining est useful life = 4
    	expected = 24000
    	*/
    	assertTrue("sumOfYrsDigitsDep not working correctly", 24000 == dt.sumOfYrsDigitsDep(100000, 10000, 4));
    	
    	/*
		remaining est useful life = 3
    	expected = 18000
    	*/
    	assertTrue("sumOfYrsDigitsDep not working correctly", 18000 == dt.sumOfYrsDigitsDep(100000, 10000, 3));
    	
    	/*
		remaining est useful life = 2
    	expected = 12000
    	*/
    	assertTrue("sumOfYrsDigitsDep not working correctly", 12000 == dt.sumOfYrsDigitsDep(100000, 10000, 2));
    	
    	/*
		remaining est useful life = 1
    	expected = 6000
    	*/
    	assertTrue("sumOfYrsDigitsDep not working correctly", 6000 == dt.sumOfYrsDigitsDep(100000, 10000, 1));

    	
    }

    @Test
    public void testDblDeclBalDep(){
    	/*
    	int usefulLife = 100000;
    	float strgtLineRate = 10000;
    	float assetCost = 5;
    	float accumDep = 0.0;
    	
    	float expected = 40000;
    	*/
    	
    	assertTrue("dblDeclBalDep not working correctly", 40000 == dt.dblDeclBalDep(100000, 10000, 5, 0));
    }

    @Test
    public void testOneHdrdFiftyPctDeclBalDep(){
    	/*
    	int usefulLife = 100000;
    	float strgtLineRate = 10000;
    	float assetCost = 5;
    	float accumDep = 0.0;
    	
    	float expected = 30000;
    	*/
    	
    	assertTrue("oneHdrdFiftyPctDeclBalDep not working correctly", 30000 == dt.oneHdrdFiftyPctDeclBalDep(100000, 10000, 5, 0));
    }
  

}
