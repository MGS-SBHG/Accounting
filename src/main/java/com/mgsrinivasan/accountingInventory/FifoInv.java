// Updated to Java 12, Maven, JUnit 5

/*
First-in, First-Out(FIFO) method of inventory valuation 
	a cost flow assumption: 
	first goods purchased are also the first goods sold. 

Goods from BI and earlier purchases
	assumed to be the goods sold first
During inflation (rising prices),
	COGS is made up of earlier lower-priced goods;
	GP is higher
EI represents a more current value on BS
Can be used even if does not match physical flow of goods
Inventory and COGS are the same for periodic and perpetual systems


In most companies, closely matches the actual flow of goods;
considered the most theoretically correct inventory valuation method. 
	selling off the oldest goods first reduces the risk of obsolescence.

the earliest goods purchased are the first ones removed from the inventory account. 

remaining items in inventory being accounted for at the most recently incurred costs; 
	the inventory asset recorded on the balance sheet contains costs quite close to the 
		most recent costs that could be obtained in the marketplace. 

Conversely, results in older historical costs being matched against current revenues and 
	recorded in the cost of goods sold; 
	the gross margin does Not necessarily reflect a proper matching of revenues and costs. 
	i.e. in an inflationary environment, current-cost revenue dollars will be matched 
		against older and lower-cost inventory items, which yields the highest possible gross margin.

Allowed under both Generally Accepted Accounting Principles (GAAP) and 
	International Financial Reporting Standards (IFRS). 

Same results under either the periodic or perpetual inventory system. 

source: http://www.accountingtools.com/fifo-method
*/

package com.mgsrinivasan.accountingInventory;

public class FifoInv{

	public int 		mBegInvQty;
	public double 	mBegInvUnitCost;
	public double 	mBegInvCost;
	
	public int 		mPurchasesQty;
	public double 	mPurchasesUnitCost;
	public double 	mFifoLayerCost;
	
	public int 		mSoldQty;
	public double 	mSoldUnitCost;
	public double 	mSoldCost;
	
	public int 		mCOGSUnits;	
	public double 	mCOGS;
	
	public int 		mEndInvQty;
	public double 	mEndInvCost;
	
	
    public void setFifoBegInv(int units, double unitCost){
    	this.mBegInvQty = units;
    	this.mBegInvUnitCost = unitCost;
    	
    	this.mBegInvCost = units * unitCost;
    }

	public double getFifoBegInv() {
		return this.mBegInvCost;
	}
    
    public void setFifoPurchase(int units, double unitCost){
    	this.mPurchasesQty = units;
    	this.mPurchasesUnitCost = unitCost;
	
    	this.mFifoLayerCost = units * unitCost;
    }

    
    public double getFifoLayerCost(){
    	return this.mFifoLayerCost;
    }
    
    
    public int getFifoCOGSUnits(){
		System.out.println(this.mCOGSUnits);

		System.out.println(this.mSoldQty);

		this.mCOGSUnits += this.mSoldQty;

		System.out.println(this.mCOGSUnits);

		//mCOGSUnits = mBegInvQty + mPurchasesQty - mEndInvQty;

        return this.mCOGSUnits;
    }
    
    public void setFifoEndInv(){
         this.mEndInvQty = this.mBegInvQty + this.mPurchasesQty - this.mCOGSUnits;
    }

    
    public int getFifoEndInv(){
        return this.mEndInvQty;
    }
    
}
