package com.mgsrinivasan.Accounting;

import com.mgsrinivasan.accountingInventory.LCMInv;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LCMInvTest {

    private LCMInv FreeSwing;
    private LCMInv GolfElite;
    private LCMInv HiFlight;
    private LCMInv Iridescent;
    private LCMInv Titanium;

    @Before
    public void setup() {
    	FreeSwing = new LCMInv(1000,190);
    	GolfElite = new LCMInv(750, 140);
    	HiFlight = new LCMInv(200,135);
    	Iridescent = new LCMInv(1200,280);
    	Titanium = new LCMInv(800, 200);
    }
    
    @Test
    public void QtyOnHandTest() {
        assertEquals("Error in getQtyOnHand", 1000, FreeSwing.getQtyOnHand(),0);
        assertEquals("Error in getQtyOnHand", 750, GolfElite.getQtyOnHand(),0);
        assertEquals("Error in getQtyOnHand", 200, HiFlight.getQtyOnHand(),0);
        assertEquals("Error in getQtyOnHand", 1200, Iridescent.getQtyOnHand(),0);
        assertEquals("Error in getQtyOnHand", 800, Titanium.getQtyOnHand(),0);
    }

    @Test
    public void getUnitCostTest() {
        assertEquals("Error in getUnitCost", 190, FreeSwing.getUnitCost(),0);
        assertEquals("Error in getUnitCost", 140, GolfElite.getUnitCost(),0);
        assertEquals("Error in getUnitCost", 135, HiFlight.getUnitCost(),0);
        assertEquals("Error in getUnitCost", 280, Iridescent.getUnitCost(),0);
        assertEquals("Error in getUnitCost", 200, Titanium.getUnitCost(),0);
    }

    @Test
    public void getInvAtCostTest() {
    	FreeSwing.setInvAtCost();
    	GolfElite.setInvAtCost();
    	HiFlight.setInvAtCost();
    	Iridescent.setInvAtCost();
    	Titanium.setInvAtCost();
	
    	assertEquals("Error in getInvAtCost", 190000, FreeSwing.getInvAtCost(),0);
        assertEquals("Error in getInvAtCost", 105000, GolfElite.getInvAtCost(),0);
        assertEquals("Error in getInvAtCost", 27000, HiFlight.getInvAtCost(),0);
        assertEquals("Error in getInvAtCost", 336000, Iridescent.getInvAtCost(),0);
        assertEquals("Error in getInvAtCost", 160000, Titanium.getInvAtCost(),0);

    }    
    
    @Test
    public void getMktCostPerUnitTest() {

    	FreeSwing.setMktCostPerUnit(230);
    	GolfElite.setMktCostPerUnit(170);
    	HiFlight.setMktCostPerUnit(120);
    	Iridescent.setMktCostPerUnit(160);
    	Titanium.setMktCostPerUnit(215);
	
    	assertEquals("Error in getInvAtCost", 230, FreeSwing.getMktCostPerUnit(),0);
        assertEquals("Error in getInvAtCost", 170, GolfElite.getMktCostPerUnit(),0);
        assertEquals("Error in getInvAtCost", 120, HiFlight.getMktCostPerUnit(),0);
        assertEquals("Error in getInvAtCost", 160, Iridescent.getMktCostPerUnit(),0);
        assertEquals("Error in getInvAtCost", 215, Titanium.getMktCostPerUnit(),0);

    }    
    
    @Test
    public void getInvAtMkt() {

    	FreeSwing.setInvAtMkt();
    	GolfElite.setInvAtMkt();
    	HiFlight.setInvAtMkt();
    	Iridescent.setInvAtMkt();
    	Titanium.setInvAtMkt();
	
    	assertEquals("Error in getInvAtMkt", 230000, FreeSwing.getInvAtMkt(),0);
        assertEquals("Error in getInvAtMkt", 105000, GolfElite.getInvAtMkt(),0);
        assertEquals("Error in getInvAtMkt", 24000,  HiFlight.getInvAtMkt(),0);
        assertEquals("Error in getInvAtMkt", 192000, Iridescent.getInvAtMkt(),0);
        assertEquals("Error in getInvAtMkt", 172000, Titanium.getInvAtMkt(),0);

    }    
    
    @Test
    public void getLCMTest() {

    	FreeSwing.setLCMcost();
    	GolfElite.setLCMcost();
    	HiFlight.setLCMcost();
    	Iridescent.setLCMcost();
    	Titanium.setLCMcost();
	
    	assertEquals("Error in getLCM", 190000, FreeSwing.getLCM(),0);
        assertEquals("Error in getLCM", 105000, GolfElite.getLCM(),0);
        assertEquals("Error in getLCM", 24000,  HiFlight.getLCM(),0);
        assertEquals("Error in getLCM", 192000, Iridescent.getLCM(),0);
        assertEquals("Error in getLCM", 160000, Titanium.getLCM(),0);

    }    

    
}
