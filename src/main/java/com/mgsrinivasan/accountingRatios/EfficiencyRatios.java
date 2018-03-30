/*
Efficiency ratios 
measure the ability of a business to use its assets and liabilities to
generate sales. 

A highly efficient organization 
	minimized its net investment in assets,
		requires less capital and debt in order to remain in operation. 

assets: efficiency ratios compare an aggregated set of assets to sales or the cost of goods sold. 

liabilities: the main efficiency ratio compares payables to total purchases from suppliers.

source: http://www.accountingtools.com
*/

package accountingRatios;

public class EfficiencyRatios {

/*
Accounts receivable turnover. 
= credit sales / average accounts receivable [(begAR + endAR)/2]. 

high turnover rate achieved by: 
	being selective about only dealing with high-grade customers
	limiting amount of credit granted  
	engaging in aggressive collection activities.
*/ 
   public float accountsReceivableTurnover(float creditSales, float begAR, float endAR){
        return creditSales / avgAR(begAR,endAR);
    }

   public float avgAR(float begAR, float endAR) {
	   return (begAR + endAR) / 2;   
   } 
   
   
/*
Inventory turnover. 
= cost of goods sold (COGS) / average inventory. 

A high turnover rate achieved by:
	minimizing inventory levels,
	using a just-in-time production system, and 
	using common parts for all products manufactured
*/
    public float inventoryTurnover(float COGS, float begInv, float endInv){
        return (COGS / avgInv(begInv, endInv));
    }	

    public float avgInv(float begInv, float endInv){
    	return (begInv + endInv) / 2;    	
    }
    
    
/*
Fixed asset turnover. 
= sales / average fixed assets

A high turnover ratio achieved by:
outsourcing the more asset-intensive production to suppliers, 
maintaining high equipment utilization levels, and
avoiding investments in excessively expensive equipment.
*/
    public float fixedAssetTurnover(float sales, float begFixedAssets, float endFixedAssets) {
        return sales / avgFixedAssets(begFixedAssets, endFixedAssets);
    }	
    
    public float avgFixedAssets(float begFixedAssets, float endFixedAssets){
    	return (begFixedAssets + endFixedAssets) / 2;    	
    }
    
			
/*
Accounts payable turnover. 
total purchases from suppliers / average payables. 

Changes to this ratio are limited by the underlying payment
terms agreed to with suppliers.
*/

    public float acctsPayableTurnover(float ttlPurchasesFromSuppliers, float begPayables, float endPayables) {
        return ttlPurchasesFromSuppliers / avgPayables(begPayables, endPayables);
    }	
    
    public float avgPayables(float begPayables, float endPayables){
    	return (begPayables + endPayables) / 2;    	
    }
}
