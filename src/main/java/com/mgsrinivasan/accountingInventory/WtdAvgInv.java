// Updated to Maven and JUnit 5

/*
Weighted Average Method
used to assign the average cost of production to a product. 

commonly used in situations where:
	The accounting system is not sufficiently sophisticated to track FIFO or LIFO inventory layers.
	Not possible to assign a specific cost to an individual unit.
		Inventory items are so intermingled  
		Inventory items are so commoditized (i.e. identical to each other)

Using: 

beginning inventory 
+ net purchases
------------------------------------- 
cost of goods available for sale (COGAS) 
/ number of units available for sale
-------------------------------------
the weighted-average cost per unit. 
	to assign a cost to both ending inventory and the cost of goods sold.

The net result of using weighted average costing:
	the recorded amount of inventory on hand represents a value somewhere between oldest and newest units purchased in stock. 

	the cost of goods sold will reflect a cost somewhere between that of the oldest and newest units sold during the period.

allowed under both 
	Generally Accepted Accounting Principles (GAAP) 
	International Financial Reporting Standards (IFRS)

source: http://www.accountingtools.com/weighted-average-method
*/

package com.mgsrinivasan.accountingInventory;

public class WtdAvgInv{

// fields
	private static int mBegInvQty;
	private static float mBegInvCost;
	private static float mBegInvTtlCost;

	private static int mNetPurchasesQty;
	private static float mNetPurchasesUnitCost;
	private static float mNetPurchasesTtlCost;	
	
	private static int mSalesQty;
	private static float mSalesUnitCost;

	private static int mCOGASQty;
	private static float mCOGASCost;	

	private static int mCOGSUnits;	
	private static int mEndInvUnits;

	private static int ttlPrchBegInvUnits; // total of all purchased or beginning inventory units

// constructor
    public WtdAvgInv(int units, float cost){
	mBegInvQty = units;
	mBegInvCost = cost;
	mBegInvTtlCost = mBegInvQty * mBegInvCost; 
    }
	
    public float getBegInvTtlCost(){
    	return mBegInvTtlCost;	        
    }
    
    public void setWtdAvgPurchase(int units, float unitCost){
	mNetPurchasesQty = units;
	mNetPurchasesUnitCost = unitCost;
	mNetPurchasesTtlCost = mNetPurchasesQty * mNetPurchasesUnitCost;
    }

    public int getWtdAvgPurchase(){
	return mNetPurchasesQty;	        
    }
			
    public float getWtdAvgCOGAS(){
        mCOGASCost = (mBegInvTtlCost + mNetPurchasesTtlCost); 	
	return mCOGASCost;	
    }

    public int getWtdAvgTtlUnits(){
	ttlPrchBegInvUnits = mBegInvQty + mNetPurchasesQty; 
        return ttlPrchBegInvUnits;
    }

    public void setWtdAvgEndInv(int units){
    	mEndInvUnits = units;
    }

    public int getWtdAvgEndInv(){
        return mEndInvUnits;
    }
}
