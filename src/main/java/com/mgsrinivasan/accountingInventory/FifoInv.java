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

	public int 		unitQty;
	public double 	unitCost;
	public double 	invCost;

	public int costOfGoodsSoldUnits;
	public double costOfGoodsSold;

	public int EndingInvUnits;
	public double EndingInv;

	public FifoInv(int unitQty, double unitCost, double invCost){
		this.unitQty = unitQty;
		this.unitCost = unitCost;
		this.invCost = invCost;
	};

    public void setInvLayer(int units, double unitCost){
    	this.unitQty = units;
    	this.unitCost = unitCost;

		this.invCost = units * unitCost;

		if (units < 0) {
			this.costOfGoodsSoldUnits += unitQty;
			this.costOfGoodsSold += this.invCost;
		}
		else {
			this.EndingInvUnits += unitQty;
			this.EndingInv += this.invCost;
		}
	} // setInvLayer

	public double getInvLayer() {
		return this.invCost;
	}

    public int getFifoCOGSUnits(){
//		System.out.println(this.costOfGoodsSoldUnits);
		return this.costOfGoodsSoldUnits;
    }

	public double getFifoCOGSold(){
//		System.out.println(this.costOfGoodsSold);
		return this.costOfGoodsSold;
	}

	public int getFifoEndInvUnits(){
//		System.out.println(this.EndingInvUnits);
		return this.EndingInvUnits;
	}

    public double getFifoEndInv(){
//		System.out.println(this.EndingInv);
		return this.EndingInv;
    }
    
}
