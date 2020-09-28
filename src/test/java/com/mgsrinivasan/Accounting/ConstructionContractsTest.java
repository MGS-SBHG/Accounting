package com.mgsrinivasan.Accounting;

import com.mgsrinivasan.construction.ConstructionContracts;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ConstructionContractsTest {

	static ConstructionContracts[] xyzConstruction = new ConstructionContracts[4];
	
    @Before
    public void setup() 
    {
    	xyzConstruction[0] = new ConstructionContracts(1_500_000, 350_000, 1_000_000,   300_000,    270_000);
    	xyzConstruction[1] = new ConstructionContracts(1_500_000, 550_000, 	 460_000,   575_000,    555_000);
    	xyzConstruction[2] = new ConstructionContracts(1_500_000, 465_000,         0,   625_000,    675_000);
    	xyzConstruction[3] = new ConstructionContracts(1_500_000, 1_365_000,       0, 1_500_000,  1_500_000);
    }
            
    @Test
    public void getContractPriceTest() 
    {	
    	double expectedValueYr1 = 1_500_000;
    	
    	assertTrue("Error in Yr 1 ContractPriceTest" , expectedValueYr1 == xyzConstruction[0].getContractPrice());
    	assertTrue("Error in Yr 2 ContractPriceTest" , expectedValueYr1 == xyzConstruction[1].getContractPrice());	
    	assertTrue("Error in Yr 3 ContractPriceTest" , expectedValueYr1 == xyzConstruction[2].getContractPrice());	
    	assertTrue("Error in Yr 4 ContractPriceTest" , expectedValueYr1 == xyzConstruction[3].getContractPrice());	
    } // getContractPriceTest()
    
    
    @Test
    public void setCostsIncurredEachYrTest() 
    {	
    	double expectedValueYr1 = 350_000;    	
    	double expectedValueYr2 = 550_000;
    	double expectedValueYr3 = 465_000;    	
    	double expectedValueYrTtl = expectedValueYr1 + expectedValueYr2 + expectedValueYr3;
  
    	assertTrue("Error in Yr 1 CostsIncurredEachYr Test" , expectedValueYr1 == xyzConstruction[0].getCostsIncurredEachYr());    	
    	assertTrue("Error in Yr 2 CostsIncurredEachYr Test" , expectedValueYr2 == xyzConstruction[1].getCostsIncurredEachYr());	
    	assertTrue("Error in Yr 3 CostsIncurredEachYr Test" , expectedValueYr3 == xyzConstruction[2].getCostsIncurredEachYr());	
    	assertTrue("Error in Ttl CostsIncurredEachYr Test" , expectedValueYrTtl == xyzConstruction[3].getCostsIncurredEachYr());
    	
    } // getContractPriceTest()
    
    @Test
    public void getEstCostsToCompleteYrEndTest() 
    {	
    	double expectedValueYr1 = 1_000_000;    	
    	double expectedValueYr2 = 460_000;
    	double expectedValueYr3 = 0;    	
    	
    	assertTrue("Error in Yr 1 EstCostsToCompleteYrEnd Test" , expectedValueYr1 == xyzConstruction[0].getEstCostsToCompleteYrEnd());    	
    	assertTrue("Error in Yr 2 EstCostsToCompleteYrEnd Test" , expectedValueYr2 == xyzConstruction[1].getEstCostsToCompleteYrEnd());	
    	assertTrue("Error in Yr 3 EstCostsToCompleteYrEnd Test" , expectedValueYr3 == xyzConstruction[2].getEstCostsToCompleteYrEnd());	
    	
    } // EstCostsToCompleteYrEndTest 
    
    @Test
    public void getProgressBillingsEachYrTest() 
    {	
    	double expectedValueYr1 = 300_000;    	
    	double expectedValueYr2 = 575_000;
    	double expectedValueYr3 = 625_000;    	
    	double expectedValueTtl = expectedValueYr1 + expectedValueYr2 + expectedValueYr3;    
    	
    	assertTrue("Error in Yr 1 setProgressBillingsEachYr Test" , expectedValueYr1 == xyzConstruction[0].getProgressBillingsEachYr());    	
    	assertTrue("Error in Yr 2 setProgressBillingsEachYr Test" , expectedValueYr2 == xyzConstruction[1].getProgressBillingsEachYr());	
    	assertTrue("Error in Yr 3 setProgressBillingsEachYr Test" , expectedValueYr3 == xyzConstruction[2].getProgressBillingsEachYr());	
    	assertTrue("Error in Ttl setProgressBillingsEachYr Test" , expectedValueTtl == xyzConstruction[3].getProgressBillingsEachYr());	
    	
    } // getProgressBillingsEachYrTest 
    
    @Test
    public void getCollectionsOnBillingsEachYrTest() 
    {	
    	double expectedValueYr1 = 270_000;    	
    	double expectedValueYr2 = 555_000;
    	double expectedValueYr3 = 675_000;    	
    	double expectedValueTtl = expectedValueYr1 + expectedValueYr2 + expectedValueYr3;    	
  	
    	assertTrue("Error in Yr 1 setCollectionsOnBillingsEachYr Test" , expectedValueYr1 == xyzConstruction[0].getCollectionsOnBillingsEachYr());    	
    	assertTrue("Error in Yr 2 setCollectionsOnBillingsEachYr Test" , expectedValueYr2 == xyzConstruction[1].getCollectionsOnBillingsEachYr());	
    	assertTrue("Error in Yr 3 setCollectionsOnBillingsEachYr Test" , expectedValueYr3 == xyzConstruction[2].getCollectionsOnBillingsEachYr());	
    	assertTrue("Error in Ttl setCollectionsOnBillingsEachYr Test" , expectedValueTtl == xyzConstruction[3].getCollectionsOnBillingsEachYr());	
    	
    } // getCollectionsOnBillingsEachYrTest 
    
    @Test
    public void completedContractTest() 
    {
    	double expectedValueRecognizedIncome = 135_000;
    	
    	/*
    	System.out.println("Contract Price: " + xyzConstruction[3].getContractPrice());
    	System.out.println("Ttl Costs Incurred Each Year: " + xyzConstruction[3].getCostsIncurredEachYr());
    	System.out.println("Recognized Income: " + xyzConstruction[3].completedContract());
    	*/
    	
    	assertTrue("Error in completedContractTest" , expectedValueRecognizedIncome == xyzConstruction[3].completedContract());	
    }
    

    @Test 
    public void setActualCostToDateTest(){

    	xyzConstruction[0].setActualCostToDate(xyzConstruction[0].getCostsIncurredEachYr());
    	System.out.println(xyzConstruction[0].getActualCostToDate());
    	
    	xyzConstruction[1].setActualCostToDate(xyzConstruction[1].getCostsIncurredEachYr());   
    	System.out.println(xyzConstruction[1].getActualCostToDate());
    	
    	xyzConstruction[2].setActualCostToDate(xyzConstruction[2].getCostsIncurredEachYr());    	
       	System.out.println(xyzConstruction[2].getActualCostToDate());
    	    	
    }
    
    @Test 
    public void setEstTtlCosts(){
    	
    	System.out.println(xyzConstruction[0].getActualCostToDate() + " " + xyzConstruction[0].getEstCostsToCompleteYrEnd());
    	System.out.println(xyzConstruction[1].getActualCostToDate() + " " + xyzConstruction[0].getEstCostsToCompleteYrEnd());
    	System.out.println(xyzConstruction[2].getActualCostToDate() + " " + xyzConstruction[0].getEstCostsToCompleteYrEnd());
    	
    	xyzConstruction[0].setEstTtlCosts();
    	xyzConstruction[1].setEstTtlCosts();
    	xyzConstruction[2].setEstTtlCosts();
   	
    	System.out.println(xyzConstruction[0].getEstTtlCosts());
    	System.out.println(xyzConstruction[1].getEstTtlCosts());
    	System.out.println(xyzConstruction[2].getEstTtlCosts());
    	
    }
}
