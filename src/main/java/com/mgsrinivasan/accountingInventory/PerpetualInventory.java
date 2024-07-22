// Updated to Maven and JUnit 5

/*
Perpetual inventory system
	an entity continually updates its inventory records to account for additions to and subtractions from inventory. 
activities:
Received inventory items
Goods sold from stock
Items moved from one location to another
Items picked from inventory for use in the production process
Items scrapped

advantages of both 
	providing up-to-date inventory balance information and 
	requiring a reduced level of physical inventory counts. 

May gradually diverge from actual inventory levels, due to unrecorded transactions or theft

Periodically compare book balances to actual on-hand quantities, and 
adjust the book balances as necessary.

The preferred method for tracking inventory since it can yield reasonably accurate results on an ongoing basis, if properly managed. 

Works best when coupled with a computer database of inventory quantities and bin locations updated in real time by 
	the warehouse staff using wireless bar code scanners 
	Or by sales clerks using point of sale terminals.

Least effective when changes are recorded on inventory cards, since there is a significant chance that entries will not be made, will be made incorrectly, or will not be made in a timely manner.

The perpetual inventory system is a requirement for any organization planning to install a material requirements planning system.

source: http://www.accountingtools.com/perpetual-inventory
*/

package com.mgsrinivasan.accountingInventory;

public class PerpetualInventory{

	private float inventory;
	private float accounts_payable;
	private float accounts_receivable;
	private float sales_revenue;
	private float cost_of_goods_sold;
	private float inventory_shrinkage_expense;

/*
record a purchase of $1,500 of widgets that are stored in inventory:
Debit
Inventory 1,500
Credit
	Accounts payable 1,500
*/

public void recordPurchase(float inv, float ap){
	setInventory(inv);
	setAccountsPayable(ap);
	} 

/*
record $300 of inbound freight cost associated with the delivery of inventory:
Debit
Inventory 300
Credit
	Accounts payable 	300
*/
    public void recordInboundFreightCost(float inv, float ap){
	setInventory(inv);
	setAccountsPayable(ap);
	} 

/*
record a sale of widgets from inventory for $3,000, for which the associated inventory cost is $1,800:
Debit
Accounts receivable 3,000
	Revenue			3,000

Cost of goods sold 1,800
	Inventory		1,800
*/

    public void recordSale(float ar, float sales, float cogs, float inv){
	setAccountsReceivable(ar);	
	setSalesRevenue(sales);

	setInventory(inv);
	setCostOfGoodsSold(cogs);

	setInventory(-(inv));
	} 

/*
record downward inventory adjustment of $800, caused by inventory theft, and detected during an inventory count:
Inventory shrinkage expense 800
	Inventory		800
*/

    public void recordInvAdj(float invAdj, float inv){
	setInvShrinkExp(invAdj);
	setInventory(-(inv));
	} 


    public void setInventory(float inv){
        inventory += inv;
    }

    public float getInventory( ){
        return inventory;
    }	

    public void setAccountsPayable( float ap){
        accounts_payable += ap;
    }

    public float getAccountsPayable( ){
        return accounts_payable;
    }	

   public void setAccountsReceivable( float ar){
        accounts_receivable += ar;
    }

    public float getAccountsReceivable( ){
        return accounts_receivable;
    }	

  public void setSalesRevenue(float sales){
        sales_revenue += sales;
    }

    public float getSalesRevenue( ){
        return sales_revenue;
    }	


  public void setCostOfGoodsSold(float cogs){
        cost_of_goods_sold += cogs;
    }

    public float getCostOfGoodsSold( ){
        return cost_of_goods_sold;
    }	

    public  void setInvShrinkExp(float invShrinkExp){
        inventory_shrinkage_expense += invShrinkExp;
    }

    public float getInvShrinkExp( ){
        return inventory_shrinkage_expense;
    }	

}
