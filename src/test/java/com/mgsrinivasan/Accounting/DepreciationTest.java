package com.mgsrinivasan.Accounting;

// Updated to Java 12, Maven, JUnit 5

import com.mgsrinivasan.accountingDepreciation.Depreciation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DepreciationTest {

	Depreciation dt = new Depreciation();

    @Test
    public void testStraightLineDep() {


    	float assetCost = 60000;
    	float expectedSalvageCost = 10000;
    	int estUsefulLife = 5;

    	float expected = 10000;


    	System.out.println("expected: 10000");
    	System.out.println("computed: " + dt.straightLineDep(60000, 10000, 5));
        assertEquals(expected,  dt.straightLineDep(60000,10000,5),"testStraightLineDep");
    }

    @Test
    public void testSumOfYrsDigitsDep(){

		float assetCostMachine = 100000;
		float expectedSalvageCost =	10000;
        int EstUsefulLife = 5;

		int remainingEstUsefulLifeYr1 = 5;
    	double expected1 = 30000;

      assertEquals( expected1, dt.sumOfYrsDigitsDep(assetCostMachine, expectedSalvageCost, EstUsefulLife,remainingEstUsefulLifeYr1),"sumOfYrsDigitsDep not working correctly");

		int remainingEstUsefulLifeYr2 = 4;
    	double expected2 = 24000.001953125;

      assertEquals(expected2, dt.sumOfYrsDigitsDep(assetCostMachine, expectedSalvageCost, EstUsefulLife,remainingEstUsefulLifeYr2),"sumOfYrsDigitsDep not working correctly");

        int remainingEstUsefulLifeYr3 = 3;
        double expected3 = 18000;

        assertEquals(expected3, dt.sumOfYrsDigitsDep(assetCostMachine, expectedSalvageCost, EstUsefulLife,remainingEstUsefulLifeYr3),"sumOfYrsDigitsDep not working correctly");

        int remainingEstUsefulLifeYr4 = 2;
        double expected4 = 12000.0009765625;

        assertEquals(expected4, dt.sumOfYrsDigitsDep(assetCostMachine, expectedSalvageCost, EstUsefulLife, remainingEstUsefulLifeYr4),"sumOfYrsDigitsDep not working correctly");

        int remainingEstUsefulLife5 = 1;
        double expected5 = 6000.00048828125;

        assertEquals(expected5, dt.sumOfYrsDigitsDep(assetCostMachine, expectedSalvageCost, EstUsefulLife,remainingEstUsefulLife5),"sumOfYrsDigitsDep not working correctly");

    }

    @Test
    public void testDblDeclBalDep(){

//    	int usefulLife = 5;
//    	float assetCost = 100000;
//    	float accumDep = 10000;
//
//    	double expected = 36000;

        int usefulLife = 10;
        float assetCost = 20000;
        // float salvageValue = 1000;
        float accumDep = 0;

        double expected = 4000; //4000.0

        assertEquals(expected, dt.dblDeclBalDep(assetCost, accumDep, usefulLife),"dblDeclBalDep not working correctly");
    }

    @Test
    public void testOneHdrdFiftyPctDeclBalDep(){

//    	int usefulLife = 100000;
//        float assetCost = 100000;
//    	float strgtLineRate = 0.10;
//    	float assetCost = 5;
//    	float accumDep = 0;

    	double expected = 27000.001953125;
        assertEquals(expected, dt.oneHdrdFiftyPctDeclBalDep(100000, 10000, 5),"oneHdrdFiftyPctDeclBalDep not working correctly");
    }

}
