package com.mgsrinivasan.Accounting;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class APRatiosTest {

    @Before
    public void setup() {
    	LCMInv FreeSwing = new LCMInv(1000,190);
    	LCMInv GolfElite = new LCMInv(750, 140);
    	LCMInv HiFlight = new LCMInv(200,135);
    	LCMInv Iridescent = new LCMInv(1200,280);
    	LCMInv Titanium = new LCMInv(800, 200);
    }
    
    @Test
    public void QtyOnHandTest() {
    	    	
        assertEquals("Error in getQtyOnHand", 1000, FreeSwing.getQtyOnHand());
        assertEquals("Error in getQtyOnHand", 750, GolfElite.getQtyOnHand());
        assertEquals("Error in getQtyOnHand", 200, HiFlight.getQtyOnHand());
        assertEquals("Error in getQtyOnHand", 1200, Iridescent.getQtyOnHand());
        assertEquals("Error in getQtyOnHand", 800, Titanium.getQtyOnHand());

    }

    @Test
    public void getUnitCostTest() {
    	    	
        assertEquals("Error in getUnitCost", 190, FreeSwing.getUnitCost());
        assertEquals("Error in getUnitCost", 140, GolfElite.getUnitCost());
        assertEquals("Error in getUnitCost", 135, HiFlight.getUnitCost());
        assertEquals("Error in getUnitCost", 280, Iridescent.getUnitCost());
        assertEquals("Error in getUnitCost", 200, Titanium.getUnitCost());

    }

    @Test
    public void getInvAtCostTest() {

    	FreeSwing.setInvAtCost();
    	GolfElite.setInvAtCost();
    	HiFlight.setInvAtCost();
    	Iridescent.setInvAtCost();
    	Titanium.setInvAtCost();
	
    	assertEquals("Error in getInvAtCost", 190000, FreeSwing.getInvAtCost());
        assertEquals("Error in getInvAtCost", 105000, GolfElite.getInvAtCost());
        assertEquals("Error in getInvAtCost", 27000, HiFlight.getInvAtCost());
        assertEquals("Error in getInvAtCost", 336000, Iridescent.getInvAtCost());
        assertEquals("Error in getInvAtCost", 160000, Titanium.getInvAtCost());

    }    
    
    @Test
    public void getMktCostPerUnitTest() {

    	FreeSwing.setMktCostPerUnit(230);
    	GolfElite.setMktCostPerUnit(170);
    	HiFlight.setMktCostPerUnit(120);
    	Iridescent.setMktCostPerUnit(160);
    	Titanium.setMktCostPerUnit(215);
	
    	assertEquals("Error in getInvAtCost", 230, FreeSwing.getMktCostPerUnit());
        assertEquals("Error in getInvAtCost", 170, GolfElite.getMktCostPerUnit());
        assertEquals("Error in getInvAtCost", 120, HiFlight.getMktCostPerUnit());
        assertEquals("Error in getInvAtCost", 160, Iridescent.getMktCostPerUnit());
        assertEquals("Error in getInvAtCost", 215, Titanium.getMktCostPerUnit());

    }    
    
    @Test
    public void getInvAtMkt() {

    	FreeSwing.setInvAtMkt();
    	GolfElite.setInvAtMkt();
    	HiFlight.setInvAtMkt();
    	Iridescent.setInvAtMkt();
    	Titanium.setInvAtMkt();
	
    	assertEquals("Error in getInvAtMkt", 230000, FreeSwing.getInvAtMkt());
        assertEquals("Error in getInvAtMkt", 105000, GolfElite.getInvAtMkt());
        assertEquals("Error in getInvAtMkt", 24000,  HiFlight.getInvAtMkt());
        assertEquals("Error in getInvAtMkt", 192000, Iridescent.getInvAtMkt());
        assertEquals("Error in getInvAtMkt", 172000, Titanium.getInvAtMkt());

    }    
    
    @Test
    public void getLCMTest() {

    	FreeSwing.setLCMcost();
    	GolfElite.setLCMcost();
    	HiFlight.setLCMcost();
    	Iridescent.setLCMcost();
    	Titanium.setLCMcost();
	
    	assertEquals("Error in getLCM", 190000, FreeSwing.getLCM());
        assertEquals("Error in getLCM", 105000, GolfElite.getLCM());
        assertEquals("Error in getLCM", 24000,  HiFlight.getLCM());
        assertEquals("Error in getLCM", 192000, Iridescent.getLCM());
        assertEquals("Error in getLCM", 160000, Titanium.getLCM());

    }    

    
}
