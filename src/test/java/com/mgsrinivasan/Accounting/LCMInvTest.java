package com.mgsrinivasan.Accounting;

// Updated to Maven and JUnit 5

import com.mgsrinivasan.accountingInventory.LCMInv;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class LCMInvTest {

    private LCMInv FreeSwing;
    private LCMInv GolfElite;
    private LCMInv HiFlight;
    private LCMInv Iridescent;
    private LCMInv Titanium;

    @BeforeEach
    public void setup() {
    	FreeSwing = new LCMInv(1000,190);
    	GolfElite = new LCMInv(750, 140);
    	HiFlight = new LCMInv(200,135);
    	Iridescent = new LCMInv(1200,280);
    	Titanium = new LCMInv(800, 200);
    }
    
    @Test
    public void QtyOnHandTest() {
        assertEquals(1000, FreeSwing.getQtyOnHand(),"Error in getQtyOnHand");
        assertEquals(750, GolfElite.getQtyOnHand(),"Error in getQtyOnHand");
        assertEquals(200, HiFlight.getQtyOnHand(),"Error in getQtyOnHand");
        assertEquals(1200, Iridescent.getQtyOnHand(),"Error in getQtyOnHand");
        assertEquals(800, Titanium.getQtyOnHand(),"Error in getQtyOnHand");
    }

    @Test
    public void getUnitCostTest() {
        assertEquals(190, FreeSwing.getUnitCost(),"Error in getUnitCost");
        assertEquals(140, GolfElite.getUnitCost(),"Error in getUnitCost");
        assertEquals(135, HiFlight.getUnitCost(),"Error in getUnitCost");
        assertEquals(280, Iridescent.getUnitCost(),"Error in getUnitCost");
        assertEquals(200, Titanium.getUnitCost(),"Error in getUnitCost");
    }

    @Test
    public void getInvAtCostTest() {
    	FreeSwing.setInvAtCost();
    	GolfElite.setInvAtCost();
    	HiFlight.setInvAtCost();
    	Iridescent.setInvAtCost();
    	Titanium.setInvAtCost();
	
    	assertEquals(190000, FreeSwing.getInvAtCost(),"Error in getInvAtCost");
        assertEquals(105000, GolfElite.getInvAtCost(),"Error in getInvAtCost");
        assertEquals(27000, HiFlight.getInvAtCost(),"Error in getInvAtCost");
        assertEquals(336000, Iridescent.getInvAtCost(),"Error in getInvAtCost");
        assertEquals(160000, Titanium.getInvAtCost(),"Error in getInvAtCost");

    }    
    
    @Test
    public void getMktCostPerUnitTest() {

    	FreeSwing.setMktCostPerUnit(230);
    	GolfElite.setMktCostPerUnit(170);
    	HiFlight.setMktCostPerUnit(120);
    	Iridescent.setMktCostPerUnit(160);
    	Titanium.setMktCostPerUnit(215);
	
    	assertEquals(230, FreeSwing.getMktCostPerUnit(),"Error in getInvAtCost");
        assertEquals(170, GolfElite.getMktCostPerUnit(),"Error in getInvAtCost");
        assertEquals(120, HiFlight.getMktCostPerUnit(),"Error in getInvAtCost");
        assertEquals(160, Iridescent.getMktCostPerUnit(),"Error in getInvAtCost");
        assertEquals(215, Titanium.getMktCostPerUnit(),"Error in getInvAtCost");

    }    
    
    @Test
    public void getInvAtMkt() {

    	FreeSwing.setInvAtMkt();
    	GolfElite.setInvAtMkt();
    	HiFlight.setInvAtMkt();
    	Iridescent.setInvAtMkt();
    	Titanium.setInvAtMkt();
	
    	assertEquals(230000, FreeSwing.getInvAtMkt(),"Error in getInvAtMkt");
        assertEquals(105000, GolfElite.getInvAtMkt(),"Error in getInvAtMkt");
        assertEquals(24000,  HiFlight.getInvAtMkt(),"Error in getInvAtMkt");
        assertEquals(192000, Iridescent.getInvAtMkt(),"Error in getInvAtMkt");
        assertEquals(172000, Titanium.getInvAtMkt(),"Error in getInvAtMkt");

    }    
    
    @Test
    public void getLCMTest() {

    	FreeSwing.setLCMcost();
    	GolfElite.setLCMcost();
    	HiFlight.setLCMcost();
    	Iridescent.setLCMcost();
    	Titanium.setLCMcost();
	
    	assertEquals(190000, FreeSwing.getLCM(),"Error in getLCM");
        assertEquals(105000, GolfElite.getLCM(),"Error in getLCM");
        assertEquals(24000,  HiFlight.getLCM(),"Error in getLCM");
        assertEquals(192000, Iridescent.getLCM(),"Error in getLCM");
        assertEquals(160000, Titanium.getLCM(),"Error in getLCM");

    }

}
