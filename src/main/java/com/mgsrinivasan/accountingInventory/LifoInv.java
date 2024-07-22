
// Updated to Maven and JUnit 5

/*
Last-in, First-out(LIFO) method
 inventory accounting value.
assumption: the last item of inventory purchased is the first one sold. 
	
rarely encountered in practice. 
a significant part of its inventory would be very old, and likely obsolete. 

Effects of LIFO Inventory Accounting: assumption that the cost of inventory increases over time, which is a reasonable
assumption in times of inflating prices. 
	the cost of the most recently acquired inventory will always be higher than the cost of earlier purchases, 
	ending inventory balance will be valued at earlier costs, 
	the most recent costs appear in the cost of goods sold. 

	By shifting high-cost inventory into the cost of goods sold, a company can reduce its reported level of profitability;
		defer its recognition of income taxes. 

Income tax deferral is the only justification for LIFO in most situations 
	banned International Financial Reporting Standards(IFRS).
	allowed in United States Internal Revenue Service).

source: http://www.accountingtools.com/lifo-method
*/

package com.mgsrinivasan.accountingInventory;

public class LifoInv{

	private int mBegInvQty;
	private float mBegInvCost;

	private int mPurchasesQty;
	private float mPurchasesUnitCost;
	
	private int mCOGSUnits;	
	private int mEndInv;

	
    public void setLifoBegInv(int units, float unitCost){
    	mBegInvQty = units;
    	mBegInvCost = unitCost;
    }

    public void setLifoPurchase(int units, float unitCost){
	mPurchasesQty = units;
	mPurchasesUnitCost = unitCost;	        
    }
			
    public int getLifoCOGSUnits(){
        mCOGSUnits = mBegInvQty + mPurchasesQty - mEndInv;
	return mCOGSUnits;	
    }


    public void setLifoEndInv(int units){
         mEndInv = units;
    }

    public int getLifoEndInv(){
        return mEndInv;
    }
}
