package com.mgsrinivasan.Accounting;

// Updated to Java 12, Maven, JUnit 5

import com.mgsrinivasan.accountingInventory.FifoInv;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
                total cost $     total units     average cost
1/1 Balance         300             200             1.50

1/5 purchase        480     =       300 units x     1.60
                    ----            ----
                    780     /       500      =     1.56

sold                               <400>
1/15 sale           156             100             1.56

1/18 purchase       330     =       200 units  x    1.65
                    ---             ---
                    486     /       300        =    1.62

1/27 purchase       534     =       300       x     1.78
                    ----            ---
                    1,020    /      600       =     1.70

Ending Inventory    1,020   =       600       x     1.70

FIFO:
good sold in chronological order purchased
EI consist of Last purchases made during accounting period

FIFO Periodic

Sold: 400 units
1/1     -200 x 1.50 =   -300
1/5     -200 x 1.60 =   -320

EI:  600 units left
1/27    300 x 1.78  =   534
1/18    200 x 1.65  =   330
1/5     100 x 1.60  =   160
EI:                     $1,024


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

	public static FifoInv begBal = new FifoInv(0,0,0);
    public static FifoInv purchase1 = new FifoInv(0,0,0);
    public static FifoInv sale1 = new FifoInv(0,0,0);
    public static FifoInv sale2 = new FifoInv(0,0,0);
    public static FifoInv purchase2 = new FifoInv(0,0,0);
    public static FifoInv purchase3 = new FifoInv(0,0,0);
    public static FifoInv costOfGoodsSold = new FifoInv(0,0,0);
    public static FifoInv endingInventory = new FifoInv(0,0,0);

    @Test
    public void setBegLayerTest() {
        // 1/1 Balance 200 * 1.50 = 300

    	int units = 200;
    	float unitCost = (float) 1.50;
   	
    	float expected = (float) 300.00;
        begBal.setInvLayer(units,unitCost);
        endingInventory.setInvLayer(units,unitCost);

        assertEquals(expected, begBal.getInvLayer(), "getInvLayer not working correctly");
    }

    @Test
    public void setFifoPurchaseTest1() {
    // 1/5 purchase:  300 units x 1.60 = 480
    	int units = 300;
    	float unitCost = (float) 1.60;

    	double expected = 480.0000071525574;

        purchase1.setInvLayer(units,unitCost);

        endingInventory.setInvLayer(units,unitCost);

        assertEquals(expected, purchase1.getInvLayer(), "getInvLayer not working correctly");
    }

    @Test
    public void setFifoSaleTest1() {
        // sold from 1/1 beg inventory:
        // 200 units [of 400 units] x 1.50 = -300
        int units = -200;
        float unitCost = (float) 1.50;

        double expected = -300.00;

        sale1.setInvLayer(units,unitCost);

        assertEquals(expected, sale1.getInvLayer(), "getInvLayer not working correctly");
    }

    @Test
    public void setFifoSaleTest2() {
        // sold from 1/5 purchase:
        // 200 units [of 400 units] x 1.60 = -320
        int units = -200;
        float unitCost = (float) 1.60;

        double expected = -320.0000047683716;

        sale2.setInvLayer(units,unitCost);

        assertEquals(expected, sale2.getInvLayer(), "getInvLayer not working correctly");
    }

    @Test
    public void setFifoPurchaseTest2() {
    // 1/18 purchase: 200 units x 1.65 = 330
    	int units = 200;
    	float unitCost = (float) 1.65;
   	
    	double expected = 329.9999952316284;

        purchase2.setInvLayer(units,unitCost);

        assertEquals(expected, purchase2.getInvLayer(), "getInvLayer not working correctly");
    }

@Test
public void setFifoPurchaseTest3() {
// 1/27 purchase  300 x 1.78 = 534
    int units = 300;
    float unitCost = (float) 1.78;
    double expected = 533.9999914169312;

    purchase3.setInvLayer(units,unitCost);

    assertEquals(expected, purchase3.getInvLayer(), "getInvLayer not working correctly");

}

    @Test
    public void getFifoCOGSUnitsTest() {
   
    	int expected = -400;

        assertEquals(expected, costOfGoodsSold.getFifoCOGSUnits(), "getFifoCOGSUnits not working correctly");
    }

    public void getFifoCOGSTest() {

        double expected = -620;

        assertEquals(expected, costOfGoodsSold.getFifoCOGSold(), "getFifoCOGSold not working correctly");
    }

    @Test
    public void getFifoEndInvUnitsTest() {

        int expected = 600;

        assertEquals(expected, endingInventory.getFifoEndInvUnits(), "getFifoEndInvUnits not working correctly");
    }

    public void getFifoEndInvTest() {

        double expected = 1024;

        assertEquals(expected, endingInventory.getFifoEndInv(), "getFifoEndInv not working correctly");
    }

}
