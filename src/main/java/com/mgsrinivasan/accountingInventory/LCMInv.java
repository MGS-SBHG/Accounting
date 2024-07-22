// Updated to Maven and JUnit 5

/*
Lower of cost or market (LCM) rule 
	a business must record the cost of inventory at whichever cost is lower – 
		the original cost or
		its current market price 

inventory held for a long time:
	has deteriorated
or 	has become obsolete, 
or 	market prices have declined. 

Generally Accepted Accounting Principles (GAAP) accounting framework.

“current market price”: the current replacement cost of the inventory
	not exceed net realizable value; 
	not be less than the (net realizable value - the normal profit margin) 

Net realizable value = (estimated selling price - estimated costs of completion and disposal)

Additional factors to consider when applying the lower of cost or market rule:

Analysis by category. 
	normally apply the lower of cost or market rule to a specific inventory item, 
	but can apply it to entire inventory categories. 
		an LCM adjustment can be avoided if there is 
			a balance within an inventory
			category of items having market below cost and in excess of cost.

Hedges. 
	If inventory is being hedged by a fair value hedge, then add the effects of the hedge to the cost of the inventory, which
frequently eliminates the need for a lower of cost or market adjustment.

Last in, first out layer recovery. 
	You can avoid a write-down to the lower of cost or market in an interim period if there is
substantial evidence that inventory amounts will be restored by year end, thereby avoiding recognition of an earlier inventory
layer.

Raw materials. 
	Do Not write down the cost of raw materials if the finished goods in which they are used are expected to sell
either at or above their costs.

Recovery. 
	You can avoid a write-down to the lower of cost or market if there is substantial evidence that market prices will
increase before you sell the inventory.

Sales incentives. 
	If there are unexpired sales incentives that will result in a loss on the sale of a specific item, this is a strong
indicator that there may be a lower of cost or market problem with that item.

*/


package com.mgsrinivasan.accountingInventory;

public class LCMInv{

// fields
	int QtyOnHand;
	float UnitCost; 
	float ReplacementCost;
	float InvAtCost;
	
	float MktCostPerUnit;
	float InvAtMkt;
	
	float NRV_Ceiling;
	float NormalProfit;
	
	float LCM_unit_cost; 
	float InvAtLCM;
	
public LCMInv(int qty, float cost){
	QtyOnHand = qty;
	UnitCost = cost; 
}

public void setQtyOnHand(int units){
	QtyOnHand = units;
	}
 	
public int getQtyOnHand(){
	return QtyOnHand;
	}


public void setUnitCost(float cost){
	UnitCost = cost;
	}
 	
public float getUnitCost(){
	return UnitCost;
	}


public void setInvAtCost(){
	InvAtCost = QtyOnHand * UnitCost;
	}
 	
public float getInvAtCost(){
	return InvAtCost;
	}

public void setMktCostPerUnit(float cost){
	MktCostPerUnit = cost;
	}

public float getMktCostPerUnit(){
	return MktCostPerUnit;	
	}

public void setInvAtMkt(){
	InvAtMkt = QtyOnHand * MktCostPerUnit;
	}

public float getInvAtMkt(){
	return InvAtMkt;
	}


public float getMktCostPerUnit2(){
	float rc = 0;
	if (ReplacementCost > NRV_Ceiling){		
		rc =  MktCostPerUnit;}
	else if (ReplacementCost < (NRV_Ceiling - NormalProfit)){
		rc = (NRV_Ceiling - NormalProfit);}
	return rc;
	}

public void setLCMcost(){
	if (UnitCost < MktCostPerUnit)
		LCM_unit_cost = UnitCost;	
	else	
		LCM_unit_cost = MktCostPerUnit; 
	}

public float getLCM(){
	return QtyOnHand * LCM_unit_cost;
}


public float getNRVCeiling(float sellPrice, float sellCosts, float costsToComplete){
	NRV_Ceiling = sellPrice - sellCosts - costsToComplete; 
	return NRV_Ceiling;
	}

public float getFloor(){
	return NRV_Ceiling - NormalProfit;
	}

}
